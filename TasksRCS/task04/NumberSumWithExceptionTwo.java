

package task04;
import java.util.Scanner;
	public class NumberSumWithExceptionTwo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the first number: ");
			int a = sc.nextInt();
			System.out.print("Please enter the second number: ");
			int b = sc.nextInt();
			System.out.print("Please enter the third number: ");
			int c = sc.nextInt();
			sc.close();
			if (a == b) {
				System.out.println("Sum of numbers is " + c);
			} else if (c == a) {
				System.out.println("Sum of numbers is " + b);
			} else if (c == b) {
				System.out.println("Sum of numbers is " + a); 
			} else if ((a == b) && (a == c)) {
				System.out.println("Sum of numbers is 0");
			} else if ((a != b) && (a != c)) {
				System.out.println("Sum of numbers is 0");
			}
	}
}
