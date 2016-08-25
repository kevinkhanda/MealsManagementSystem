package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Kevin Khanda on 8/19/2016.
 * Configuration class for Web. This will make redirections.
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public WebMvcConfigurerAdapter forwardToIndex() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                /*registry.addViewController("/").setViewName("index.jsp");*/
                registry.addViewController("/history").setViewName("history.jsp");
                registry.addViewController("/login").setViewName("index.jsp");
                registry.addViewController("/logout").setViewName("index.jsp");
                registry.addViewController("/main").setViewName("main.jsp");
                registry.addViewController("/menu").setViewName("menu.jsp");
                registry.addViewController("/pubmenu").setViewName("pubmenu.jsp");
                registry.addViewController("/pubnews").setViewName("pubnews.jsp");
                registry.addViewController("/settings").setViewName("settings.jsp");
                registry.addViewController("/userform").setViewName("userform.jsp");
                registry.addViewController("/userhistory").setViewName("userhistory.jsp");
                registry.addRedirectViewController("/", "/login");
            }
        };
    }
}
