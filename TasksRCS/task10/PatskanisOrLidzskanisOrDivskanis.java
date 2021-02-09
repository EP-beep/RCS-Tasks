package task10;

	import java.util.Scanner;

	public class PatskanisOrLidzskanisOrDivskanis {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Lūdzu ievadiet vienu burtu: ");
			char burts = sc.nextLine().charAt(0);
			sc.close();
			boolean lidzskanis = false;
			boolean patskani = false;
			boolean divskanis = false;
			switch (burts) {
			case 'b':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'z':
				lidzskanis = true;
				if (lidzskanis == true) {
					System.out.print(burts + " -> Ievadītais burts ir līdzskanis");
				}
			}
			switch (burts) {
			case 'a':
			case 'e':
			case 'i':
			case 'u':
			case 'o':
				patskani = true;
				if (patskani == true) {
					System.out.print(burts + " -> Ievadītais burts ir patskanis ");
				}
			}
			switch (burts) {
			case 'o':
				divskanis = true;
				if (divskanis == true)
					System.out.print(burts + " -> Ievadītais burts ir divskanis");
				}
				if (lidzskanis == false && patskani == false && divskanis == false) {
					System.out.print("Ievaditie dati nav pareizi. Try again");
				}
	}

}
