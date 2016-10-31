package io.swagger.util.common1.network;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyUtil {
	
	static public String printStackTrace(Exception e) {
		
		StackTraceElement[] trace = e.getStackTrace();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(e.getClass().toString());
		
		if(e.getMessage() != null) {
			sb.append(": ");
			sb.append(e.getMessage());
		}
		
		for(int i = 0; i < trace.length; i++) {
			sb.append("\n\t");
			sb.append(trace[i].toString());
		}
		
		sb.append("\n");
		
		return sb.toString();
	}

	static public String printStackTrace(Throwable t) {
		
		StackTraceElement[] trace = t.getStackTrace();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(t.getClass().toString());
		
		if(t.getMessage() != null) {
			sb.append(": ");
			sb.append(t.getMessage());
		}
		
		for(int i = 0; i < trace.length; i++) {
			sb.append("\n\t");
			sb.append(trace[i].toString());
		}
		
		sb.append("\n");
		
		return sb.toString();
	}
	
	static public String getClassName(String className) {
		return className.substring(className.lastIndexOf(".")+1);
	}

	public static Properties getProperty(String configName)
			throws IOException {
		
		return getProperty(configName, false);
	}
	
	public static Properties getProperty(String configName, boolean isResource)
			throws IOException {
		
		InputStream stream;
		Properties properties = new Properties();
		
//		String osname = System.getProperty("os.name");
		String home = System.getProperty("user.home");
		String cfgnm = configName;
	
//		if(osname.toLowerCase().startsWith("win")) {
//			cfgnm = cfgnm.trim() + ".win";
//		}
		
		if(isResource) {
			stream = (new MyUtil()).getClass().getResourceAsStream(
					"/" + cfgnm);
		}
		else {
			stream = new FileInputStream(home + SystemConstant.CFG_PATH + cfgnm);
		}

		try {
			properties.load(stream);
		} finally {
			if (stream != null)
				stream.close();
		}
	
		return properties;
	}
	
	public static String getProperty(String configName, String key,
			String defaultValue) throws IOException {
		
		return getProperty(configName, key, defaultValue, false);
	}
	
	public static String getProperty(String configName, String key,
			String defaultValue, boolean isResource) throws IOException {

		return getProperty(configName, isResource).getProperty(key,
				defaultValue);
	}	
	
	public static String trim(String string) {
		if (string == null) {
			return "";
		}
		return string.trim();
	}
	
}
