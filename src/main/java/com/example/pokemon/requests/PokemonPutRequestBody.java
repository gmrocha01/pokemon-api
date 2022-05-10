package com.example.pokemon.requests;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PokemonPutRequestBody {
    private Long id;
    private String name;
    private String primaryType;
    private String secundaryType;
    private Integer attack;
    private Integer defense;
    private Integer hp;

}
