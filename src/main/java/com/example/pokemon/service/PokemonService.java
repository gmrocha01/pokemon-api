package com.example.pokemon.service;

import com.example.pokemon.mapper.PokemonMapper;
import com.example.pokemon.model.Pokemon;
import com.example.pokemon.repository.PokemonRepository;
import com.example.pokemon.requests.PokemonPostRequestBody;
import com.example.pokemon.requests.PokemonPutRequestBody;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PokemonService {

    @Autowired
    private final PokemonRepository pokemonRepository;

    public List<Pokemon> listAll() {
        return pokemonRepository.findAll();
    }

    public Pokemon findById(long id) {
        return pokemonRepository.findById(id).orElseThrow((() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime Not Found")));
    }

    public Pokemon save(PokemonPostRequestBody pokemonPostRequestBody) {
        return pokemonRepository.save(PokemonMapper.INSTANCE.toPokemon(pokemonPostRequestBody));
    }

    public void replace(PokemonPutRequestBody pokemonPutRequestBody) {
        Pokemon savedPokemon = findById(pokemonPutRequestBody.getId());
        Pokemon pokemon = PokemonMapper.INSTANCE.toPokemon(pokemonPutRequestBody);
        pokemon.setId(savedPokemon.getId());
        pokemonRepository.save(pokemon);
    }

    public void delete(Long id) {
        pokemonRepository.delete(findById(id));
    }


}
