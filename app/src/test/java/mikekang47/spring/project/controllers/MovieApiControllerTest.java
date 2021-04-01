package mikekang47.spring.project.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MovieApiControllerTest {

    @Autowired
    private MockMvc  mockMvc;

    String keyword = "기생충";

    @Test
    void getInformation() throws Exception{
        mockMvc.perform(get("/api/v1/movies" + keyword)
                .accept(MediaType.APPLICATION_JSON)
                .contentType( "{ \"title\" : \"기생충\",\"director\":\"봉준호\"," +
                        "\"actor\":\"송강호, 이선균, 조여정\"," +
                        "\"pubdate\":2020}")
        )
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("기생충")));
    }
}
