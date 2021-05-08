package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //Find the index of 'Gloves in items array(use for loop)

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Gloves")) {
                System.out.println("The index of Gloves is " + i);
                break;
            }
        }

        // Set boolean to true if item is found
        boolean iPadExists = false;

        for(String item : items) {
            if(item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);


        // print a report of each shopping item

        for(int n = 0; n < items.length; n++) {
            System.out.println(items[n] + " - $" + prices[n] + " - #" + itemIDs[n]);
        }


        // Loop for jacket in items and print all details

        for(int j = 0; j < items.length; j++) {
            if(items[j].equalsIgnoreCase("jacket")) {
                System.out.println(items[j] + " - $" + prices[j] + " - #" + itemIDs[j]);
                break;
            }
        }





    }
}
