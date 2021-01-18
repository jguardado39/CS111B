package Assignments.Week13.conway;
// import java.util.Random;

public class HowManyNeighbors extends AbstractCell{

	public HowManyNeighbors (int r, int c, ConwayWorld w) {
        super(r, c, w);
	}


    public AbstractCell cellForNextGeneration() {
		HowManyNeighbors next = new HowManyNeighbors(getRow(), getColumn(), world);
		next.setIsAlive(willBeAliveInNextGeneration());
		return next;
    }


    public boolean willBeAliveInNextGeneration() {
		return true;
	}


	@Override
	public char displayCharacter() {
		ConwayCell c = new ConwayCell(getColumn(),getColumn(),world);
		int nc = c.neighborCount();

		return getIsAlive() ? (char)(nc + 48) : '.';
	}
}