package com.example.advertisement.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @RequestMapping(path = "/stores", produces = MediaType.TEXT_HTML_VALUE)
    public String Stores(Model model) {

        Map<String, String> map = new HashMap<>();
        map.put("store1", "bbq");
        map.put("store2", "domino");
        map.put("store3", "mom's touch");
        map.put("store4", "bongus");

        model.addAttribute("storesList", map);

        return "/stores";

    }

    @GetMapping("/store-detail")
    public String StoreDetail() {
        return "/store-detail";
    }
}
