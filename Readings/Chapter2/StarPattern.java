package Readings.Chapter2;

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 6) {
                System.out.println("   *");
            } else if (i == 1 || i == 5){
                System.out.println("  ***");
            } else if (i == 2 || i == 4){
                System.out.println(" *****");
            } else {
                System.out.println("*******");
            }
        }
    }
}