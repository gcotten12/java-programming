package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String[] friends = {"Evan", "Miguel", "Zach", "Pedro"};

        for(String each : friends) {
            System.out.println("Happy Holidays " + each + "!");
        }

        String[] words = {"java", "python", "ruby", "sql"};
        String[] reverse = {""};

        for(int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }
}
