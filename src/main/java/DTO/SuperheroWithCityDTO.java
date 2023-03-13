package DTO;

public class SuperheroWithCityDTO {
    private String heroName;
    private String cityName;

    //constructor
    public SuperheroWithCityDTO(String heroName, String cityName) {
        this.heroName = heroName;
        this.cityName = cityName;
    }

    // getters and setters
    public String getHeroName() {
        return heroName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public void setCity(String city) {
        this.cityName = cityName;
    }
}
