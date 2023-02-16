import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program calculates the letter grade from the integer quiz grade.");
        System.out.print("Enter quiz grade: ");
        int grade = scanner.nextInt();

        char letterGrade;

        if (grade >= 90 && grade <= 100) {
            letterGrade = 'A';
        } else if (grade >= 80 && grade <= 89) {
            letterGrade = 'B';
        } else if (grade >= 70 && grade <= 79) {
            letterGrade = 'C';
        } else if (grade >= 60 && grade <= 69) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Your quiz letter grade is " + letterGrade);

        scanner.close();
    }
}
