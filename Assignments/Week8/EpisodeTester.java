package Assignments.Week8;

public class EpisodeTester {
    public static void main(String[] args) {
        Episode e1 = new Episode("Modern Family", 8, 11);
        Episode e2 = new Episode("Modern Family", 2, 22);
        Episode e3 = new Episode("Modern Family", 1, 2);

        Episode e4 = new Episode("Modern Family");

        if (e1.equals(e2)) {
            System.out.println("same!");
        } else {
            System.out.println("not the same!");
        }

        if (e4.comesBefore(e3)) {
            System.out.println("yes!");
        } else {
            System.out.println("no!");
        }



    }
}
