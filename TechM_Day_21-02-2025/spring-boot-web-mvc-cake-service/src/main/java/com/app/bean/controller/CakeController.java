package com.app.bean.controller;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.bean.Cake;
import com.app.bean.service.CakeService;

@Controller
public class CakeController {
    
    @Autowired
    private CakeService cakeService;

    @RequestMapping("/placeOrder")
    public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {
        return "placeOrder";
    }
 


    @RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
    public String getOrderStatus(@ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {
        // Redirecting to the same form page if invalid
        if (result.hasErrors()) {
            return "placeOrder";
        }

        // Assigning the flavorRate value of the flavorList map to the cake object's flavorRate value
        cake.setFlavorRate(cakeService.flavorList.getOrDefault(cake.getFlavor(), 0));

        // Preventing NullPointerException
        if (cake.getIncludeCandles() == null) {
            cake.setIncludeCandles(0);
        }
        if (cake.getIncludeinscription() == null) {
            cake.setIncludeinscription(0);
        }

        // Calculating cake price
        double price = cake.getSelectedcake() + cake.getFlavorRate() + cake.getIncludeCandles() + cake.getIncludeinscription();
        cake.setPrice(price);

        // Adding cake object to the orderList map and getting the orderId value
        int orderId = cakeService.addOrder(cake);

        // Adding all objects to ModelMap
        map.addAttribute("cake", cake);
        map.addAttribute("indianPrice", cake.getPrice() * 75);
        map.addAttribute("orderId", orderId);
        map.addAttribute("orderDate", new Date().toString());

        // Returning the appropriate view pages
        return orderId >= 1000 ? "orderStatus" : "placeOrder";
    }

    // Passing flavor list to the view
    @ModelAttribute("flavorList")
    public Set<String> populateFillingList() {
        return cakeService.flavorList.keySet();
    }
}
