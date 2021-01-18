package Assignments.Week14;

public abstract class AbstractCell {
    private int row;
    private int col;

    protected Point point;

    public AbstractCell(int r, int c, Point p) {
        row = r;
        col = c;
        point = p;
    }

    public abstract void replaceCell();
}
