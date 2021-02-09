package task15;

import java.util.Arrays;

public class ArrayExponents {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,6,7};
		System.out.print("Arrays numbers: "+Arrays.toString(numbers)+" ->");
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = numbers[i] * numbers[i] * numbers[i];
        }
        System.out.print(Arrays.toString(numbers));


	}

}
