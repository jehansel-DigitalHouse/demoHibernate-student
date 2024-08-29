
package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebSecurityConfig implements WebMvcConfigurer {
        public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**")
                        .allowedOriginPatterns("*")
                        .allowedMethods("GET", "POST", "PUT","DELETE")
                        .allowedHeaders("*")
                        .allowCredentials(true);
        }
}
