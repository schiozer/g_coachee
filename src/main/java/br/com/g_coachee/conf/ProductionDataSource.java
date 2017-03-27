package br.com.g_coachee.conf;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@Profile("prod")
public class ProductionDataSource implements DataSourceConfigurationInterface {

	@Bean
	public DataSource getDataSource() {
		
		
		System.out.println("Pegando Data Source de PROD");
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/g_coachee");
		dataSource.setUsername( "g_coachee" );
		dataSource.setPassword( "g_coachee" );
		
		return dataSource;
	}
	
	@Bean
	public Properties getAdditionalProperties() {
		
		Properties properties = new Properties();
		
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.hbm2ddl", "update");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		
		return properties;
	}
}
