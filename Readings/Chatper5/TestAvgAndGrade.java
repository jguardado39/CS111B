package Readings.Chatper5;
import java.util.Scanner;

/*
*
* Write a program that asks the user to enter five test scores. The program should display a letter grade for each score and the average test score. Write the following methods in the program:
*
* calcAverage:
* This method should accept five test scores as arguments and return the average of the scores.
* 
* determineGrade:
* This method should accept a test score as an argument and return a letter grade for the score, based on the following grading scale:
*
* Score Letter Grade
* 90-100 A
* 80-89 B
* 70-79 C
* 60-69 D
* Below 60 F
*
* Sample Run
* java TestAvgAndGrade
*
*  Enter test grade for student 1:55↵
*  Enter test grade for student 2:65↵
*  Enter test grade for student 3:75↵
*  Enter test grade for student 4:85↵
*  Enter test grade for student 5:95↵
*  The letter grades are as follows:↵
* Student 1: F↵
* Student 2: D↵
* Student 3: C↵
* Student 4: B↵
* Student 5: A↵
* The average grade was: 75.00↵
*
*/

public class TestAvgAndGrade {
    public static void main(String[] args) {
        int score[] = new int[5];
        score = Scores();

        displayGrades(score);
        double averageScore = averageGrade(score);
        System.out.printf("The average grade was: %.2f", averageScore);
        }

    public static int[] Scores() {
        int studentScores[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int score = studentTest(i);
            studentScores[i] = score;
        }
        return studentScores;
    }

    public static int studentTest(int studentNumber) {
        int score;
        Scanner input = new Scanner(System.in); 
        System.out.printf("Enter test grade for student %d: ", (studentNumber + 1));

        return score = input.nextInt();
    }

    public static void displayGrades(int[] studentScores) {
        System.out.println("The letter grades are as follows:");
        for (int i = 0; i < 5; i++) {
            char letterGrade = evaluateGrade(studentScores[i]);
            System.out.printf("Student %d: %c\n", (i + 1), letterGrade);
        }
    }

    public static char evaluateGrade (int studentScore) {
        if (studentScore >= 90) {
            return 'A';
        } else if (studentScore >= 80) {
            return 'B';
        } else if (studentScore >= 70) {
            return 'C';
        } else if (studentScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static double averageGrade(int[] scores) {
        double allScores = 0, numberOfScores = 5;
        for (int i = 0; i < 5; i++) {
            allScores += scores[i];
        }
        return allScores / numberOfScores;

    }
}