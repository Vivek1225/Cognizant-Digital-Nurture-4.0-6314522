package com.cognizant.springlearn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    private CountryService countryService;

    public CountryController() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        this.countryService = context.getBean("countryService", CountryService.class);
    }

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/getCountry")
    @ResponseBody
    public String getCountryName(@RequestParam String code) {
        Country country = countryService.getCountryByCode(code);
        return country != null ? country.getName() : "Country not found";
    }
}