package Model;

public class Superhero {
    private String heroName;
    private String realName;
    private int creationYear;
    private String cityName;
    private String superpower;

    // constructor
    public Superhero(String heroName, String realName, int creationYear, String cityName, String superpower) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
        this.cityName = cityName;
        this.superpower = superpower;
    }
    public Superhero(String heroName, String realName, int creationYear) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
    }

    public String getSuperheroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getCityName() {
        return cityName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    // If heroName is empty
    public String getHeroName() {
        if (heroName.isEmpty()) {
            return "No superhero name found";
        } else {
            return heroName;
        }
    }
}
