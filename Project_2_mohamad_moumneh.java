//this program reads inputs from a room file then displays the room objects in the file 
import java.util.Scanner;
import java.io.*; //to read from file 
import java.util.ArrayList; //to create an arraylist 

public class Project_2_mohamad_moumneh
{
   public static void main(String[] args) throws IOException
   {
   
      //creating variables to hold in data read by the scanner 
      String roomName = "",
             roomShade = "";
         
      double roomLength = 0,
             roomWidth = 0;
      
      //declaring variables for counting shade 
      int a = 0, //abundant
          m = 0, //moderate
          l = 0; //little      
      
      //passing the room file to be read by the scanner object 
      File myFile = new File("Rooms.txt"); 
      Scanner roomFile = new Scanner(myFile); 
      
      //creating the arraylist that will hold our room objects 
      ArrayList<Room> roomList = new ArrayList<>();
        
      //iterates over the file and sets the variables to the proper values 
      while (roomFile.hasNext())
      {
         roomName = roomFile.nextLine();
         roomLength = roomFile.nextDouble();
         roomWidth = roomFile.nextDouble();
         roomShade = roomFile.next();
            
         //to clear buffers 
         if (roomFile.hasNext())
         {
            roomFile.nextLine();
            roomFile.nextLine();
         }
         
         //creates a room object with the above values (staying inside the loop otherwise the values will be overwritten as the loop iterates) 
         Room room = new Room(roomName, roomLength, roomWidth, roomShade); 
         
         //while still inside the loop for the same reason as above, adds our room object to the array list
         roomList.add(room);     
      }
      
      for (int i = 0; i < roomList.size(); i++)
      {
         //calling all our getters to display the room information to the user
         System.out.println("\n\nRoom Name: " + roomList.get(i).getName());
         System.out.println("\nRoom Area (in square feet): " + roomList.get(i).getArea());
         System.out.println("\nAmount of Shade: " + roomList.get(i).getShade());
         System.out.println("\nBTUs Per Hour needed: " + roomList.get(i).getCooling());
         
         //incrementing our shade amount based on the type of shade in our room object
        if (roomList.get(i).getShade().equals("Abundant")) 
         a++; 
      
        if (roomList.get(i).getShade().equals("Moderate")) 
          m++; 
      
        if (roomList.get(i).getShade().equals("Little")) 
         l++; 
      } 
      
      //displaying amount of rooms based on shade 
      System.out.println("\nnumber of rooms with little shade: " + l);
      System.out.println("\nnumber of rooms with moderate shade: " + m);
      System.out.println("\nnumber of rooms with abundant shade: " + a);       
   }
}