package com.example.configurations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.example"})
public class AppConfig implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		
		InternalResourceViewResolver obj=	new InternalResourceViewResolver();
		obj.setPrefix("/WEB-INF/views/");
		obj.setSuffix(".jsp");
		
		return obj ;
	}
	
	
	
	@Bean
	public JdbcTemplate jcbdTemplate(DataSource dataSource)
	{
		JdbcTemplate jdbcObj=new JdbcTemplate(dataSource);
		
		return jdbcObj;
	}
	
	@Bean
	public DataSource dataSourceConnectionSetup()
	{
		DriverManagerDataSource obj=new DriverManagerDataSource();
		obj.setUsername("root");
		obj.setPassword("root");
		obj.setUrl("jdbc:mysql://localhost:3306/studentdb?useSSL=false");
		obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return obj;
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry
		.addResourceHandler("/URLtoHandleResourcesFolder/**")
		.addResourceLocations("/resources/css/");
		
		registry.addResourceHandler("/URLtoreachImagesFolder/**")
		.addResourceLocations("/resources/images/");
		
		
	}
	
	
	

}
