package mikekang47.spring.project.controllers;

import mikekang47.spring.project.application.MovieService;
import mikekang47.spring.project.dto.MoviesItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{text}")
    public MoviesItem getData(@PathVariable String text) {
        return movieService.requestData(text);
    }

}
