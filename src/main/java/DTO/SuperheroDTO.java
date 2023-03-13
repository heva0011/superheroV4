package DTO;

public class SuperheroDTO {
    private String heroName;
    private String realName;
    private int creationYear;

    //constructor
    public SuperheroDTO(String heroName, String realName, int creationYear) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;

    }

    // getters and setters
    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
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

    @Override
    public String toString() {
        return "SuperheroDTO{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", creationYear=" + creationYear +
                '}';
    }
}