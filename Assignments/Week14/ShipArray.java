package Assignments.Week14;
import java.util.ArrayList;
import java.util.Random;

public class ShipArray extends Board{
    private Random r;
    private int x;
    private int y;
    // private int size;
    private ArrayList<Ship> ship = new ArrayList<Ship>(1);
    private Board b;
    private Point p;
    
    //function to add ships
    public void addShips(Board b){
        r = new Random();
        x = r.nextInt(9);
        y = r.nextInt(9);
        p = new Point(x,y);
        
        // for(int i=0;i<5;i++) {
            // boolean isVertical=r.nextInt(2)==0?false:true;
            // size = r.nextInt(3);
            ship.add(new Ship(new Point(x,y),true,1));
        // }
        b.replaceCell(p);
    }

    @Override
    public void replaceCell(Point p) {
        user.get((ROW-1)-p.getY()).set(p.getX(),"1");
    }
}
