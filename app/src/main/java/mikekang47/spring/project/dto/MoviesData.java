package mikekang47.spring.project.dto;

import lombok.Data;

@Data
public class MoviesData {
    private int display;
    private Item[] items;

    @Data
    private class Item {
        public String title;
        public String link;
        public Data pubData;
        public String director;
    }
}
