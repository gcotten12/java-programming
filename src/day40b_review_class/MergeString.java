package day40b_review_class;

public class MergeString {
    public static void main(String[] args) {
        String one = "abc";
        String two = "defgh";
    
        String result = "";
        
        for(int i = 0; i < one.length() || i < two.length(); i++) {
            if(i < one.length()) {
                result += one.charAt(i);
            }
            if(i < two.length()) {
                result += two.charAt(i);
            }
        }

        System.out.println("result = " + result);
    
    }
    
}
