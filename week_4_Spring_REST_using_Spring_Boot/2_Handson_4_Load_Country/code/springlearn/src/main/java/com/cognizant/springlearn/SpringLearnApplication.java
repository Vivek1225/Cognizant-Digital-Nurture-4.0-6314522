package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void displayCountries() {
        // Loading the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // Retrieving all country beans from Spring container
        Country usCountry = context.getBean("usCountry", Country.class);
        Country deCountry = context.getBean("deCountry", Country.class);
        Country inCountry = context.getBean("inCountry", Country.class);
        Country jpCountry = context.getBean("jpCountry", Country.class);

        LOGGER.info("=== Country Details ===");
        LOGGER.info("US: {}", usCountry);
        LOGGER.info("DE: {}", deCountry);
        LOGGER.info("IN: {}", inCountry);
        LOGGER.info("JP: {}", jpCountry);
    }

    public static void main(String[] args) {
        displayCountries();
    }
}