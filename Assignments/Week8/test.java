package Assignments.Week8;

public class test {

    public static boolean allEqual(int [] a) {
        boolean equalArray = true;
        while (equalArray) {
            if (a.length == 0) {
                equalArray = false;
                break;
            } else if (a.length == 1) {
                break;
            }

            int number = a[0];
            for (int i = 1; i < a.length; i++) {
                if (number != a[i]) {
                    equalArray = false;
                    break;
                }
            }

            break;
        }
        return equalArray;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1};
        int[] b = {};
        int[] c = {1};
        int[] d = {1,1,2,1};

        System.out.printf("Is a equal: %b \n", allEqual(a));
        System.out.printf("Is b equal: %b \n", allEqual(b));
        System.out.printf("Is c equal: %b \n", allEqual(c));
        System.out.printf("Is d equal: %b \n", allEqual(d));
    }   
}
