package Assignments.Week13.conway;

public class BlinkerCell extends AbstractCell {
    
    public BlinkerCell (int r, int c, ConwayWorld w) {
        super(r, c, w);
    }

    public AbstractCell cellForNextGeneration() {
        BlinkerCell next = new BlinkerCell(getRow(), getColumn(),world);
        next.setIsAlive(willBeAliveInNextGeneration());
        return next;
    }

    public boolean willBeAliveInNextGeneration() {
        boolean aliveNextGen;
        if(getIsAlive()) {
            aliveNextGen = false;
        } else {
            aliveNextGen = true;
        }
        return aliveNextGen;
    }


    public char displayCharacter() {
        char nextGenChar;
        if(getIsAlive()) {
            nextGenChar = '+';
        } else {
            nextGenChar = 'X';
        }

        return nextGenChar;
    }
}