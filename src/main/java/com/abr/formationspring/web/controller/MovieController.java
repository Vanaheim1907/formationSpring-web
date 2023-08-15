package com.abr.formationspring.web.controller;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.service.MovieServiceInterface;
import com.abr.formationspring.web.form.MovieForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private final MovieServiceInterface service;

    public MovieController(MovieServiceInterface service) {
        this.service = service;
    }

    public MovieServiceInterface getService() {
        return service;
    }

   /* @GetMapping("/{id}")
    public String displayMovieCard(@PathVariable("id") Long id, Model model) {
        model.addAttribute("movie", service.getMovieById(id));
        return "movie-details";
    }*/

    @PostMapping("/add")
    public String addMovie(@Valid @ModelAttribute MovieForm movieform, BindingResult result) {

        if (result.hasErrors()) {
            return "add-movie";
        }

        Movie movie = new Movie();
        movie.setType(movieform.getType());
        movie.setTitle(movieform.getTitle());
        movie.setDescription(movieform.getDescription());

        service.registerMovie(movie);
        return "movie-added";
    }


}
