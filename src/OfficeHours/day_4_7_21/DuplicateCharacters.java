package OfficeHours.day_4_7_21;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0; // resets after inner loop is done running

            if(checked.contains("" + str.charAt(i))) { // so that we don't repeat characters
                continue;
            }

            for (int j = 0; j < str.length(); j++) { // allows us to compare charAt(i) with every character in the String

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(str.charAt(i) + " is duplicate");
            }
            checked += str.charAt(i);
        }
    }
}
