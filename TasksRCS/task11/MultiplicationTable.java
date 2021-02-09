package task11;


	import java.util.Scanner;

	public class MultiplicationTable {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			int number = sc.nextInt();
			sc.close();
			for (int i = -1; i < 10; i++) {
				System.out.println(number + " * " + (i + 1) + " = " + (number * (i + 1)));
			}
	}

}
