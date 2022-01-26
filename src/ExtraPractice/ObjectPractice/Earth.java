package ExtraPractice.ObjectPractice;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies animalSpecies = new AnimalSpecies();
        animalSpecies.setName("Lion");
        animalSpecies.setPopulation(1);
        animalSpecies.setGrowthRate(2);
        System.out.println(animalSpecies.getName());
        System.out.println(animalSpecies.getPopulation());
        System.out.println(animalSpecies.getGrowthRate());
        System.out.println(animalSpecies);
    }
}
