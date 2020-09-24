package Readings.Chapter7;

public class LargerThanN {
    
    public static void numberGreaterThan(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1,5,10,2,4,-3,6};
        int[] array2 = {10,12,15,24};
        int num1 = 3;
        int num2 = 12;

        numberGreaterThan(array1, num1);
        numberGreaterThan(array2, num2);

    }
}
