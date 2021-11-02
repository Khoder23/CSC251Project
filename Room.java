//This program creates a room class

public class Room
{
   private String name; 
   private double length;
   private double width; 
   private String shade;
   private AirConditioner AC;
   
    //this no-arg constructor allows us to create a room class with default initialization
    
    public Room()
    {
      name = "";
      length = 0;
      width = 0;
      shade = ""; 
    }
    
    /*this constructor allows us to create a room with set parameters
    @param aName to set a name for the room
    @param aLength to set a length for the room
    @param aWidth to set a width for the room
    @param aShade to set shade amount for the room*/
    
    public Room(String name, double length, double width, String shade, AirConditioner AC)
    {
      this.name = name;
      this.length = length;
      this.width = width;
      this.shade = shade;
      this.AC = new AirConditioner(AC);   
    }
    
    /*the setname method stores a name for the room
    @param roomName to store the name*/
    
    public void setName(String roomName) 
    {
      name = roomName;
    }
    
    /*the setlength method stores a length for the room 
    @param len to store the length of the room*/
    
    public void setLength(double length)
    {
      this.length = length;
    }
    
    /*the setwidth method stores a width for the room 
    @param wid to store the width of the room*/
    
    public void setWidth(double width)
    {
      this.width = width;
    }
    
    /*the setshade method figures out what kind of shade the room gets (little, moderate, or abundant)
    @param shadetype to store the int value (1 for little, 2 for moderate, or 3 for abundant)*/
    
    public void setShade(int shadetype)
    {
      if (shadetype == 1)
      {
         shade = "Little";
      }
      else if (shadetype == 2)
      {
         shade = "Moderate";
      }
      else
      {
         shade = "Abundant";
      }
    }
    
    //the setAC method will store an AC object
    public void setAC(AirConditioner AC)
    {
      this.AC = new AirConditioner(AC);
    }
    
    //the getname method will return the name of the room
    public String getName() 
    {
      return name;
    }
    
    //the getlength method will return the length of the room
    
    public double getLength()
    {
      return length;
    }
    
    //the getwidth method will return the width of the room
    public double getWidth()
    {
      return width;
    }
    
    //the getshade method will return the shade type of the room
    public String getShade()
    {
      return shade;
    }
    
    //the getarea method will calculate the area of the room and return that value
    
    public double getArea()
    {
      return length * width;
    }
    
    //the getcooling method will calculate and return the required cooling capacity to properly cool a room
    
    public double getCooling()
    {
      //setting a multiplier depending on the type of shading
      double shadeMult = 1; 
      
      //getting the area for the room
      double area = getArea();
      
      //a variable to store our air conditioner capacity in BTU's 
      double btu = 0;
      
      //using our shade value to set the proper multiplier 
      if (shade.equals("Little"))
      {
         shadeMult = 1.15;
      } 
      else if (shade.equals("Abundant"))
      {
         shadeMult = 0.9;
      } 
      
      //using area value to set the proper BTU's 
      if (area < 250) 
      {
         btu = 5500;
      }  
      else if (area < 500) 
      {
         btu = 10000;
      }  
      else if (area < 1000) 
      {
         btu = 17500;
      } 
      else  
      {
         btu = 24000;
      }  
      
      //multiplying our btu value with the multiplier to get the final value then returning it
      btu = btu * shadeMult;
      
      return btu; 
    }
    
    //the getAC method will return the AC unit 
    public AirConditioner getAC()
    {
      return new AirConditioner(AC);
    }
    
    //the hasAdequateCooling method will check the rooms air conditioner to see if it has a high enough capacity to adequately cool the room 
    public String hasAdequateCooling()
    {
      String hasCooling = "";
   
      if (getCooling() <= AC.getCooling())
      {
         hasCooling = "This room is adequately cooled.";
      }
      
      else if (getCooling() > AC.getCooling())
      {
         hasCooling = "This room is not adequately cooled.";
      }
      return hasCooling;
    }
      
      
    
}   
  