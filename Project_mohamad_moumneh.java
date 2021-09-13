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
      
      //creates a room object with given parameters (for testing purposes)
      Room testRoom = new Room("Testroom", 14.5, 10, "abundant");
      
      //printing out the testroom 
      System.out.println("here is the test room "); 
      System.out.println("Room name:  " + testRoom.getName());
   
   
   }
}