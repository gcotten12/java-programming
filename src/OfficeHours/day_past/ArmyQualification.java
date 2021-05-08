package OfficeHours.day_past;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "Yes";
        boolean resident = true, highSchoolDiploma = true;
        int age = 19;

        if(citizenship.equalsIgnoreCase("yes") || resident) {
            if(age>=18 && age<=35) {
                if(highSchoolDiploma) {
                    System.out.println("You are qualified for the military");
                }else {
                    System.out.println("You must have a high school diploma");
                }
            }else {
                System.out.println("Your age must be bewteen 18 to 35 years old");
            }
        }else {
            System.out.println("You must be a U.S. citizen or resident");
        }
    }
}
