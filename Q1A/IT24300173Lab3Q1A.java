import java.util.Scanner;

public class IT24300173Lab3Q1A{
	
	public static void main(String[] args){
	
	double pricePerKg,quantity,totalAmount;
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the price of 1kg of rice:");
	pricePerKg = scanner.nextDouble();

	System.out.print("Enter the number of kilograms you want to buy:");
	quantity = scanner.nextDouble();

	totalAmount = pricePerKg * quantity;
	System.out.printf("The total amount is:"+totalAmount);
	scanner.close();
	}
}