package DTO;

import java.util.List;

public class SuperheroWithSuperpowersDTO {
    private String heroName;
    private String realName;
    private List<String> superpowers;
    private int count;

    //constructor


    public SuperheroWithSuperpowersDTO(String heroName, String realName, List<String> superpowers, int count) {
        this.heroName = heroName;
        this.realName = realName;
        this.superpowers = superpowers;
        this.count = count;
    }

    public SuperheroWithSuperpowersDTO(String heroName, int count) {
    }

    // getters and setters
    public String getHeroName() {
        return heroName;
    }
    public String getRealName() {
        return realName;
    }
    public List<String> getSuperpowers() {
        return superpowers;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public void setSuperpowers(List<String> superpowers) {
        this.superpowers = superpowers;
    }

    @Override
    public String toString() {
        return "SuperheroWithSuperpowersDTO{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", superpowers=" + superpowers +
                '}';
    }
}