package com.test;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
//		3. 使用步骤:
//			3.1 导入log4j-xxx.jar
//			3.2 在src 下新建log4j.properties(路径和名称都不允许改变)
		
		
//		4. log4j 输出级别
//			4.1 fatal(致命错误) > error (错误) > warn (警告) > info(普通信息) > debug(调试信息)
//		4.2 在log4j.properties 的第一行中控制输出级别
//		5. log4j 输出目的地
//			5.1 在第一行控制输出目的地
//		6. pattern 中常用几个表达式
//			6.1 %C 包名+类名
//			6.2 %d{YYYY-MM-dd HH:mm:ss} 时间
//			6.3 %L 行号
//			6.4 %m 信息
//			6.5 %n 换行
		
		Logger logger = Logger.getLogger(Test.class);
		logger.debug("这是一个调试信息");
		logger.info("这是一个info信息");
		
		try {
			int a = 5/0;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
//		3.log4j 中可以输出指定内容的日志(控制某个局部内容的日志级别)
//			3.1.1 先在总体级别调成Error 不输出无用信息
//			3.1.2 在设置某个指定位置级别为DEBUG
	}

}
