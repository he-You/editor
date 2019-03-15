package com.example.editor.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Created by heyou on 2019/3/15 0015
 */

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    /**
     * 在配置文件中配置的文件保存路径
     */
    @Value("${img.location}")
    private String folder;
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //addResourceHandler是指你想在url请求的路径
        //addResourceLocations是图片存放的真实路径
        //registry.addResourceHandler("/images/**").addResourceLocations("file:" + folder);
        registry.addResourceHandler("/upload/**").addResourceLocations("file:/" + folder);
    }

}
