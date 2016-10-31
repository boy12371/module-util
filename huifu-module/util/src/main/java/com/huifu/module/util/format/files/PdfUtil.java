package com.huifu.module.util.format.files;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.module.util.format.model.PdfInfoMO;
import com.huifu.module.util.format.model.TableMO;
import com.huifu.module.util.format.model.TemplateMO;
import com.huifu.module.util.format.time.DateUtils;
import com.huifu.module.util.io.constant.ConfigConstants;
import com.huifu.module.util.io.constant.SystemConstants;
import com.huifu.pyxis.client.PyxisConfig;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfUtil {
	private static final Logger logger = LoggerFactory.getLogger(PdfUtil.class);

	// pdf文件保存路径
	private final static String PDF_PATH = PyxisConfig.getInstance().getProperty(ConfigConstants.APP_PDF_PATH)
			.toString();
	// txt模板文件路径
	private final static String TXT_TEMPLATE_PATH = PyxisConfig.getInstance()
			.getProperty(ConfigConstants.TXT_TEMPLATE_PATH).toString();
	// txt模板文件名
	private final static String TXT_TEMPLATE_NAME = PyxisConfig.getInstance()
			.getProperty(ConfigConstants.TXT_TEMPLATE_NAME_DEFAULT).toString();
	// 标题格式
	private static volatile Font titleFont = null;
	// 正文格式
	private static volatile Font textFont = null;

	/**
	 * 生成pdf格式文档
	 * 
	 * @author richard
	 * @param pdfInfoMO
	 * @return byte
	 * @since JDK 1.8
	 */
	public static byte[] genPdfFile(PdfInfoMO pdfInfoMO) {
		if (null == pdfInfoMO) {
			return null;
		}
		String pdfParam = JSON.toJSONString(pdfInfoMO);
		logger.info("[传入参数pdfInfoMO是]" + pdfParam);
		if (StringUtils.isBlank(pdfInfoMO.getFileName())) {
			pdfInfoMO.setFileName(SystemConstants.DEFAULT_FILENAME);
		}
		if (StringUtils.isBlank(pdfInfoMO.getTitle())) {
			pdfInfoMO.setTitle(SystemConstants.PDF_DEFAULT_TITLE);
		}

		Document document = new Document(PageSize.A4, 80, 80, 30, 30);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			PdfWriter.getInstance(document, bos);
			PdfWriter.getInstance(document,
					new FileOutputStream(PDF_PATH + pdfInfoMO.getFileName() + DateUtils.getCurrentMiTime() + ".pdf"));
			document.open();
			// title
			Paragraph paragraph = new Paragraph(pdfInfoMO.getTitle(), getTitleFont());
			paragraph.setAlignment(Element.ALIGN_CENTER);
			paragraph.setLeading(30.0f);
			// 生成文档正文
			if (StringUtils.isBlank(pdfInfoMO.getText()) && (null == pdfInfoMO.getTemplateMO())) {
				pdfInfoMO.setText(SystemConstants.PDF_DEFAULT_CONTENT);
				paragraph.add(textByStr(pdfInfoMO.getText()));
			} else if (StringUtils.isNotBlank(pdfInfoMO.getText())) {
				// 通过string生成文档正文
				paragraph.add(textByStr(pdfInfoMO.getText()));
			} else {
				// 通过模板生成文档正文
				paragraph.add(textByTemplate(pdfInfoMO.getTemplateMO()));
			}
			// 生成表格
			if (null != pdfInfoMO.getTableMO()) {
				paragraph.add(genTable(pdfInfoMO.getTableMO()));
			}
			document.add(paragraph);
		} catch (Exception e) {
			logger.error(pdfInfoMO.getTitle() + "pdf格式文档保存出错", e);
			return null;
		} finally {
			if (document != null) {
				document.close();
			}
		}
		logger.info(pdfInfoMO.getTitle() + "pdf格式文档保存成功");
		return bos.toByteArray();
	}

	/**
	 * 获取标题字体格式
	 * 
	 * @author richard
	 * @return Font
	 * @throws DocumentException
	 * @throws IOException
	 * @since JDK 1.8
	 */
	private static Font getTitleFont() throws DocumentException, IOException {
		if (titleFont == null) {
			synchronized (PdfUtil.class) {
				if (titleFont == null) {
					BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
					titleFont = new Font(baseFont, 18, Font.NORMAL);
				}
			}
		}
		return titleFont;
	}

	/**
	 * 获取正文字体格式
	 * 
	 * @author richard
	 * @return textFont
	 * @throws DocumentException
	 * @throws IOException
	 * @since JDK 1.8
	 */
	private static Font getTextFont() throws DocumentException, IOException {
		if (textFont == null) {
			synchronized (PdfUtil.class) {
				if (textFont == null) {
					BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
					textFont = new Font(baseFont, 11, Font.NORMAL);
				}
			}
		}
		return textFont;
	}

	/**
	 * 通过string生成文档正文
	 * 
	 * @author richard
	 * @param String
	 * @return Paragraph
	 * @since JDK 1.8
	 */
	private static Paragraph textByStr(String str) throws DocumentException, IOException {
		Paragraph paragraph = new Paragraph(str, getTextFont());
		paragraph.setAlignment(Element.ALIGN_LEFT);
		paragraph.setLeading(20.0f);
		paragraph.setFirstLineIndent(20.0f);
		return paragraph;
	}

	/**
	 * 通过模板生成文档正文
	 * 
	 * @author richard
	 * @param TemplateMO
	 * @return Paragraph
	 * @since JDK 1.8
	 */
	private static Paragraph textByTemplate(TemplateMO templateMO) throws DocumentException, IOException {
		if (null == templateMO) {
			return null;
		}
		Paragraph paragraph = new Paragraph();
		BufferedReader reader = null;
		try {
			String line = null;
			reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(TXT_TEMPLATE_PATH + TXT_TEMPLATE_NAME), "GBK"));
			while ((line = reader.readLine()) != null) {
				if (StringUtils.isBlank(line)) {
					paragraph.add("\n");
				} else {
					String tempLine = line;
					if ("甲    方：".equals(line)) {
						tempLine += templateMO.getUserName();
					} else if ("身份证号：".equals(line)) {
						tempLine += templateMO.getCertId();
					} else if ("联系地址：".equals(line)) {
						tempLine += templateMO.getUserAddress();
					} else if ("联系电话：".equals(line)) {
						tempLine += templateMO.getUserMobile();
					} else if (StringUtils.isNotBlank(line) && line.contains("{MER_NAME}")) {
						tempLine = line.replace("{MER_NAME}", templateMO.getMerName());
					}
					paragraph.add(new Paragraph(tempLine, getTextFont()));
				}
				paragraph.setAlignment(Element.ALIGN_LEFT);
				paragraph.setLeading(20.0f);
				paragraph.setFirstLineIndent(20.0f);
			}
		} catch (Exception e) {
			logger.error("模板读取出错", e);
			return null;
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				logger.error("缓存关闭出错", e);
				return null;
			}
		}
		paragraph.setAlignment(Element.ALIGN_LEFT);
		paragraph.setLeading(20.0f);
		paragraph.setFirstLineIndent(20.0f);
		return paragraph;
	}

	/**
	 * 生成表格
	 * 
	 * @author richard
	 * @param TableMO
	 * @return PdfPTable
	 * @throws DocumentException
	 * @throws IOException
	 * @since JDK 1.8
	 */
	private static PdfPTable genTable(TableMO tableMO) throws DocumentException, IOException {
		if (null == tableMO) {
			return null;
		}
		PdfPTable table = new PdfPTable(2);
		table.setTotalWidth(300);
		table.setLockedWidth(true);
		table.setTotalWidth(new float[] { 200, 200 });
		table.setLockedWidth(true);
		table.setSpacingBefore(10);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

		Paragraph phrase = new Paragraph(tableMO.getTableTitle(), getTextFont());
		phrase.setAlignment(1);
		PdfPCell cell = new PdfPCell(phrase);
		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		JSONObject tableContentObject = null;
		try {
			tableContentObject = JSON.parseObject(tableMO.getTableContent());
		} catch (Exception e) {
			logger.error("json解析出错原因：", e);
			return null;
		}
		for (Iterator<?> iterator = tableContentObject.keySet().iterator(); iterator.hasNext();) {
			String keyName = (String) iterator.next();
			String valueName = tableContentObject.getString(keyName);
			table.addCell(new Phrase(keyName, getTextFont()));
			table.addCell(makeCellData(valueName));
		}
		return table;
	}

	/**
	 * 填充表格数据
	 * 
	 * @author richard
	 * @param text
	 * @return table
	 * @throws DocumentException
	 * @throws IOException
	 * @since JDK 1.8
	 */
	private static PdfPCell makeCellData(String text) throws DocumentException, IOException {
		Phrase phrase = new Phrase(text, getTextFont());
		PdfPCell cell = new PdfPCell(phrase);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		return cell;
	}
}
