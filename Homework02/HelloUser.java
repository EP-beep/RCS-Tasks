import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("Lūdzu ievadiet Vārdu un Uzvārdu ar atstarpi: ");
		input = sc.nextLine();
		sc.close();
		
		int atstarpe;
		atstarpe = input.indexOf(' ');
		String vards;
		vards = input.substring(0, atstarpe);
		String uzvards;
		uzvards = input.substring(atstarpe + 1);
		
		vards = vards.substring(0, 1).toUpperCase() + vards.substring(1).toLowerCase();
		System.out.println("'" + vards + "'");
		System.out.println("'" + uzvards.toUpperCase() + "'");
	}

}