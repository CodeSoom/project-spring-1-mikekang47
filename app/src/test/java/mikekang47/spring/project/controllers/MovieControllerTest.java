package mikekang47.spring.project.controllers;

import mikekang47.spring.project.application.MovieService;
import mikekang47.spring.project.domain.Movie;
import mikekang47.spring.project.dto.MoviesItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.BDDMockito.given;
import static org.springframework.mock.web.reactive.function.server.MockServerRequest.builder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(MovieController.class)
@DisplayName("MovieController 테스트")
class MovieControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @MockBean
    private MovieService movieService;

    @BeforeEach
    void setUp() {
        Movie movie = Movie.builder()
                .actor("이병헌")
                .director("추창민")
                .userRating(9.25f)
                .build();

        given(movieService.requestData("광해")).willReturn(movie);
    }

    @Test
    @DisplayName("getData는 검색 결과를 반환한다")
    void getData() throws Exception {
        mockMvc.perform(
                get("/api/광해")
                        .accept(MediaType.APPLICATION_JSON_UTF8)

        )
                .andExpect(status().isOk());

    }

}
