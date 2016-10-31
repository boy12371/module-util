package io.swagger.util.common1.network;

import java.io.File;

import org.junit.Test;

import io.swagger.util.common1.network.VolansUtil;

public class TestVolans1 {
	@Test
	public void TestUploadFileByGa(){
		String filePath = "D:/fss/download/ga/20131207/";
		//String trdFileId0 = "Gac.Fss.trdreq.20131207.0";
		String trdFileId1 = "Gac.Fss.trdreq.20131207.1";
		File readfile = new File(filePath + trdFileId1);
		try {
			String rowKey = VolansUtil.upload(readfile, trdFileId1);
			System.out.println(rowKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestDownloadFileByFss(){
		String filePath = "D:/fss/download/ga/20131207/";
		//String trdFileId0 = "Gac.Fss.trdreq.20131207.0";
		String trdFileId1 = "Gac.Fss.trdreq.20131207.1";
		try {
			VolansUtil.download("Fss", trdFileId1, filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
