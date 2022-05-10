package com.example.pokemon.controller;

import com.example.pokemon.mapper.PokemonMapper;
import com.example.pokemon.model.Pokemon;
import com.example.pokemon.repository.PokemonRepository;
import com.example.pokemon.requests.PokemonPostRequestBody;
import com.example.pokemon.requests.PokemonPutRequestBody;
import com.example.pokemon.service.PokemonService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("pokemons")
@Log4j2
@RequiredArgsConstructor

public class PokemonController {

    @Autowired
    private final PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> listAll() {
        return pokemonService.listAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pokemon findByIdAPokemon(@PathVariable long id) {
        return pokemonService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Pokemon> savePokemon(@RequestBody PokemonPostRequestBody pokemonPostRequestBody) {
        return new ResponseEntity<>(pokemonService.save(pokemonPostRequestBody) , HttpStatus.CREATED);
    }

    @PutMapping //Edita um Pokemon baseado pelo ID
    @ResponseStatus(HttpStatus.OK)
    public void replacePokemon(@RequestBody PokemonPutRequestBody pokemonPutRequestBody) {
        pokemonService.replace(pokemonPutRequestBody);
    }

    @DeleteMapping(path = "/{id}") //Deleta um Pokemon baseado pelo ID
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePokemon(@PathVariable long id) {
        pokemonService.delete(id);
    }


}
