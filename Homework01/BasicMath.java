import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		float summultiplication = 0;
		float multiply = 0;
		float divide = 0;
		float minus = 0;
		float sum = 0;
		int number = 0;
		float decimal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		number = sc.nextInt();
		System.out.print("Please enter a decimal number: ");
		decimal = sc.nextFloat();
		sc.close();
		sum = number + decimal;
		System.out.println("Numbers " + number + " and " + decimal + " sum is " + sum);
		minus = number - decimal;
		System.out.println("Numbers " + number + " and " + decimal + " difference is " + minus);
		divide = number / decimal;
		System.out.println("Numbers " + number + " and " + decimal + " division is " + divide);
		multiply = number * decimal;
		System.out.println("Numbers " + number + " and " + decimal + " multiplication is " + multiply);
		summultiplication = sum * sum;
		System.out.println("Numbers " + sum + " and " + sum + " sum multiplication is " + summultiplication);
	}

}