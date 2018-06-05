/**
 * 
 */
package com.hitachi.fitness.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Pratyush
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.hitachi.fitness.*"})
public class ApplicationConfig {

	

}
