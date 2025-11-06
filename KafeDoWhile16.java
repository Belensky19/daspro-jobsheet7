import java.util.Scanner;
public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CoffeePrice = 12000;
        int TeaPrice = 7000;
        int BreadPrice = 20000;

        do{
            System.out.print("Enter customer name (type 'cancel' to exit):");
            String customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction cancelled.");
                break;
            }

            System.out.print("Number of coffees: ");
            int coffee = sc.nextInt();
            System.out.print("Number of teas: ");
            int tea = sc.nextInt();
            System.out.print("Number of breads: ");
            int bread = sc.nextInt();

            int totalPrice = (coffee * CoffeePrice) + (tea * TeaPrice) + (bread * BreadPrice);
            System.out.println("Total to be paid: Rp " + totalPrice);

            sc.nextLine(); 
        } while (true);

        System.out.println("All transaction completed.");
        sc.close();
    }
}


