package mikekang47.spring.project.controllers;

import mikekang47.spring.project.application.MovieService;
import mikekang47.spring.project.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/v1/search/movie?query={keyword}", method = GET)
public class MovieController {
    private MovieService movieService;

    @GetMapping
    public List<Movie> getListByKeyword(@PathVariable String title) {
        return movieService.getMoviesByKeyword(title);
    }


}
