package OfficeHours.day_4_7_21;

public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";
        int words = 1; // start at 1 because due to camel case formatting. The first word will not be counted because of the condition we are using

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                words++;
            }
        }
        System.out.println("Words: "+words);
    }
}
