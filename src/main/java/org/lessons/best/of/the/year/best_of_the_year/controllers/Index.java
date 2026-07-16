package org.lessons.best.of.the.year.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import model.Song;
import model.Movie;
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
    public String ListSong(Model model) {
        model.addAttribute("Title", "Brani migliori!");
        model.addAttribute("list", getBestSongs());
        return "list";
    }

    @GetMapping("/movies")
    public String ListMovies(Model model) {
        model.addAttribute("Title", "Film migliori!");
        model.addAttribute("list", getBestMovies());
        return "list";
    }

    @GetMapping("list/songs")
    public String SongsPage(Model model) {

        String names = "";

        for (Song song : getBestSongs()) {
            names += song.getTitle() + ", ";
        }

        names = names.substring(0, names.length() - 2);

        model.addAttribute("Titolo", "Brani migliori!");
        model.addAttribute("songs", names);

        return "songs";
    }

    @GetMapping("/list/movies")
    public String MoviesPage(Model model) {

        String names = "";

        for (Movie movie : getBestMovies()) {
            names += movie.getTitle() + ", ";
        }

        names = names.substring(0, names.length() - 2);

        model.addAttribute("titolo", "Film migliori");
        model.addAttribute("movies", names);

        return "movies";
    }

    private List<Song> getBestSongs() {
        List<Song> list = new ArrayList<Song>();
        list.add(new Song(1, "Slipping through my fingers - ABBA"));
        list.add(new Song(2, "honeybee - Olivia Rodrigo"));
        list.add(new Song(3, "Love of my life - Queen"));
        return list;
    }

    private List<Movie> getBestMovies() {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(1, "Fight Club"));
        list.add(new Movie(2, "Eternal Sunshine blabla"));
        list.add(new Movie(3, "Shattered balbla"));
        list.add(new Movie(4, "spiderman"));
        return list;
    }
}
