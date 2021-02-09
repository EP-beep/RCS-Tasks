package task01;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lūdzu izvēlaties masīva izmēru robežās no 20 līdz 40: ");
		int skaitlis = sc.nextInt();                        // Nolasa masīva izmēra robežu
		sc.close();
		int[] daudzums = new int[skaitlis];
		
		int max = 90;										// Norāda skaitļu maximumu un minimumu ar kuru jāpiepilda masīvs.
		int min = 10;
		int range = max - min + 1;
		for (int i = 0; i < daudzums.length; i++) {
			int rand = (int) (Math.random() * range + min);	 // Piepilda izvēlētā masīva izmēru ar random skaitļiem.
			daudzums[i] = rand;
		}
		System.out.println(Arrays.toString(daudzums));       // Izvada piepildīto masīvu uz ekrāna
		bubbleSorting(daudzums);
	    System.out.print(Arrays.toString(daudzums)); 			// Izvada uz ekrāna sakārtoto masīvu

	}
	public static void bubbleSorting(int daudzums[]) {			// (Bubble sorting method) sakārto visu augošā secībā.
	    for (int i = 0; i < daudzums.length; i++) {        
	        for (int j = i + 1; j < daudzums.length; j++) {
	            int tmp = 0;
	            if (daudzums[i] > daudzums[j]) {
	                tmp = daudzums[i];
	                daudzums[i] = daudzums[j];
	                daudzums[j] = tmp;
	            }
	        }
	    }
	}

}