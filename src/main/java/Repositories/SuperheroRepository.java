package Repositories;

import DTO.SuperheroWithCityDTO;
import DTO.SuperheroCountDTO;
import DTO.SuperheroWithSuperpowersDTO;
import Model.Superhero;

import java.util.List;

public interface SuperheroRepository {

    Superhero superhero(String name);

    List<Superhero> superheroes(String superheroName);

    List<Superhero> superheroName(String superheroName);

    List<SuperheroCountDTO> powerCount(String superheroName);

    List<SuperheroWithSuperpowersDTO> power(String superheroName);

    List<SuperheroWithCityDTO> allSuperheroesInCity(String superheroName);
}