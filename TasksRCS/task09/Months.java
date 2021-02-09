package task09;


	import java.util.Scanner;

	public class Months {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter an integer (1-12): ");
			int a = sc.nextInt();
			sc.close();
			if (a == 1) {
				System.out.print(a+" -> January");
			}else if (a == 2) {
				System.out.print(a+" -> February");
			}else if (a == 3) {
				System.out.print(a+" -> March");
			}else if (a == 4) {
				System.out.print(a+" -> April");
			}else if (a == 5) {
				System.out.print(a+" -> May");
			}else if (a == 6) {
				System.out.print(a+" -> June");
			}else if (a == 7) {
				System.out.print(a+" -> July");
			}else if (a == 8) {
				System.out.print(a+" -> August");
			}else if (a == 9) {
				System.out.print(a+" -> September");
			}else if (a == 10) {
				System.out.print(a+" -> October");
			}else if (a == 11) {
				System.out.print(a+" -> November");
			}else if (a == 12) {
				System.out.print(a+" -> December");
			}else 
				System.out.print("The number you entered is incorrect. Try again!");
	}

}
