package ml.ivinodev.flywayexemple.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(length = 16)
    private String name;

}
