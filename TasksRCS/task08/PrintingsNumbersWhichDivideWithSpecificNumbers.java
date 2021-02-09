package task08;

import java.util.Scanner;

public class PrintingsNumbersWhichDivideWithSpecificNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first integer (1-100): ");
		int a = sc.nextInt();
		System.out.print("Please enter second integer (1-100): ");
		int b = sc.nextInt();
		sc.close();
		System.out.print(a + ", " + b + " -> ");
		for (int i = 0; i <= a; i++) {
			if (i % 5 == 0) {
				System.out.print("");
			} else if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}
		for (int j = 0; j <= b; j++) {
			if (j % 5 == 0) {
				System.out.print("");
			} else if (j % 2 == 0 && j % 3 == 0) {
				System.out.print(j + ", ");
			}

		}
	}

}
