package OfficeHours.day_5_18_21;

public class Earth {

    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
//        System.out.println(dogs.getName());
        dogs.setInfo("dogs", 50, 10);
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();
        cats.setInfo("cats", 70, 12);
        System.out.println(cats);

    }
}
