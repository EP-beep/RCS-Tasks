package task02;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter how many prime numbers you wish to generate(0-100): ");
		int primenumbers = sc.nextInt();
		while (primenumbers < 0 || primenumbers > 100) {
			System.out.print("The number you entered is incorrect, try again: ");
			primenumbers = sc.nextInt();
		}
		sc.close();
		int[] x = { 1 };
		int status = 1;
		for (int count = 2; count <= primenumbers + 1;) {
			for (int j = 2; j <= Math.sqrt(x[0]); j++) {										
				if (x[0] % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.print(Arrays.toString(x));
				count++;
			}
			status = 1;
			x[0]++;
		}
	}
}
