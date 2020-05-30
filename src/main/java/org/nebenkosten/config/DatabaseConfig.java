package org.nebenkosten.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

	/**
	 * Will be provided remotely. Following env variables
	 * need to be specified in run config for local testing:
	 * SPRING_DATASOURCE_URL
	 * SPRING_DATASOURCE_USERNAME
	 * SPRING_DATASOURCE_PASSWORD
	 */
	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(dbUrl);
		return new HikariDataSource(config);
	}
}
