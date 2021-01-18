package Assignments.Week12.GridWriter;

public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
		
		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyCircle(25, 20, 12));
		gw.add(new MyCircle(25, 20, 5));
		
		gw.add(new MyRectangle(25, 25, 20, 15));
		gw.add(new MyRectangle(5, 5, 3, 4));
		gw.add(new MyRectangle(40, 0, 10, 10));
		// GridItem j = gw.get(2);
		gw.display();

		try {
			for (int i = 0; i < gw.size(); i++) {
				System.out.println(gw.get(i).getArea());
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}