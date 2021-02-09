package task03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2D {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter how many arrays you wish to generate(10-20): ");   // Lūdzam lietotājam ievadīt robežās no 10-20 cik rindas glabāt 2D masīvā.
		int arrayrows = sc.nextInt();
		while (arrayrows < 10 || arrayrows > 20) {										//Lietotājs iesprūst ciklā līdz neievada pareizo skaitli
			System.out.print("The number you entered is incorrect, try again:");
			arrayrows = sc.nextInt();
		}
		sc.close();
		int[][] newarraysize = new int[arrayrows][];									// 2D masīva rindas garumu uzģenerē ar random skaitļiem no 50 līdz 10
		for (int k = 0; k < newarraysize.length; k++) {
			newarraysize[k] = new int[random.nextInt(50) + 10];
		}
		for (int i = 0; i < newarraysize.length; i++) {									// 2D masīvu piepilda ar random skaitļiem no 100 līdz 900
			for (int j = 0; j < newarraysize[i].length; j++) {
				newarraysize[i][j] = ((int) (random.nextInt(900) + 100));
				System.out.print(newarraysize[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("Array sorted in descending order:");
		sortRowWise(newarraysize);														// Izmantojot metodi kārtošanai random skaitļi tiek sakārtoti dilstošā secībā
		System.out.println("Sorted arrays in ascending order by their average: ");
		
		float average[] = new float[newarraysize.length];								// Izrēķina vidējo vērtību katram masīvam un sakārto tos augošā secībā izmantojot bubblesort
		for (int row = 0; row < newarraysize.length; row++) {
			int rowTotal = 0;
			for (int column = 0; column < newarraysize[row].length; column++) {
				rowTotal += newarraysize[row][column];
			}
			average[row] = rowTotal / newarraysize[row].length;
		}
		bubbleSort(average);
		System.out.println(Arrays.toString(average));
		System.out.println("The Array with the biggest average value is: ");

	}
	public static int sortRowWise(int m[][]) {					// for cikls priekš masīvu rindām
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {				// for cikls priekš 2D Masīva kolonām
				for (int k = 0; k < m[i].length - j - 1; k++) { // for cikls priekš salīdzināšanas un samainīšanas
					if (m[i][k] < m[i][k + 1]) {				
						int t = m[i][k];						//samaina elementus ar vietām
						m[i][k] = m[i][k + 1];
						m[i][k + 1] = t;
					}
				}
			}
		}
		for (int i = 0; i < m.length; i++) {					// Izprintē sakārtoto 2D Masīvu
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		return 0;
	}
	static void bubbleSort(float[] average) {					// Kārto 2D masīvu vidējās vērtības augošā secībā izmantojot bubblesort
		float n = average.length;
		float temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (average[j - 1] > average[j]) {
					
					temp = average[j - 1];
					average[j - 1] = average[j];
					average[j] = temp;
				}

			}
		}
	}
}
