package mikekang47.spring.project.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Data;



@Data
public class MoviesItem {
    private int display;

    private Item[] items;

    @Data
    static class Item {
        @Mapping("title")
        public String title;

        @Mapping("link")
        public String link;

        @Mapping("image")
        public String image;

        @Mapping("subtitle")
        public String subtitle;

        @Mapping("actor")
        public String director;

        @Mapping("actor")
        public String actor;

        @Mapping("userRating")
        public float userRating;
    }
}
