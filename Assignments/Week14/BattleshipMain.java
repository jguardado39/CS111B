package Assignments.Week14;

public class BattleshipMain {
    public static void main(String[] args) {
        
        Board board = new Board();
        UserInput u = new UserInput();
        ShipArray s = new ShipArray();
        s.addShips(board);

        do {
            board.display();
            u.getCoordinates(board);
        } while (true);

        // UserInput.getGeneration();


//     Scanner sc=new Scanner(System.in);
//     while(!board.gameOver){
//         //Taking input from User
//         System.out.println("Enter the input coordinates");
//         int x;int y;
//         x=sc.nextInt();
//         y=sc.nextInt();
//         board.UserInput(new Point(x,y));
//     }
//     System.out.println("Game Over");
// }
    }
}
