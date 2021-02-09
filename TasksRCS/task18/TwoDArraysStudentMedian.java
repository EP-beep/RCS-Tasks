package task18;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoDArraysStudentMedian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Gets student number
		System.out.print("Please enter the number of students: ");
		int students = sc.nextInt();
		// Gets how many number of studies there is
		System.out.print("Thank you, now enter the number of studies: ");
		int studies = sc.nextInt();
		// Creates 2d array from students and studies
		int[][] results = new int[students][studies];
		// Student grades get put in array and printed out
		for (int i = 0; i < students; i++) {
			System.out.print("Enter " + i + " student grades by one:");
			System.out.println(" ");
			for (int j = 0; j < studies; j++) {
				results[i][j] = sc.nextInt();
			}
		}
		sc.close();
		//Prints out grades
		System.out.println("Entered grades: " + Arrays.deepToString(results));
		for (int i = 0; i < results.length; i++) {
			double avg = IntStream.of(results[i]).average().getAsDouble();
			System.out.println();
			System.out.println(i + " Student average grade is: "+df2.format(avg));
			
		}
	}
	private static DecimalFormat df2 = new DecimalFormat("##.##");

}