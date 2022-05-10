package com.example.pokemon.mapper;

import com.example.pokemon.model.Pokemon;
import com.example.pokemon.requests.PokemonPostRequestBody;
import com.example.pokemon.requests.PokemonPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public abstract class PokemonMapper {
    public static final PokemonMapper INSTANCE = Mappers.getMapper(PokemonMapper.class);
    public abstract Pokemon toPokemon(PokemonPostRequestBody pokemonPostRequestBody);
    public abstract Pokemon toPokemon(PokemonPutRequestBody pokemonPutRequestBody);
}
