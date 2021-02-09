package task13;

import java.util.Scanner;

public class IntegerSeperatorSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = sc.nextInt();
		sc.close();
		int number1 = number / 10;
		int number2 = number % 10;
		int sum = number1 + number2;
		System.out.print(number+", "+number1+"+"+number2+" = "+sum);
	}

}
