
package com.servlet;

import java.util.Map;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;



@EnableWebMvc
@Configuration
@ComponentScan("com.servlet")
public class AppConfig extends WebMvcConfigurerAdapter
{
    @Bean
    public ViewResolver viewResolver()
    {
        
        InternalResourceViewResolver ir = new InternalResourceViewResolver();
        ir.setViewClass(JstlView.class);
        ir.setPrefix("/WEB-INF/jsp/");
        ir.setSuffix(".jsp");
        
        SimpleUrlHandlerMapping su =  new SimpleUrlHandlerMapping();
       
        // Property prop key viewName
        return ir;
    }
    
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
       
    }

//    @Override
//    public void onStartup(ServletContext sc) throws ServletException {
//        WebApplicationContext context = getContext();
//        sc.addListener(new ContextLoaderListener(context));
//        ServletRegistration.Dynamic dispatcher = sc.addServlet("DispatcherServlet",new DispatcherServlet(context));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("*.htm");    
//    }
//    
//    private AnnotationConfigWebApplicationContext getContext()
//    {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.setConfigLocation("com.config.Appconfig");
//        return context;
//    }
//    
    
    
}
