#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package com.bb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootBasicApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootBasicApplication.class, args);
    }
}
