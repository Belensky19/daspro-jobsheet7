import java.util.Scanner;
public class SiakadWhile16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Students: ");
        int total = input.nextInt();
        int i = 0;

        while (i < total) {
            System.out.print("Enter the grade of student " + (i+1)  + ": ");
            int grade = input.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Re-enter a valid grade!.");
                continue; 
            }

            if (grade > 80 && grade <= 100) {
                System.out.println("The grade of student " + (i + 1)+ " is A");
                System.out.println("Grade A - Good, keep the grade!");
            } else if (grade > 73 && grade <= 80) {
                System.out.println("The grade of student " +  (i + 1)+ " is B+");
            } else if (grade > 65 && grade <= 73) {
                System.out.println("The grade of student " + (i + 1)+ " is B");
            } else if (grade > 60 && grade <= 65) {
                System.out.println("The grade of student " +  (i + 1)+ " is C+");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("The grade of student " +  (i + 1)+ " is C");
            } else if (grade > 39 && grade <= 50) {
                System.out.println("The grade of student " +  (i + 1)+ " is D");
            } else { // grade <= 39
                System.out.println("The grade of student " +  (i + 1)+ " is E");
            }

            i++; // update counter at the end of the loop
        }

        
    }
}
        