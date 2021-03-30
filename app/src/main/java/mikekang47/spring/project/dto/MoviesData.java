package mikekang47.spring.project.dto;

import com.github.dozermapper.core.Mapping;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MoviesData {
    private int display;
    private Item[] items;

    @Data
    private class Item {
        @NotBlank
        @Mapping("title")
        public String title;

        @NotBlank
        @Mapping("pubData")
        public Data pubData;

        @NotBlank
        @Mapping("director")
        public String director;

        @NotBlank
        @Mapping("actor")
        public String actor;
    }
}
