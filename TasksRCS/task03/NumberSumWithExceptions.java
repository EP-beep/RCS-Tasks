package task03;

import java.util.Scanner;

public class NumberSumWithExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int first = sc.nextInt();
		System.out.print("Please enter the second number: ");
		int second = sc.nextInt();
		sc.close();
		int sum = first + second;
		if (sum <= 19 && sum >= 10) {
			System.out.println("Number sum is 20");
		} else {
			System.out.println("Number sum is " + sum);
		}
	}
}
