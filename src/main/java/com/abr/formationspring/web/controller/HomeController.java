package com.abr.formationspring.web.controller;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.service.MovieServiceInterface;
import com.abr.formationspring.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private final MovieServiceInterface service;

    public HomeController(MovieServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/dvdstore-home")
    public void displayHome() {
    }

    @GetMapping("/add-movie")
    public void displayMovieForm(@ModelAttribute MovieForm movieForm) {

    }
}
