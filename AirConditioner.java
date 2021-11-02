//This program creates a room class

public class AirConditioner
{
   //fields for our class 
   private String Manufacturer;
   private String Type; 
   private int coolingCap; 
   
   //no-arg constructor 
   public AirConditioner() 
   {
      Manufacturer = "";
      Type = ""; 
      coolingCap = 0; 
   }
   
   //Constructor with arguments for manufacturer, type of unit, and cooling capacity 
   public AirConditioner(String Manufacturer, String Type, int coolingCap) 
   {
      this.Manufacturer = Manufacturer; 
      this.Type = Type; 
      this.coolingCap = coolingCap; 
   }
   
   //this copy constructor initializes the AirConditioner object as a copy of another AirConditioner object
   public AirConditioner(AirConditioner object2)
   {
      Manufacturer = object2.Manufacturer;
      Type = object2.Type;
      coolingCap = object2.coolingCap;
   }
   
   //the setManufacturer method stores a manufacturer for the air conditioner 
   public void setManufacturer(String Manufacturer)
   {
      this.Manufacturer = Manufacturer;
   }
   
   //the setType method stores which type of unit the air conditioner will be
   public void setType(String Type)
   {
      this.Type = Type;
   }
   
   //the setCooling method will set a cooling capacity for the air conditioner 
   public void setCooling(int coolingCap)
   {
      this.coolingCap = coolingCap;
   }
   
   //the getManufacturer method will return the manufacturer for the unit
   public String getManufacturer()
   {
      return Manufacturer;
   }
   
   //the getType method will return the type of air conditioner 
   public String getType()
   {
      return Type;
   }
   
   //the getCooling method will return a cooling capacity for the unit
   public int getCooling()
   {
      return coolingCap;
   }
   
   //the toString method will return information about an air conditioner unit
   public String toString()
   {
      String str = "The Air Conditioner Manufacturer: " + Manufacturer +
                   "\nThe AC type: " + Type +
                   "\nThe AC cooling capacity: " + coolingCap;
      return str; 
   }  
}
   
   
      