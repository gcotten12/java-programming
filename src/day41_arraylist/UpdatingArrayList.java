package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Toyota"); cars.add("Mazda"); cars.add("Ford"); cars.add("Chevy");
        cars.add("Tesla"); cars.add(0, "Jeep");
        System.out.println(cars.toString());
        String allCarsInStr = cars.toString();
        System.out.println(allCarsInStr);
        //set
        cars.set(1, "Honda");
        System.out.println(cars);
        //replace
        System.out.println(cars.indexOf("Ford"));
        cars.set(cars.indexOf("Ford"), "Dodge");
        System.out.println(cars);
        //jeep -> prius
        //mazda -> lexus
        //dodge -> audi
        for(int i = 0; i < cars.size(); i++) {
            if(cars.get(i).equalsIgnoreCase("jeep")) {
                cars.set(i,"prius");
            }else if(cars.get(i).equalsIgnoreCase("mazda")) {
                cars.set(i,"lexus");
            }else if(cars.get(i).equalsIgnoreCase("dodge")) {
                cars.set(i,"audi");
            }
            System.out.print(cars.get(i) + " ");
        }


    }


}
