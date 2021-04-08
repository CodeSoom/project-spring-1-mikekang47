package mikekang47.spring.project.models;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
public class Movie {
    private String title;

    private String director;

    private String actor;

}
