package com.example.pokemon;

import com.example.pokemon.mapper.PokemonMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);

	}

}
