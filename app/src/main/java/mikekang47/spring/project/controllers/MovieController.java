package mikekang47.spring.project.controllers;

import mikekang47.spring.project.application.MovieService;
import mikekang47.spring.project.models.Movie;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/search/movie")
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("{keyword}")
    public Movie getListByKeyword(@PathVariable String keyword) {
        return movieService.getMoviesByKeyword(keyword);
    }



}
