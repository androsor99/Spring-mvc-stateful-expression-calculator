package com.epam.rd.autotasks.springstatefulcalc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.epam.rd.autotasks.springstatefulcalc")
@Configuration
@PropertySource("classpath:error.properties")
public class WebConfig {

}
