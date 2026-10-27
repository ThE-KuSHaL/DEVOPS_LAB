import java.util.Scanner;

public class code {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double first = scanner.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		System.out.print("Enter the second number: ");
		double second = scanner.nextDouble();

		scanner.close();
	}
}
