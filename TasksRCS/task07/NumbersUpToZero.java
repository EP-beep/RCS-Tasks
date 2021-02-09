package task07;
import java.util.Scanner;

public class NumbersUpToZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = sc.nextInt();
		sc.close();
		System.out.print(number + " -> ");
		for (int i = 0; i <= number; i++) {
			if (i == number) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		if (number < 0) {
			for (int i = number; i <= 0; i++) {
				if (i == 0) {
					System.out.print(i);
				} else {
					System.out.print(i + ", ");
				}
			}
		}
	}

}
