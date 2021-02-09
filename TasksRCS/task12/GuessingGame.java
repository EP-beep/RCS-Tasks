package task12;

	import java.util.Random;
	import java.util.Scanner;

	public class GuessingGame {

		public static void main(String[] args) {
			int guess;
			int magicnumber = new Random().nextInt(11);
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Enter a number guess from 1 to 10: ");
				guess = sc.nextInt();
				if (guess == magicnumber) {
					System.out.print("Congratulations, you guessed correct, the number was: " + magicnumber);
				} else if (guess != magicnumber) {
					System.out.println("Nop, try again!");
				}
			} while (guess != magicnumber);
			sc.close();
		}

	}
