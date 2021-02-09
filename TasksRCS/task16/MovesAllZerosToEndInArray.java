package task16;

import java.util.Arrays;

public class MovesAllZerosToEndInArray {

	public static void main(String[] args) {
		int i = 0;
		int[] numbers = { 0, 4, 0, 7, 8, 9, 0, 1 };
		System.out.print(Arrays.toString(numbers) + " ->");

		for (int j = 0, l = numbers.length; j < l;) {
			if (numbers[j] == 0)
				j++;
			else {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j++;
			}
		}
		while (i < numbers.length)
			numbers[i++] = 0;
		System.out.print(" "+Arrays.toString(numbers));
	}

}