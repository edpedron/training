import java.util.Scanner;

public class TraveCosts {
	public static void main (String[] args) {
		double distance, mpg, pricePerGal; totalCost;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total distance in miles: ");
		distance = in.nextDouble();
		System.out.println("Enter the mpg for the vehicle: ");
		mpg = in.nextDouble();
		System.out.println("Enter the price of one gallon of gas: ");
		pricePerGal = in.nextDouble();

		totalCost = (distance/mpg)*pricePerGal;
		System.out.println("The trip is going to cost $%5.2f", totalCost);
		System.out.println();
	}
}

