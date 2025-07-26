package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/accounts/{number}")
    public String getAccountDetails(@PathVariable String number) {
        return "{ number: \"" + number + "\", type: \"savings\", balance: 234343 }";
    }
}