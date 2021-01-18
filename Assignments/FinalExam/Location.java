package Assignments.FinalExam;

public class Location {
  
    private double latitude, longitude;
   
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
       
        System.out.println("In 2 arg constructor...");
       
        if (latitude < 0 || longitude < 0) {
            throw new IllegalArgumentException("Negative values.");
        }
       
        System.out.println("Looks good.");
    }
 
    
    public Location(Location location) {
        this(location.latitude, location.longitude);
    }
 
    // Getters and setters here...

    // try {
    //     System.out.println("1");
    //     Location l1 = new Location(0.0, 0.0);
     
    //     System.out.println("2");
    //     Location l2 = new Location(l1);
     
    //     System.out.println("3");
    //     Location l3 = new Location(-5.0, -5.0);
     
    //     System.out.println("4");
    //     Location l4 = new Location(l3);
    // } catch (Exception e) {
    //     System.out.println("caught an exception");
    //  }

}
