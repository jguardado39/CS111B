package Assignments.Week13.conway;

import java.util.Random;

public class RandomColony extends AbstractCell {
    private Random rand = new Random();
    private int r = rand.nextInt(20);
    private int c = rand.nextInt(20);

    public RandomColony(int r, int c, ConwayWorld w) {
        super(r, c, w);
    }

    public RandomColony(ConwayWorld w) {
        super(1, 1, w);
    }

    public AbstractCell cellForNextGeneration() {
        RandomColony next = new RandomColony(getRow(), getColumn(), world);
        next.setIsAlive(willBeAliveInNextGeneration());
        return next;
    }

    @Override
    public boolean willBeAliveInNextGeneration() {
        // return true;
         return new ConwayCell(getRow(),getColumn(),world).willBeAliveInNextGeneration();
    }

    @Override
    public int getRow() {
        return this.r;
    }

    @Override
    public int getColumn() {
        return this.c;
    }
}
