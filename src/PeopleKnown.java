// Assignment statement with same variable on both sides
// Commonly, a variable appears on both the right and left side of the = operator. Ex: If numItems is 5, after numItems = numItems + 1; executes, numItems will be 6. The statement reads the value of numItems (5), adds 1, and assigns numItems with the result of 6, which replaces the value previously held in numItems.

import java.util.Scanner;

public class PeopleKnown {
    public static void main(String[] args) {
      int yourFriends;
      int totalFriends;
 
      System.out.print("Enter the number of people you know: ");
      Scanner scnr = new Scanner(System.in);
      yourFriends = scnr.nextInt();
 
      totalFriends = yourFriends;
      System.out.println(" You know " + totalFriends + " people.");
      totalFriends = totalFriends * yourFriends;
      System.out.println(" Those people know " + totalFriends + " people.");
      totalFriends = totalFriends * yourFriends;
      System.out.println(" And they know " + totalFriends + " people.");

    }
    
}
