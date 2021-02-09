import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		int datums;
		int menesis;
		Scanner sc = new Scanner(System.in);
		System.out.print("Lūdzu ievadiet datumu (1-31): ");
		datums = sc.nextInt();
		System.out.print("Lūdzu ievadiet mēneša skaitli (1-12): ");
		menesis = sc.nextInt();
		sc.close();
		if (datums > 31) {
			System.out.print("Ievadītie dati nav pareizi");
		} else if (menesis > 12) {
			System.out.print("Ievadītie dati nav pareizi");
		}
		if (menesis == 1 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Janvāris");
		} else if (menesis == 2 && datums > 0 && datums <= 29) {
			System.out.print(datums + ". Februāris");
		} else if (menesis == 3 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Marts");
		} else if (menesis == 4 && datums > 0 && datums <= 30) {
			System.out.print(datums + ". Aprīlis");
		} else if (menesis == 5 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Maijs");
		} else if (menesis == 6 && datums > 0 && datums <= 30) {
			System.out.print(datums + ". Jūnijs");
		} else if (menesis == 7 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Jūlijs");
		} else if (menesis == 8 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Augusts");
		} else if (menesis == 9 && datums > 0 && datums <= 30) {
			System.out.print(datums + ". Septembris");
		} else if (menesis == 10 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Oktobris");
		} else if (menesis == 11 && datums > 0 && datums <= 30) {
			System.out.print(datums + ". Novembris");
		} else if (menesis == 12 && datums > 0 && datums <= 31) {
			System.out.print(datums + ". Decembris");
		} else {
			System.out.print("Ievadītie dati nav pareizi.");
		}

	}

}
