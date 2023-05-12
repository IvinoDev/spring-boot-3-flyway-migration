package ml.ivinodev.flywayexemple.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Data
@Entity
public class Post {
    @Id
    //! How Hibernate keeps track of the newly created ID.
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    //? a blob of text
    @Column(columnDefinition = "TEXT")
    private String body;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
