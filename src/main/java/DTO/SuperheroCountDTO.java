package DTO;

public class SuperheroCountDTO {
    private String heroName;
    private String realName;
    private int superpowerCount;

    // constructor

    public SuperheroCountDTO(String heroName, String realName, int superpowerCount) {
        this.heroName = heroName;
        this.realName = realName;
        this.superpowerCount = superpowerCount;
    }

    // getters and setters

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getSuperpowerCount() {
        return superpowerCount;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSuperpowerCount(int superpowerCount) {
        this.superpowerCount = superpowerCount;
    }

    @Override
    public String toString() {
        return "SuperheroWithSuperpowerCountDTO{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", superpowerCount=" + superpowerCount +
                '}';
    }
}
