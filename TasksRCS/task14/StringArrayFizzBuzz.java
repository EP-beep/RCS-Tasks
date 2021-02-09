package task14;

import java.util.Arrays;

public class StringArrayFizzBuzz {

	public static void main(String[] args) {
		String[] numbers = {"1","2","3","5","8","30","15","12","7"};
		System.out.println(Arrays.toString(numbers)+" ->");
		for (int i = 0; i < numbers.length; i++) {
			int n = Integer.parseInt(numbers[i]);
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.print("FizzBuzz, ");
			}
			else if (n % 5 == 0) {
				System.out.print("Buzz, ");
			}
			else if (n % 3 == 0) {
				System.out.print("Fizz, ");
			} else {
				System.out.print(numbers[i] + ", ");
			}
		}
		
	}

}
