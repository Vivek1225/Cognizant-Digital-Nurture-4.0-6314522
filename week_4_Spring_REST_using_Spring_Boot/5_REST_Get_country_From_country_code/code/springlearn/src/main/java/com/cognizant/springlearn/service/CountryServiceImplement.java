package com.cognizant.springlearn.service;


import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplement implements CountryService {

    @Autowired
    private List<Country> countries;
    @Override
    public Country getCountry(String code) {
        if (code == null || code.trim().isEmpty()) {
            return null;
        }

        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
