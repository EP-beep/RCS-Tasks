import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		int day;
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a day (1-31): ");
		day = sc.nextInt();
		System.out.print("Please enter month number (1-12): ");
		month = sc.nextInt();
		sc.close();
		if (day > 31) {
			System.out.print("The data you entered is incorrect");
		} else if (month > 12) {
			System.out.print("The data you entered is incorrect");
		}
		if (month == 1 && day > 0 && day <= 31) {
			System.out.print(day + ". January");
		} else if (month == 2 && day > 0 && day <= 29) {
			System.out.print(day + ". February");
		} else if (month == 3 && day > 0 && day <= 31) {
			System.out.print(day + ". March");
		} else if (month == 4 && day > 0 && day <= 30) {
			System.out.print(day + ". April");
		} else if (month == 5 && day > 0 && day <= 31) {
			System.out.print(day + ". May");
		} else if (month == 6 && day > 0 && day <= 30) {
			System.out.print(day + ". June");
		} else if (month == 7 && day > 0 && day <= 31) {
			System.out.print(day + ". July");
		} else if (month == 8 && day > 0 && day <= 31) {
			System.out.print(day + ". August");
		} else if (month == 9 && day > 0 && day <= 30) {
			System.out.print(day + ". September");
		} else if (month == 10 && day > 0 && day <= 31) {
			System.out.print(day + ". October");
		} else if (month == 11 && day > 0 && day <= 30) {
			System.out.print(day + ". November");
		} else if (month == 12 && day > 0 && day <= 31) {
			System.out.print(day + ". December");
		} else {
			System.out.print("The data you entered is incorrect");
		}

	}

}
