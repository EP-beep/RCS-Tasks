package task05;

import java.util.Scanner;

public class ChecksIfNumberIsWithinBoundaries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b;
		System.out.print("Please enter your number ");
		int number = sc.nextInt();
		sc.close();
		if (number >= 50 && number < 100) {
			b = true;
			System.out.print(number + "-> " + b);
		} else {
			b = false;
			System.out.print(number + "-> " + b);
		}
	}
}
