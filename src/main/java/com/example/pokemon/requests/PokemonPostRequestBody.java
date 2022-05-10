package com.example.pokemon.requests;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PokemonPostRequestBody {
    private String name;
    private String primaryType;
    private String secundaryType;
    private Integer attack;
    private Integer defense;
    private Integer hp;

}
