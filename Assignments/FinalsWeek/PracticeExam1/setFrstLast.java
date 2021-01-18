package Assignments.FinalsWeek.PracticeExam1;

public class setFrstLast {
    /*
    *  Write a static method that accepts an array of integers as a parameter,    *
    *  and sets the first and last elements to 0. If there are no elements to set * 
    *  your method should throw an IllegalArgumentException.                      *
    */
    
    public static void setFirstLast(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("No elements to set!");
        } else {
            arr[0] = 0;
            arr[arr.length - 1] = 0; 
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = null;

        setFirstLast(arr1);
    }
}
