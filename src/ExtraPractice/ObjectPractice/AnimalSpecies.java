package ExtraPractice.ObjectPractice;

public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }

    public void setName(String n) {
        name = n;
    }

    public void setPopulation(int pop) {
        population = pop;
    }

    public void setGrowthRate(int growth) {
        growthRate = growth;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrowthRate() {
        return growthRate;
    }



}
