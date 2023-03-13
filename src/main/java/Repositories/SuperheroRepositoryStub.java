package Repositories;

import DTO.SuperheroWithCityDTO;
import DTO.SuperheroCountDTO;
import DTO.SuperheroWithSuperpowersDTO;
import Model.Superhero;

import java.util.ArrayList;
import java.util.List;

public class SuperheroRepositoryStub implements SuperheroRepository {
    private List<Superhero> superheroList;

    public SuperheroRepositoryStub() {
        superheroList = new ArrayList<>(List.of(
                new Superhero("Batman", "Bruce Wayne", 1939, "Gotham City", "Intelligence and wealth"),
                new Superhero("Superman", "Clark Kent", 1938, "Metropolis", "Flying, heat vision, superstrength"),
                new Superhero("Wonder Woman", "Diana Prince", 1942, "Themyscira", "Flying and superstrength"),
                new Superhero("Green Lantern", "Hal Jordan", 1940, "Coast City", "Flying and magic ring")
        ));
    }

    @Override
    public Superhero superhero(String name) {
        return null;
    }

    @Override
    public List<Superhero> superheroes(String superheroName) {
        return null;
    }

    @Override
    public List<Superhero> superheroName(String superheroName) {
        return null;
    }

    @Override
    public List<SuperheroCountDTO> powerCount(String superheroName) {
        return null;
    }

    @Override
    public List<SuperheroWithSuperpowersDTO> power(String superheroName) {
        return null;
    }

    @Override
    public List<SuperheroWithCityDTO> allSuperheroesInCity(String superheroName) {
        return null;
    }
}
