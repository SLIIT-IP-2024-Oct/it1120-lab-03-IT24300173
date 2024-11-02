import java.util.Scanner;
public class IT24300173Lab3Q4{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a five-digit number:");
	int number = scanner.nextInt();

	int divisor = 10000;

	for(int i = 0; i < 5; i++){
		int digit = number / divisor;
		System.out.print(digit +" ");
		number %= divisor;
		divisor /= 10;
		}
	scanner.close();
	}
}
