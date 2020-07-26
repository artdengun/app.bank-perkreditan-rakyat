package com.deni.gunawan.app.bankperkreditanrakyat.Configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/js/**")
//                .addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/css/**")
//                .addResourceLocations("classpath:/static/css/");
    }
}
