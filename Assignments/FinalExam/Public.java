package Assignments.FinalExam;

public class Public {
    
    public static int landUnsafeCars(FlyingCar[] fc, FlyingCar paceCar, double hardDeck)  {
        int landedCars = 0;

        for (int i = 0; i < fc.length; i++) {
            if (fc[i].isHigherAndFaster(paceCar) && fc[i].altitude < hardDeck) {
                fc[i].land();
                landedCars++;
            }
        }
    
        return landedCars;
    }

    public static void main(String[] args) {
        try {
            System.out.println("1");
            Location l1 = new Location(0.0, 0.0);
         
            System.out.println("2");
            Location l2 = new Location(l1);
         
            System.out.println("3");
            Location l3 = new Location(-5.0, -5.0);
         
            System.out.println("4");
            Location l4 = new Location(-5.0,-5.0);
        // } catch (Exception e) {
        //     System.out.println("caught an exception");
        //  }    
    // }
}
    }
