import java.util.Scanner;

public class IT24300173Lab3Q2{

	public static void main(String[] args){

	double monthlySalary,otHours,otHourlyRate,otAmount,totalSalary;
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the monthly salary:");
	monthlySalary = scanner.nextDouble();

	System.out.print("Enter the number of OT hours:");
	otHours = scanner.nextDouble();

	System.out.print("Enter the OT hours:");
	otHourlyRate = scanner.nextDouble();

	otAmount = otHours * otHourlyRate;
	totalSalary = monthlySalary + otAmount;
	System.out.printf("The total salary including OT is:"+totalSalary);
	scanner.close();
	}
}
		