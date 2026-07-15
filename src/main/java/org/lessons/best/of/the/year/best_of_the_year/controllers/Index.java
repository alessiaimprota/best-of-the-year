package org.lessons.best.of.the.year.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Index {

    @GetMapping("/")
    public String Homepage(Model model) {
        model.addAttribute("autore", "Alessia");
        return "home";
    }

    @GetMapping("/songs")
    public String SongsPage() {
        return "songs";
    }

    @GetMapping("/movies")
    public String MoviesPage() {
        return "movies";
    }
}
