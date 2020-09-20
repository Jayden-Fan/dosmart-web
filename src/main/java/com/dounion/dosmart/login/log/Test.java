package com.dounion.dosmart.login.log;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import ch.qos.logback.core.net.SyslogOutputStream;
/**
 *@author linbingwen
 *@2015年5月18日9:14:21
 */
public class Test {
	private static Logger logger = Logger.getLogger(Test.class);  
 
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // System.out.println("This is println message.");  
        // 记录debug级别的信息  
        /*logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  */
    	
    	
    	double temp = Double.parseDouble(0 + "") / 10;
    	System.out.println(temp);
    	Map<String, Object> data = new HashMap<String, Object>();
    	data.put("1", 99);
    	data.put("2", 0);
    	
    	System.out.println(data.get("1"));
    	System.out.println(data.get("2"));
    	
    }  
 
}
