package com.experis.course.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("home")
    public String nome(Model model) {
        model.addAttribute("name", "Matteo");
        return "index";
    }

    private ArrayList<String> getBestMovies() {
        ArrayList<String> moviesList = new ArrayList<>();
        moviesList.add("Fight Club");
        moviesList.add("Django");
        moviesList.add("Shutter Island");
        moviesList.add("Carlito's Way");
        return moviesList;
    }

    private ArrayList<String> getBestSongs() {
        ArrayList<String> songsList = new ArrayList<>();
        songsList.add("The man who sold the world");
        songsList.add("Stairway to Heaven");
        songsList.add("Comforably Numb");
        songsList.add("I Say I' Sto Ccà");
        return songsList;
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
