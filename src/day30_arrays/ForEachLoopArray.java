package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};
        for(int nums : data){
            System.out.print(nums + " ");
        }

        System.out.println();

        System.out.println(data[data.length -1]);

        for(int i = 0; i < data.length; i+=2) {
            System.out.print(data[i]+" ");
        }

        System.out.println();

        for(int i = data.length-1; i >= 0; i--) {
            System.out.print(data[i]+" ");
        }
    }
}
