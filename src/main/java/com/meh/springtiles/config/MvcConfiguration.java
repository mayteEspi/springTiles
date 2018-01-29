package com.meh.springtiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.meh.springtiles")
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	   

	  @Bean
	   public UrlBasedViewResolver viewResolver() {
	        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
	        viewResolver.setOrder(0);
	        viewResolver.setViewClass(TilesView.class);
	        viewResolver.setRequestContextAttribute("requestContext");
	        return viewResolver;
	   }
	  
	  
	  @Bean
	  public TilesConfigurer tilesConfigurer() {
	        TilesConfigurer tilesConfigurer = new TilesConfigurer();
	        tilesConfigurer.setDefinitions(new String[]{
	                "/WEB-INF/views/tiles/tiles-base.xml"
	        });
	        tilesConfigurer.setCheckRefresh(true);
	        return tilesConfigurer;
	   }
	  
	 
	

}