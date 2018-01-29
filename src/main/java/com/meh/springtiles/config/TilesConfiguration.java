package com.meh.springtiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfiguration {
	  
	
	 @Bean
	 public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{
                "/WEB-INF/tiles/tiles-**.xml"
        });
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
	}
	 
	@Bean
	public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setOrder(0);
        viewResolver.setViewClass(TilesView.class);
        return viewResolver;
	}
	  
	
}