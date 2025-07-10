package com.cognizant.springlearn.Service;

import java.util.Map;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    private Map<String, Country> countries;

    public Map<String, Country> getCountries() {
        LOGGER.debug("Inside getCountries()");
        return countries;
    }

    public void setCountries(Map<String, Country> countries) {
        LOGGER.debug("Inside setCountries()");
        this.countries = countries;
        logAllCountries();
    }

    public Country getCountryByCode(String code) {
        LOGGER.debug("Inside getCountryByCode()");
        Country country = countries.get(code);
        if (country != null) {
            LOGGER.info("Selected Country - Code: {}, Name: {}", country.getCode(), country.getName());
        }
        return country;
    }

    private void logAllCountries() {
        LOGGER.info("All Available Countries:");
        countries.forEach((code, country) -> LOGGER.info("Code: {}, Name: {}", code, country.getName()));
    }
}