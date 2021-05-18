package OfficeHours.day_5_18_21;

public class AnimalSpecies {

    String name;
    int population;
    int growthRate;

    public void setInfo(String setName, int setPopulation, int setGrowth) {
        name = setName;
        population = setPopulation;
        growthRate = setGrowth;
    }

    public String getName() {
        if(name == null) {
            return "No name defined";
        }
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }
}
