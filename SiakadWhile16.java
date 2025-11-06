import java.util.Scanner;

public class SiakadWhile16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int total = input.nextInt();

        int i = 0;
        while (i <= total) {
            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            int grade = input.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Re-enter a valid grade!.");
                continue; 
            }

            if (grade > 80 && grade <= 100) {
                System.out.println("The grade of student " + i + " is A");
            } else if (grade > 73) {
                System.out.println("The grade of student " + i + " is B+");
            } else if (grade > 65) {
                System.out.println("The grade of student " + i + " is B");
            } else if (grade > 60) {
                System.out.println("The grade of student " + i + " is C+");
            } else if (grade > 50) {
                System.out.println("The grade of student " + i + " is C");
            } else if (grade > 39) {
                System.out.println("The grade of student " + i + " is D");
            } else {
                System.out.println("The grade of student " + i + " is E");
            }

            i++; // update counter at the end of the loop
        }

        input.close();
    }
}
        