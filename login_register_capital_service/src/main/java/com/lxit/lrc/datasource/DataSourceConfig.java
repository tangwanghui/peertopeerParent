package com.lxit.lrc.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {

	
	@Bean(name = "titanMasterDS")
	@ConfigurationProperties(prefix = "spring.datasource.titan-master") // application.properteis中对应属性的前缀
	public DataSource dataSource1() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "ds2")
	@ConfigurationProperties(prefix = "spring.datasource.db2") // application.properteis中对应属性的前缀
	public DataSource dataSource2() {
		return DataSourceBuilder.create().build();
	}


	@Bean(name = "dynamicDS1")
	public DataSource dataSource() {
		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		dynamicDataSource.setDefaultTargetDataSource(dataSource1());
		Map<Object, Object> dsMap = new HashMap(5);
		dsMap.put("titan-master", dataSource1());
		dsMap.put("ds2", dataSource2());

		dynamicDataSource.setTargetDataSources(dsMap);

		return dynamicDataSource;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({
	        ElementType.METHOD
	})
	public @interface DS {
	    String value() default "ds2";
	}

}
