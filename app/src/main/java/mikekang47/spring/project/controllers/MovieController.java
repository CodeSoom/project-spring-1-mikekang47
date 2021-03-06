package mikekang47.spring.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/v1/search/movie?query={keyword}", method = GET)
public class MovieController {
    @GetMapping
    public List<Movie> getListByTitle(@PathVariable String title) {
        return movieService.getMoviesByTitle(title);
    }
}
