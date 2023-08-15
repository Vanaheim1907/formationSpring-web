package com.abr.formationspring.web.api;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.service.MovieServiceInterface;
import com.abr.formationspring.web.form.MovieForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
public class MovieResources {
    @Autowired
    private final MovieServiceInterface service;

    public MovieResources(MovieServiceInterface service) {
        this.service = service;
    }

    public MovieServiceInterface getService() {
        return service;
    }

    @GetMapping("/{id}")
    public Optional<Movie> get(@PathVariable("id") Long id) {
        return service.getMovieById(id);
    }
    @GetMapping
    public Iterable<Movie> list(){
        return service.list();

    }
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
       return service.registerMovie(movie);
    }


}
