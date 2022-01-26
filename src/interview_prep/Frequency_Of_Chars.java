package interview_prep;

public class Frequency_Of_Chars {
    public static void main(String[] args) {
        /*
        TODO:FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

        String str = "AAABBCDD";
        String expectedResult = "";
        String nonDup = "";


        for(int i = 0;i < str.length();i++) {
            if(!nonDup.contains("" + str.charAt(i))) {
                nonDup+=str.charAt(i);
                int count = 0;

                for(int j = 0; j < str.length();j++) {

                    if(str.charAt(j)==str.charAt(i)) {
                        nonDup+=str.charAt(j);
                        count++;
                    }
                }

                expectedResult += "" + str.charAt(i) + count;

            }

        }

        System.out.println("expectedResult = " + expectedResult);

    }
}
