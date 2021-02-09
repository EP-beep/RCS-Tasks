import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("Please enter your name and your last name with space: ");
		input = sc.nextLine();
		sc.close();
		
		int space;
		space = input.indexOf(' ');
		String name;
		name = input.substring(0, space);
		String lastname;
		lastname = input.substring(space + 1);
		
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		System.out.println("'" + name + "'");
		System.out.println("'" + lastname.toUpperCase() + "'");
	}

}