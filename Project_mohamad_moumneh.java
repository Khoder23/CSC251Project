//this program demos the room class 

import java.util.Scanner;

public class Project_mohamad_moumneh
{
   public static void main(String[] args)
   {
      //imports a scanner object for use 
      Scanner keyboard = new Scanner(System.in);
      
      //creates a room object that will be fed info by the user 
      Room bedroom = new Room(); 
      
     /* //creates a room object with given parameters (for testing purposes)
      Room testRoom = new Room("Testroom", 14.5, 10, "abundant");
      
      //printing out the testroom 
      System.out.println("here is the test room: "); 
      System.out.println("Room Name: " + testRoom.getName());
      System.out.println("Room Area (in square feet): " + testRoom.getArea());
      System.out.println("Amount of Shade: " + testRoom.getShade());
      System.out.println("BTUs Per Hour needed: " + testRoom.getCooling()); */
      
      //declaring variables
      String roomName = "";
      
      double roomLength = 0,
             roomWidth= 0;
      
      int menuChoice = 0; 
      
      //prompts user to enter the name of the room then sends it to the setname method
      System.out.print("Please enter the name of the room: "); 
      roomName = keyboard.nextLine();
      bedroom.setName(roomName);
      
      //prompts user to enter the length of the room then sends it to the setlength method
      System.out.print("\nPlease enter the length of the room (in feet): ");
      roomLength = keyboard.nextDouble();
      bedroom.setLength(roomLength);
      
      //promts user to enter the width of the room then sends it to the setwidth method
      System.out.print("\nPlease enter the width of the room (in feet): ");
      roomWidth = keyboard.nextDouble(); 
      bedroom.setWidth(roomWidth);
      
      //prints a menu to the user asking for the amount of shade a room receives then sends it to the setshade method 
      System.out.println("\nWhat is the amount of shade that this room receives?");
      System.out.println("\n\t1. Little Shade");
      System.out.println("\t2. Moderate Shade");
      System.out.println("\t3. Abundant Shade");
      System.out.print("\nPlease select from the options above: "); 
      menuChoice = keyboard.nextInt(); 
      
      //input validation for the menu
      while (menuChoice < 1 || menuChoice > 3)
      {
         System.out.print("Invalid input, Please enter an option from the menu above: ");
         menuChoice = keyboard.nextInt();
      }
         bedroom.setShade(menuChoice); 
         
      //calling all our getters to display the information to the user
      System.out.println("\n\nRoom Name: " + bedroom.getName());
      System.out.println("\nRoom Area (in square feet): " + bedroom.getArea());
      System.out.println("\nAmount of Shade: " + bedroom.getShade());
      System.out.println("\nBTUs Per Hour needed: " + bedroom.getCooling());
         
   }
}