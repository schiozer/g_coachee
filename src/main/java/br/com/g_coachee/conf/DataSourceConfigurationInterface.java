package br.com.g_coachee.conf;

import java.util.Properties;

import javax.sql.DataSource;

public interface DataSourceConfigurationInterface {
	
	public DataSource getDataSource();
		
	public Properties getAdditionalProperties();


}
