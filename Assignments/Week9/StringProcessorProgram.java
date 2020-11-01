package Assignments.Week9;
import java.util.Scanner;

/*
*
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*
*/

public class StringProcessorProgram {
    /*
    * @param sp StringProcessor class
    */
    public static void runTest (StringProcessor sp) {
        System.out.printf("Word:           %d\n",sp.wordCount());
        System.out.printf("Uppercase:      %d\n",sp.uppercaseCount());
        System.out.printf("Digits:         %d\n",sp.digitCount());
        System.out.printf("Digit Words:    %d\n",sp.digitWordCount());

        System.out.printf("Line with whitespace removed:   \"%s\"\n",sp.getNoSpaceString());
        System.out.printf("Line with vowels replaced:      \"%s\"\n",sp.getNoVowelString());
        System.out.printf("Line with digit words replaced: \"%s\"\n",sp.getNoDigitWordString());

        // Extra line for astetic
        System.out.println();
    }


    public static void main(String[] args) {
        String str;
        boolean doAgain;
        Scanner keyboard = new Scanner(System.in);
    
        do {
            System.out.print("Enter a line of text: ");
            str = keyboard.nextLine();

            StringProcessor processor = new StringProcessor(str);
            runTest(processor);

            System.out.print("do you want to enter another? (y/n): ");
            char input = keyboard.next().charAt(0);

            if (input == 'y' || input == 'Y') {
                doAgain = true;
            } else {
                doAgain = false;
            }

            // Resets scanner so can be used again
            keyboard.nextLine();
        } while (doAgain);
    }
}