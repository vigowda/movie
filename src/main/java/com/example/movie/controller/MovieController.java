package com.example.movie.controller;

import com.example.movie.dao.Movie;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class MovieController {


//    @RequestMapping(value = "/getMovie",method = RequestMethod.GET) // older method
    @GetMapping(value = "/getMovieXML", produces = MediaType.APPLICATION_XML_VALUE)
    public Movie getMovieXML() {

        Movie movie = new Movie();
        movie.setName("testMovie");
        movie.setReleaseDate(new Date());
        movie.setRating(5);
        return movie;
    }

    //Request Param
    @GetMapping(value = "/getMovie")
    public Movie getMovieByQueryParam(@RequestParam(name = "id") int id, String name) {

        Movie movie = new Movie();
        movie.setId(id);
        movie.setName(name);
        movie.setReleaseDate(new Date());
        movie.setRating(5);
        return movie;
    }

    //Path Variable Param
    @GetMapping(value = "/getMovie/{idq}/{name}")
    public Movie getMovie(@PathVariable(name = "idq") int id, @PathVariable String name) {

        Movie movie = new Movie();
        movie.setId(id);
        movie.setName(name);
        movie.setReleaseDate(new Date());
        movie.setRating(5);
        return movie;
    }

    @PostMapping(value = "/postMovie")
    public Movie getMovie(@RequestBody Movie movie) {

        Movie movie1 = new Movie();
        movie1 = movie;
        movie1.setRating(10);
        return movie;
    }

}
