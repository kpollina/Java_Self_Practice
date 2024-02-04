package day09_practice_tasks;

public class Items {

    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int firstIndex = -1;

        boolean isContain = false;
        
        for (int i = 0; i <items.length ; i++) {
           // System.out.println(items[i]);
            if(items[i].equals("Gloves")){
                firstIndex = i;
                break;
            }
        }
        System.out.println(firstIndex);

        for (int i = 0; i <items.length ; i++) {
            if(items[i].equals("iPad")){
               isContain = true;
                break;
            }
        }
        System.out.println(isContain);

        for (int i = 0; i < items.length; i++) {
            System.out.println("name " + items[i] + " - price " + prices[i] + " - #ID " + itemIDs[i]);
        }



        //the other way:
        //        int indexNumOfGloves = -1;
        //        boolean hasIPad = false;
        //        String report = "";
        //
        //        for (int i = 0; i < items.length; i++) {
        //            String itemName = items[i];
        //            double itemPrice = prices[i];
        //            int itemID = itemIDs[i];
        //
        //            if (itemName.equals("Gloves")) {
        //                indexNumOfGloves = i;
        //            }
        //
        //            if (itemName.equals("iPad")) {
        //                hasIPad = true;
        //            }
        //
        //            report += itemName + " - " + itemPrice + " - #" + itemID + "\n";
        //        }
        //
        //        System.out.println("indexNumOfGloves = " + indexNumOfGloves);
        //        System.out.println("hasIPad = " + hasIPad);
        //        System.out.println(report);

    }

}
/*
Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID
 */