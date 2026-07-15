package org.lessons.best.of.the.year.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Index {

    @GetMapping("/")
    public String Homepage() {
        return "home";
    }
}
