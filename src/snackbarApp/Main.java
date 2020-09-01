package snackbarApp;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {

		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips",36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel",30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water",20, 2.75, drink.getId());

		System.out.println("\n*** Snack Bar ***\n");

		var quantity = 3;
        jane.buySnacks(quantity, soda.getCost());
        soda.buySnack(quantity);
        System.out.println("Customer 1 cash on hand " + "$" + jane.getCash());
        System.out.println("Quantity of snack 4 is " + soda.getQuantity());

        quantity = 1;
        jane.buySnacks(quantity, pretzel.getCost());
        pretzel.buySnack(quantity);
        System.out.println("\nCustomer 1 cash on hand " + "$" + jane.getCash());
        System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());

        quantity = 2;
        bob.buySnacks(quantity, soda.getCost());
        soda.buySnack(quantity);
        System.out.println("\nCustomer 2 cash on hand " + "$" + bob.getCash());
        System.out.println("Quantity of snack 4 is " + soda.getQuantity());

        double newMoney = 10;
        jane.addCash(newMoney);
        System.out.println("\nCustomer 1 cash on hand " + "$" + jane.getCash());

        quantity = 1;
        jane.buySnacks(quantity, chocolateBar.getCost());
        chocolateBar.buySnack(quantity);
        System.out.println("\nCustomer 1 cash on hand " + "$" + jane.getCash());
        System.out.println("Quantity of snack 2 is " + chocolateBar.getQuantity());

        quantity = 12;
        pretzel.addQuantity(quantity);
        System.out.println("\nQuantity of snack 3 is " + pretzel.getQuantity());

        quantity = 3;
        bob.buySnacks(quantity, pretzel.getCost());
        pretzel.buySnack(quantity);

        System.out.println("\nCustomer 2 cash on hand " + "$" + bob.getCash());
        System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());
	}
}