package Assignments.Week14;
import java.util.ArrayList;

public class Board {

    static final int ROW = 10;
    public ArrayList<ArrayList<String>> user = new ArrayList<> (ROW);
    private int generation = 0;
   
    
    //ArrayList to check if point is entered by user or not.
    //0 denotes not checked.1 denotes checked and miss.2 denotes checked and hit.
    // ArrayList<Integer> user;
        
    //ArrayList of Ships
    // ArrayList<Ship> ships;
    
    //ArrayList to check if ship has sunk or not.
    // ArrayList<Boolean> isSunk;
    
    //Boolean to check if game is over or not.
    // boolean gameOver;
        
    //Constructor of Board Class
    public Board() {
        for (int i = 0; i < ROW; i ++) {
            user.add(new ArrayList<>());
        }

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < ROW; c++) {
                user.get(r).add("~");
            }
        }
        // user=new ArrayList<Integer>(PTS);


        // ships=new ArrayList<Ship>(5);
        // isSunk=new ArrayList<Boolean>(5);
        // gameOver=false;
        // addShips();
    }

    //Function to display board
    public void display() {
        System.out.printf("\nRound %d\n\n", getGeneration());

        for (int r = 0; r < ROW; r++) {
            System.out.printf("%d ",((ROW - 1) - r));
            for (int c = 0; c < ROW; c++) {
                System.out.printf("%s ",user.get(r).get(c));
            }

            System.out.println();
        }

        for(int i = 0; i < ROW + 1; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.printf("%d ",(i- 1));
            }
        }
        System.out.println();
        addGeneration();
        // UserInput.getCoordinates();

    }
 
    public void replaceCell(Point p) {
        // System.out.print('\n' + (p.getX()));
        user.get((ROW-1)-p.getY()).set(p.getX(),"X");
    }

    public int getGeneration() {
        return generation + 1;
    }

    public void addGeneration() {
        generation++;
    }

    //function to add ships
    // public void addShips(){
    //     r = new Random();
    //     x = r.nextInt(9);
    //     y = r.nextInt(9);
        
    //     // for(int i=0;i<5;i++) {
    //         // boolean isVertical=r.nextInt(2)==0?false:true;
    //         int size = r.nextInt(3);
    //         ships.add(new Ship(new Point(x,y),true,size));
    //     // }
    // }
        
//         boolean hit=false;
//         //Check for all the ships
//         for(int i=0;i<ships.size();i++){
//             ships.get(i).shotFiredAtPoint(p);
//             hit=hit || ships.get(i).isHitAtPoint;
            
//             if(ships.get(i).points.size()==ships.get(i).hitCount()){
//                 System.out.println("You sank a ship of length "+ships.get(i).points.size())
//                 isSunk.set(i,true);
//             }
//         }
//         if(hit){
//             System.out.println("Hit!");
//             user.set(index,2);
//         }else{
//             System.out.println("Miss");
//             user.set(index,1);
//         }
        
//         display();
//         gameOver=true;
//         for(int i=0;i<5;i++){
//             if(!isSunk.get(i)){
//                 gameOver=false;
//             }
//         }
//     }
}