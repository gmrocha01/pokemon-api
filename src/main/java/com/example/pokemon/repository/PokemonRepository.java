package com.example.pokemon.repository;

import com.example.pokemon.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PokemonRepository extends JpaRepository<Pokemon, Long> {


}
