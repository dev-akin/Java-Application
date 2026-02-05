import java.util.Scanner;

enum CustomerType {
    REGULAR,
    BUSINESS,
    VIP
}

public class ElectricityBill {

    public static double calculateBill(int units, CustomerType type) {
        double rate;

        // Determine tariff using if-else
        if (units <= 100) {
            rate = 30;
        } else if (units <= 300) {
            rate = 25;
        } else {
            rate = 20;
        }

        double amount = units * rate;

        // Apply discount using switch
        switch (type) {
            case BUSINESS:
                amount = amount - (amount * 0.05);  // 5% discount
                break;

            case VIP:
                amount = amount - (amount * 0.10);  // 10% discount
                break;

            case REGULAR:
            default:
                break; // No discount
        }

        return amount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input customer name
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        // Input units consumed
        System.out.print("Enter units consumed: ");
        int units = input.nextInt();
        input.nextLine(); // Consume leftover newline

        // Show enum options
        System.out.println("Enter customer type (REGULAR, BUSINESS, VIP): ");
        String typeInput = input.nextLine().toUpperCase();

        CustomerType type = CustomerType.valueOf(typeInput);

        // Bill breakdown loop (every 50 units)
        System.out.println("\n--- BILL BREAKDOWN (Per 50 units block) ---");
        int remainingUnits = units;
        int block = 1;

        while (remainingUnits > 0) {
            int blockUnits = Math.min(50, remainingUnits);
            System.out.println("Block " + block + ": " + blockUnits + " units");
            remainingUnits -= blockUnits;
            block++;
        }

        // Calculate total bill
        double total = calculateBill(units, type);

        System.out.println("\n-----------------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + type);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: ₦" + total);
        System.out.println("-----------------------------------------");
    }
}
