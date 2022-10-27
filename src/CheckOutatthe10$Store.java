import java.util.Scanner;

public class CheckOutatthe10$Store {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double item;
        double totalCost = 0;
        while (true) {
            item = Safeinput.getRangeDouble(console, "Enter a price: ", 0.50, 9.99);
            totalCost += item;
            System.out.printf("The total cost is: %5.2f", totalCost);
            System.out.println("\n");
            Safeinput.getYNConfirm(console, "Anymore items?");



        }
    }
}