import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		String name = " ";
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		System.out.print("Please enter your age: ");
		age = sc.nextInt();
		System.out.println("Hello, my name is " + name + ". I'm " + age + " years old!" );
		sc.close();
	}
}
