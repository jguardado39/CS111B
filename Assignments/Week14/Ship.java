package Assignments.Week14;
import java.util.ArrayList;
// import java.util.List;

// import org.graalvm.compiler.hotspot.phases.aot.ReplaceConstantNodesPhase;

public class Ship extends Board {
    private ArrayList<Point> points;
    private ArrayList<Boolean> hit;
    // private Board board;

    //Constructor of Ship Class
    public Ship(Point origin, boolean isVertical, int length) {
        
        points = new ArrayList<Point>();
        // hit = new ArrayList<Boolean>();
        
        // for(int i = 0; i < length; i++) {
            int x1 = origin.getX();
            int y1 = origin.getY();

            // if(isVertical) {
            //     y1 += i;
            // } else {
            //     x1 += i;
            // }
            Point p = new Point(x1,y1);
            points.add(p);
            System.out.printf("X:%d , Y:%d\n",p.getX(),p.getY());
            // hit.add(false);
        // }
    }

    // public void replaceCell(Point p) {
    //     // System.out.print('\n' + (p.getX()));
    //     user.get((ROW-1)-p.getY()).set(p.getX(),"X");
    // }

    //To check if p is in ship
    public boolean containsPoint(Point p) {
        boolean isShip = false;

        for(int i = 0; i < points.size(); i++) {
            if(points.get(i).getX() == p.getX() && points.get(i).getY() == p.getY()) {
                isShip = true;
            }
        }

        return isShip;
    }


    //To check if ship collides with other ship
    public boolean collidesWith(Ship s) {
        boolean doesItCollide = false;

        for(int i = 0; i < points.size(); i++) {
            for(int j = 0; j < s.points.size(); j++) {
                if(points.get(i).getX() == s.points.get(j).getY() && 
                   points.get(i).getY() == s.points.get(j).getY()) {
                    doesItCollide = true;
                }
            }
        }

        return doesItCollide;
    }
    

    //To fire a shot at Point p
    public void shotFiredAtPoint(Point p) {
        if(!containsPoint(p)){return ;}
        
        for(int i = 0; i < points.size(); i++) {
            if(points.get(i).getX() == p.getX() && points.get(i).getY() == p.getY()) {
                hit.set(i,true);
            }
        }
    }
    

    //to check if Point has been hit
    public boolean isHitAtPoint(Point p) {
        boolean isHit = true;

        if(!containsPoint(p)){
            isHit = false;
        }

        for(int i = 0; i < points.size(); i++) {
            if(points.get(i).getX() == p.getX() && points.get(i).getY() == p.getY()){
                return hit.get(i);
            }
        }
        return isHit;
    }
    

    //Count of hits
   public int hitCount(){
        int count = 0;

        for(int i = 0; i< hit.size(); i++) {
            if(hit.get(i)) {
                count++;
            }
        }

        return count;
    }
}