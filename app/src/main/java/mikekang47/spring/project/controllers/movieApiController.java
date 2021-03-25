package mikekang47.spring.project.controllers;

import mikekang47.spring.project.dto.MoviesData;
import mikekang47.spring.project.service.MoviesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class movieApiController {

    @GetMapping("/api/v1/movies/{keyword}")
    public MoviesData getMovie(@PathVariable String keyword) {
        return null;
    }


}
