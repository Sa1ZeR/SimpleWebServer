package me.sa1zer_.simplewebserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Value("${upload.path}")
    private String uploadDir;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        File file = new File(uploadDir);
        if(!file.exists()) {
            file.mkdir();
        }
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        registry.addResourceHandler("/music/**").addResourceLocations("file:///"  + file.getAbsolutePath() + "/");
    }
}
