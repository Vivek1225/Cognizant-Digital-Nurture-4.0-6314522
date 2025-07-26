package com.cognizant.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Map<String, String> getLoan(@PathVariable("number") String number){
        Map<String, String> loanData = new HashMap<>();
        loanData.put("number", number);
        loanData.put("type", "House");
        loanData.put("loan", "4000000");
        loanData.put("tenure", "20 years");

        System.out.println("Request from account number : " + number);
        System.out.println("It's details are (dummy) : " + loanData);

        return loanData;
    }
}