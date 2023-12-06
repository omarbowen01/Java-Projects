import java.util.ArrayList;
import java.util.Arrays;

//source code to show with an arraylist you can dynamically increase the size with adding elements

public class ArrayLists {
    public static void main (String[] args) {
        
        //create new arraylist with a size of 4
        ArrayList<String> foodlist = new ArrayList<String>(4);

        //add elements to the array list
        foodlist.add("apple");
        foodlist.add("banana");
        foodlist.add("orange");
        foodlist.add("grapes");

        //print out arraylist
        System.out.println(foodlist);

        //dynamically increase size of array to 5 and add kiwis to the 4th index position
        foodlist.add(4, "kiwis");

        //print out new arraylist with 5 elements
        System.out.println(foodlist);


    }
}
