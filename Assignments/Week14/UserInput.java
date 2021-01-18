package Assignments.Week14;
import java.util.Scanner;

public class UserInput extends Board {
    private int x;
    private int y;
    private Point p;

    private Scanner s = new Scanner(System.in);

    public UserInput() {
        x = 1;
        y = 1;
    }

    // function to get input from user
    public void getCoordinates(Board b) {
        System.out.print("Enter the coordinates: ");

        x = s.nextInt();
        y = s.nextInt();
                
        p = new Point(x, y);
        b.replaceCell(p);



        // int index = p.x*9+orp.y;

        // if(index<0 || index>80 || user.get(index)!=0){
        //     System.out.println("Enter other Point");
        //     return;
        // }

    }
}
