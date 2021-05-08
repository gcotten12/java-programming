package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum == 3) {
            System.out.println("Floor 3 selcted. Companies: Lyft, BofA, Steak House");
        }else {
            System.out.println("Invalid floor - 6");
        }

        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selcted. Companies: Lyft, BofA, Steak House");
                break;
            default:
                System.out.println("Invalid floor - 6");
        }
    }
}
