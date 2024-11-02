import java.util.Scanner;

public class IT24300173Lab3Q3{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the Rupee amount:");

	int amount = scanner.nextInt();

	int notes5000 = 0;
	int notes1000 = 0;
	int notes500 = 0;
	int notes200 = 0;
	int notes100 = 0;
	int notes50 = 0;
	int notes20 = 0;
	int notes10 = 0;
	int notes5 = 0;
	int notes2 = 0;
	int notes1 = 0;

	notes5000 = amount / 5000;
	amount %= 5000;

	notes1000 = amount / 1000;
	amount %= 1000;

	notes500 = amount / 500;
	amount %= 500;

	notes200 = amount / 200;
	amount %= 200;

	notes100 = amount / 100;
	amount %= 100;

	notes50 = amount / 50;
	amount %= 50;

	notes20 = amount / 20;
	amount %= 20;

	notes10 = amount / 10;
	amount %= 10;

	notes5 = amount / 5;
	amount %= 5;

	notes2 = amount / 2;
	amount %= 2;

	notes1 = amount;

	System.out.println("5000 Notes -"+notes5000);
	System.out.println("1000 Notes -"+notes1000);
	System.out.println("500 Notes -"+notes500);
	System.out.println("200 Notes -"+notes200);
	System.out.println("100 Notes -"+notes100);
	System.out.println("50 Notes -"+notes50);
	System.out.println("20 Notes -"+notes20);
	System.out.println("10 Notes -"+notes10);
	System.out.println("5 Notes -"+notes5);
	System.out.println("2 Notes -"+notes2);
	System.out.println("1 Notes -"+notes1);

	scanner.close();
	}
}

	