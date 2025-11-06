import java.util.Scanner;
public class SiakadFor16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int lowest = 0, highest = 100, grade;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            grade = input.nextInt();
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade > highest) {
                highest = grade;
            }
        }
        System.out.println("Lowest number is: " + lowest);
        System.out.println("Highest number is: " + highest);

input.close();
        }
        
}