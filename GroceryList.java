import java.util.Scanner;

public class GroceryList {
	public static void main(String[] args) {
		// declare array of 5
		double [] prices = new double[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 prices: ");
		prices[0] = in.nextDouble();
		prices[1] = in.nextDouble();
		prices[2] = in.nextDouble();
		prices[4] = in.nextDouble();
		prices[5] = in.nextDouble();
		double total = prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
		System.out.println("The total for all 5 items is: $%5.2f", total);
		System.out.println();
	}
}

