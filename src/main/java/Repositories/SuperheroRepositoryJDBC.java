package Repositories;

import DTO.SuperheroWithCityDTO;
import DTO.SuperheroCountDTO;
import DTO.SuperheroWithSuperpowersDTO;
import Model.Superhero;
import org.springframework.beans.factory.annotation.Value;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SuperheroRepositoryJDBC {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.user}")
    String user;
    @Value("${spring.datasource.password}")
    String password;


    //superheroes
    public Superhero superhero(String name) {
        Superhero superhero = null;
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String SQL = "SELECT * FROM superhero";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            if (rs.next()) {
                String heroName = rs.getString("hero_name");
                String realName = rs.getString("real_name");
                int creationYear = rs.getInt("creation_year");
                String cityName = rs.getString("city_name");
                String superpower = rs.getString("superpower");
                superhero = new Superhero(heroName, realName, creationYear, cityName, superpower);
            }
            return superhero;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //names

    public List<Superhero> superheroes(String name) {
        List<Superhero> superhero = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String SQL = "SELECT heroName FROM hero_name WHERE heroName NOT NULL";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                String heroName = rs.getString("hero_name");
                String realName = rs.getString("real_name");
                int creationYear = rs.getInt("creation_year");
                String cityName = rs.getString("city_name");
                String superpower = rs.getString("superpower");
                superhero.add(new Superhero(heroName, realName, creationYear, cityName, superpower));
            }
            return superhero;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //count

    public List<SuperheroCountDTO> powerCount(String name) {
        List<SuperheroCountDTO> superheroCountDTOList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String SQL = "SELECT hero_name, real_name, creation_year, city_name, superpower FROM superheroDB AS count";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                String heroName = rs.getString("hero_name");
                String realName = rs.getString("real_name");
                int count = rs.getInt("count");
                superheroCountDTOList.add(new SuperheroCountDTO(heroName, realName, count));
            }
            return superheroCountDTOList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //power
    public List<SuperheroWithSuperpowersDTO> superpowersDTOList(String name) {
        List<SuperheroWithSuperpowersDTO> superpowersDTOList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String SQL = "SELECT heroName FROM hero_name JOIN superpower AS count";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                String heroName = rs.getString("hero_name");
                String superpower = rs.getString("superpower");
                int count = rs.getInt("count");
                superpowersDTOList.add(new SuperheroWithSuperpowersDTO(heroName, superpower, count));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return superpowersDTOList;
    }

    //city
    public List<SuperheroWithCityDTO> allSuperheroesInCity(String name) {
        List<SuperheroWithCityDTO> superheroWithCityDTOS = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String SQL = "SELECT hero_name FROM superheroDB JOIN city_name";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                String heroName = rs.getString("hero_name");
                String cityName = rs.getString("city_name");
                superheroWithCityDTOS.add(new SuperheroWithCityDTO(heroName, cityName));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return superheroWithCityDTOS;
    }
}