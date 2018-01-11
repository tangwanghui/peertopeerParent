package com.lxit.lrc.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceContextHolder {
	public static final Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

	/**
	 * 默认数据�?
	 */
	public static final String DEFAULT_DS = "titan-master";

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

	// 设置数据源名
	public static void setDB(String dbType) {
		log.debug("�л���{}����Դ", dbType);
		contextHolder.set(dbType);
	}

	// 获取数据源名
	public static String getDB() {
		return (contextHolder.get());
	}

	// 清除数据源名
	public static void clearDB() {
		contextHolder.remove();
	}
}
