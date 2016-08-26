package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Kevin Khanda on 8/19/2016.
 * Configuration class for Web. This will make redirections.
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/history").setViewName("history");
        registry.addViewController("/login").setViewName("index");
        registry.addViewController("/logout").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/menu").setViewName("menu");
        registry.addViewController("/pubmenu").setViewName("pubmenu");
        registry.addViewController("/pubnews").setViewName("pubnews");
        registry.addViewController("/settings").setViewName("settings");
        registry.addViewController("/userform").setViewName("userform");
        registry.addViewController("/userhistory").setViewName("userhistory");
        registry.addRedirectViewController("/", "/login");
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
