package Controllers;

import java.util.List;

import DTO.SuperheroCountDTO;
import DTO.SuperheroWithCityDTO;
import DTO.SuperheroWithSuperpowersDTO;
import Model.Superhero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import Repositories.SuperheroRepository;

@Controller
@RequestMapping("/superheroes")
public class SuperheroController {

    private SuperheroRepository superheroRepository;

    public SuperheroController(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    //superheroes
    @GetMapping({"", "/"})
    public ResponseEntity<List<Superhero>> superheroes(@PathVariable String superheroName) {
        List<Superhero> superheroList = superheroRepository.superheroes(superheroName);
        return new ResponseEntity<>(superheroList, HttpStatus.OK);
    }

    //name
    @GetMapping("/{name}")
    public ResponseEntity<List<Superhero>> superheroName(@PathVariable String superheroName) {
        List<Superhero> superheroList = superheroRepository.superheroName(superheroName);
        return new ResponseEntity<>(superheroList, HttpStatus.OK);
    }

    //count
    @GetMapping("/superpower/count/{name}")
    public ResponseEntity<List<SuperheroCountDTO>> powerCount(@PathVariable String superheroName) {
        List<SuperheroCountDTO> superheroCountList = superheroRepository.powerCount(superheroName);
        return new ResponseEntity<>(superheroCountList, HttpStatus.OK);
    }

    //power
    @GetMapping(path = {"superpower/{name}"})
    public ResponseEntity<List<SuperheroWithSuperpowersDTO>> power(@PathVariable String superheroName) {
        List<SuperheroWithSuperpowersDTO> superheroWithPower = superheroRepository.power(superheroName);
        return new ResponseEntity<>(superheroWithPower, HttpStatus.OK);
    }

    //city
    @GetMapping("/city/{city}/superheroes")
    public ResponseEntity<List<SuperheroWithCityDTO>> allSuperheroesInCity(@PathVariable String superheroName) {
        List<SuperheroWithCityDTO> superheroWithCityDTOList = superheroRepository.allSuperheroesInCity(superheroName);
        return new ResponseEntity<>(superheroWithCityDTOList, HttpStatus.OK);
    }
}
