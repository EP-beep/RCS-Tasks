import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		String name;
		int firstnumber = 0;
		int secondnumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		int length = name.length();
		System.out.print("Please enter the first integer: ");
		firstnumber = sc.nextInt();
		System.out.print("Please enter the second integer: ");
		secondnumber = sc.nextInt();
		sc.close();
		int sum = firstnumber + secondnumber;
		if (firstnumber == secondnumber) {
			System.out.println("Integer " + firstnumber + " is equals to " + secondnumber);
		}
		if (firstnumber < secondnumber) {
			System.out.println("Integer " + firstnumber + " is less than " + secondnumber);
		}
		if (firstnumber > secondnumber) {
			System.out.println("Integer " + firstnumber + " is bigger than " + secondnumber);
		}

		if (length == sum) {
			System.out
					.print("Integers " + firstnumber + " and " + secondnumber + " sum is " + sum + ", which is just as much as letters in your name!");
		}
		if (length > sum) {
			System.out
					.print("Integers " + firstnumber + " and " + secondnumber + " sum is " + sum + ", which is less than letters in your name!");
		}
		if (length < sum) {
			System.out
					.print("Integers " + firstnumber + " and " + secondnumber + " sum is " + sum + ", which is more than letters in your name!");
		}
	}

}
