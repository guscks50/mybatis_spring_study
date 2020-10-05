package mybatis_spring_study.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Import({ ContextDataSource.class,ContextSqlSession.class })
public class ContextRoot {
	
	
	public DataSource dataSource() {

	HikariDataSource dataSource =null;
	try{
		Properties prop = Resources.getResourceAsProperties("application.properties");
		HikariConfig cfg = new HikariConfig(prop);
		dataSource = new HikariDataSource(cfg);
		dataSource.setMinimumIdle(10);
		dataSource.setMaximumPoolSize(100);
	}catch(
	IOException e)
	{
		e.printStackTrace();
	}
	return dataSource;
}

}