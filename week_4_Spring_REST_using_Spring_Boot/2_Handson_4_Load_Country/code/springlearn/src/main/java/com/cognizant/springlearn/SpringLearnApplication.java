package com.cognizant.springlearn;

import com.cognizant.springlearn.Service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);

    }

    public static void displayCountries() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        CountryService service = context.getBean("countryService", CountryService.class);

        // This will automatically log all countries through the CountryService
        LOGGER.info("Application started. Countries loaded from configuration.");
    }
}