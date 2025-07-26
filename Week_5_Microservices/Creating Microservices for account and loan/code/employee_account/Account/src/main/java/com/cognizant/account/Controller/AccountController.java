package com.cognizant.account.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Map;
import java.util.HashMap;

@RestController
public class AccountController{

    @GetMapping("/accounts/{number}")
    public Map<String, String> getAccountData(@PathVariable("number") String accNum){
        Map<String, String> accountDetails = new HashMap<>();
        accountDetails.put("number", accNum);
        accountDetails.put("type", "savings");
        accountDetails.put("balance", "234343");

        System.out.println("Request from account number : " + accNum);
        System.out.println("It's details are (dummy) : " + accountDetails);

        return accountDetails;
    }

}
