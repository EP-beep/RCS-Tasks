package task01;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter how many arrays you wish to generate(10-20): ");
		int number = sc.nextInt();                        // Nolasa masīva izmēra robežu
		sc.close();
		int[] ammount = new int[number];
		
		int max = 90;										// Norāda skaitļu maximumu un minimumu ar kuru jāpiepilda masīvs.
		int min = 10;
		int range = max - min + 1;
		for (int i = 0; i < ammount.length; i++) {
			int rand = (int) (Math.random() * range + min);	 // Piepilda izvēlētā masīva izmēru ar random skaitļiem.
			ammount[i] = rand;
		}
		System.out.println(Arrays.toString(ammount));       // Izvada piepildīto masīvu uz ekrāna
		bubbleSorting(ammount);
	    System.out.print(Arrays.toString(ammount)); 			// Izvada uz ekrāna sakārtoto masīvu

	}
	public static void bubbleSorting(int ammount[]) {			// (Bubble sorting method) sakārto visu augošā secībā.
	    for (int i = 0; i < ammount.length; i++) {        
	        for (int j = i + 1; j < ammount.length; j++) {
	            int tmp = 0;
	            if (ammount[i] > ammount[j]) {
	                tmp = ammount[i];
	                ammount[i] = ammount[j];
	                ammount[j] = tmp;
	            }
	        }
	    }
	}

}