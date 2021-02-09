package task17;

import java.util.Arrays;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		// Array with duplicates
		String[] words = { "'ABC'", "'CDE'", "'FGA'", "'CDE'", "'GAE'", "'ABC'", "'ABO'" };
		System.out.print(Arrays.toString(words) + " ->");
		int notequal = words.length;
		for (int i = 0; i < notequal; i++) {
			for (int j = i + 1; j < notequal; j++) {
				if (words[i] == words[j]) {
					words[j] = words[notequal - 1];
					notequal--;
					j--;
				}
			}
		}
		String[] newwords = Arrays.copyOf(words, notequal);
		System.out.println(" " + Arrays.toString(newwords));
	}

}