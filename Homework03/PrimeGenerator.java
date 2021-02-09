package task02;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lūdzu ievadiet cik daudz pirmskaitļus jūs vēlaties uzģenerēt(0-100): ");
		int pirmskaitli = sc.nextInt();
		while (pirmskaitli < 0 || pirmskaitli > 100) {
			System.out.print("Jūsu ievadītais skaitlis nav pareizs, mēģiniet vēlreiz:");
			pirmskaitli = sc.nextInt();
		}
		sc.close();
		int[] x = { 1 };
		int status = 1;
		for (int count = 2; count <= pirmskaitli + 1;) {
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
