package Assignments.Week13.conway;
import java.util.*;

// import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Abs;

public class ConwayMain {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 1;	
		ConwayWorld world = new ConwayWorld();
		
		// Add some live conway cells, in a horizontal line		
		for (int i = 0; i < 8; i++) {
			ConwayCell c = new ConwayCell(5, 5 + i, world);
			c.setIsAlive(true);
			world.replaceCell(c);
		}
		
		// Add an always-alive cells
		AbstractCell a = new AlwaysAliveCell(12, 12, world);
		world.replaceCell(a);
			
		// Add an always-dead cells
		AbstractCell n = new NeverAliveCell(17, 17, world);
		world.replaceCell(n);

		// Add an blinker cell
		AbstractCell b = new BlinkerCell(2, 2, world);
		world.replaceCell(b);

		// Add new cell that counts number of neighbors
		AbstractCell nc = new HowManyNeighbors(5, 5, world);
		world.replaceCell(nc);

			
		// Go!	
		do {
			System.out.printf("\nGeneration %d\n",count);
			world.display();
			world.advanceToNextGeneration();

			// Will randomly add a new cell to the grid 
			if (count % 3 == 0) {
				AbstractCell rc = new RandomColony(world);
				world.replaceCell(rc);
			}
			
			System.out.print("Another? (y/n): ");
			count++;
		} while (input.nextLine().charAt(0) == 'y');
	}
}