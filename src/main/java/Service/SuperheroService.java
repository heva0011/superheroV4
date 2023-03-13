package Service;

import DTO.SuperheroCountDTO;
import DTO.SuperheroWithCityDTO;
import DTO.SuperheroWithSuperpowersDTO;
import Model.Superhero;
import Repositories.SuperheroRepository;

import java.util.List;

public class SuperheroService {
    private SuperheroRepository superheroRepository;

    public SuperheroService(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    public List<Superhero> superheroes(String superheroName) {
        return superheroRepository.superheroes(superheroName);
    }

    public List<Superhero> superheroName(String superheroName) {
        return superheroRepository.superheroName(superheroName);
    }

    public List<SuperheroCountDTO> powerCount(String superheroName) {
        return superheroRepository.powerCount(superheroName);
    }

    public List<SuperheroWithSuperpowersDTO> power(String superheroName) {
        return superheroRepository.power(superheroName);
    }

    public List<SuperheroWithCityDTO> allSuperheroesInCity(String superheroName) {
        return superheroRepository.allSuperheroesInCity(superheroName);
    }
}