// package Assignments.Week4;

// public class PracticeArrayMethods {

//     public static boolean noNegatives(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] < 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public static void absoluteValues(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] < 0) {
//                 a[i]*= -1;
//             } else {
//                 a[i] = a[i];
//             }
//         }
//     }
    
//     public static int eCount(char[] a) {
//         int count = 0;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i].isLetter('e')) {
//                 count += 1;
//             }
//         }
//         return count;
//     }

//     public static int charCount(char[] a, char targetChar) {
//         int count = 0;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i].isLetter(targetChar)){
//                 count += 1;
//             }
//         }

//     public static boolean isSorted(int[] a) {
//         int[] b = Array.sort(a);
//         for (int i  = 0;  i < a.lenght(); i++) {
//             if (a[i] != b[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public static boolean equalNeighbors(char[] a) {
//         for (int i = 0; i < a.length - 1; i++) {
//             if (a[i] == a[i + 1]) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static int xCount(String[] a) {
//         return charCount(a, 'x');
//     }

//     public static int[] createIntArray(int count, int initialValue) {
//         ???
//     }

//     public static String[] stringsWithXs(String[] a) {
//         ???
//     }

//     public static void main(String[] args) {    
//     }
// }
