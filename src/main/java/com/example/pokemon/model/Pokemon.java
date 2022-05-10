package com.example.pokemon.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "pokemon")

public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String primaryType;

    private String secundaryType;

    @NotNull
    private Integer defense;
    @NotNull
    private Integer attack;
    @NotNull
    private Integer hp;

}
