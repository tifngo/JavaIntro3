import java.util.Arrays;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
  /*
    Some activities for Array
  */
    
    //create an array (not an ArrayList) called favoriteColors that holds five strings with your favoriteColors and print the entire array to the screen.

    String[] favoriteColors = {"pink", "black", "lilac", "light blue", "burgundy"};

    System.out.println(Arrays.toString(favoriteColors));
  
    //Change the third element of favoriteColors to a different color and print that element to the sceen
    favoriteColors[2] = "green";
    System.out.println(Arrays.toString(favoriteColors));
  
    //Declare and initialize an array of type int called numbers to hold 1000 elements (this should be used later in the loop exercise)
    int[] numbers = new int[1000];
    
  //ArrayList 
    //Declare and initialize an ArrayList so that it holds values of type <Double>. 
    ArrayList<Double> doubleList = new ArrayList<>();
    
    //Using the .add() method, add 5 decimal values to the ArrayList and print it to the screen
    doubleList.add(3.14);
    doubleList.add(3.04);
    doubleList.add(3.1415);
    doubleList.add(3.14222);
    doubleList.add(3.14909);

    System.out.println(doubleList);
    
    //Using the .remove() method, remove the 3rd value in the ArrayList.
    doubleList.remove(2);

    //Print ArrayList to the screen.
    System.out.println(doubleList);
    
    //Now change the last element in the ArrayList and print the new element to the screen 
    doubleList.set(doubleList.size() - 1, 222.08);
    System.out.println(doubleList);
    System.out.println(doubleList.get(doubleList.size() - 1));

    /*
      Some activities for Loops
    */ 
    // write a for loop that prints out numbers 1-1000 and saves these numbers to the empty array you created earlier
    for(int i = 0; i < numbers.length; i ++) {
      numbers[i] = i + 1; 
      // System.out.println(numbers[i]);
    }
    
    // write a while loop that prints the elements of the array you used in the previous exercise. Take care to avoid infinite looping!
    int counter = 0;
    while(counter < 1000) {
      System.out.println(numbers[counter]);
      counter++;
    }
    //write a do-while loop that does the same.
    int counter2 = 0;
    do {
      System.out.println(numbers[counter2]);
      counter2++;
    } while(counter2 < 1000);

    // write an enhanced for loop that iterates over this array and prints the result of that number modulus(%) 3
  for(int num : numbers) {
    System.out.println(num % 3);
  }

    /*
      Some activities for String methods
    */
    // Create two String variables, one holding "Hello" and one holding "world"
    String hello = "Hello";
    String world = "world";

    // using String methods, concatenate these strings together with a space between them so that it reads "Hello world" and save the resulting String to a new variable

    String helloWorld = hello.concat(" " + world);
    System.out.println(helloWorld);

    
    // then, create a for loop that iterates over your new String and prints each letter out using sout
    for(int i = 0; i < helloWorld.length(); i++) {
      System.out.println(helloWorld.charAt(i));
    }
    
  }
}