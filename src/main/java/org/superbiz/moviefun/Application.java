package org.superbiz.moviefun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(ActionServlet servlet) {
        return new ServletRegistrationBean(servlet, "/moviefun/*");    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
