package com.experis.course.bestoftheyear.controller;

import com.experis.course.bestoftheyear.model.Movie;
import com.experis.course.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping()
    public String nome(Model model) {
        model.addAttribute("name", "Matteo");
        return "index";
    }

    private List<Movie> getBestMovies() {
        Movie[] moviesList = {
                new Movie("1", "Fight Club"),
                new Movie("2", "Shutter Island"),
                new Movie("3", "Django"),
                new Movie("4", "Carlito's Way")
        };
        return Arrays.asList(moviesList);
    }

    private List<Song> getBestSongs() {
        Song[] songsList = {
                new Song("1", "The man who sold the world"),
                new Song("2", "Stairway to Heaven"),
                new Song("3", "Comfortably Numb"),
                new Song("4", "I Say I' Sto Ccà")
        };
        return Arrays.asList(songsList);
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "index";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "index";
    }
}
