package mikekang47.spring.project.controllers;

import lombok.RequiredArgsConstructor;
import mikekang47.spring.project.dto.MoviesData;
import mikekang47.spring.project.service.MoviesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 영화 검색과 관련된 HTTP 요청을 처리합니다.
 */
@RequiredArgsConstructor
@RestController
public class movieApiController {
    private MoviesService movieService;

    /**
     * 전달된 keyword와 관련된 영화를 반환합니다.
     * @param keyword
     */
    @GetMapping("/api/v1/movies/{keyword}")
    public MoviesData getMovie(@PathVariable String keyword) {
        return movieService.findByKeyword(keyword);
    }


}