package com.sample.springboot.basics.springbootBasics;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
//@ConfigurationProperties(value="appla")
public class JavaConfig {

	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Bean
	public DataSource getDataSource() {
		DataSource dataSource = DataSourceBuilder
				.create()
				.username(username)
				.password(password)
				.url(url)
				.driverClassName(driverClassName)
				.build();
		return dataSource;
	}
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource()); // construction injection
		
		return jdbcTemplate;
	}

}
