package mikekang47.spring.project.controllers;

import mikekang47.spring.project.dto.MoviesData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 영화 검색과 관련된 HTTP 요청을 처리합니다.
 */
public class movieApiController {
    /**
     * 전달된 keyword와 관련된 영화를 반환합니다.
     * @param keyword
     * @return 
     */
    @GetMapping("/api/v1/movies/{keyword}")
    public MoviesData getMovie(@PathVariable String keyword) {
        return null;
    }


}
