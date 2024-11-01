import java.util.Scanner;

public class IT24300173Lab3Q1B{
	
	public static void main(String[] args){
	
	double pricePerKg,quantity,totalAmount,discount,finalAmount;
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the price of 1kg of rice:");
	pricePerKg = scanner.nextDouble();

	System.out.print("Enter the number of kilograms you want to buy:");
	quantity = scanner.nextDouble();

	totalAmount = pricePerKg * quantity;
	
	discount = totalAmount * 0.10;
	
	finalAmount = totalAmount - discount;
	
	System.out.println("The total amount with discount is:"+finalAmount);
	scanner.close();
	}
}