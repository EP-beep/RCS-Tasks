package task19;

import java.util.Arrays;

public class TwoDimensionalArraysWithMagicSquareNumber {
	  
    // driver program to 
    // test below function 
    public static void main(String[] args) 
    { 
        int mat[][] = {{ 17, 10, 15 }, 
                       { 12, 14, 16 }, 
                       { 13, 18, 11 }}; 
  
        if (isMagicSquare(mat)) 
            System.out.println(Arrays.deepToString(mat)+" is Magic Square!"); 
        else
            System.out.println(" is not a Magic Square!");
}
    	static int N = 3; 
	      
	    // Returns true if mat[][] is magic 
	    // square, else returns false. 
	    static boolean isMagicSquare(int mat[][]) 
	    { 
	          
	        // calculate the sum of 
	        // the prime diagonal 
	         int sum = 0,sum2=0;  
	        for (int i = 0; i < N; i++) 
	            sum = sum + mat[i][i]; 
	  
	        // the secondary diagonal 
	        for (int i = 0; i < N; i++) 
	            sum2 = sum2 + mat[i][N-1-i]; 
	  
	        if(sum!=sum2)  
	            return false; 
	  
	        // For sums of Rows 
	        for (int i = 0; i < N; i++) { 
	  
	            int rowSum = 0; 
	            for (int j = 0; j < N; j++) 
	                rowSum += mat[i][j]; 
	  
	            // check if every row sum is 
	            // equal to prime diagonal sum 
	            if (rowSum != sum) 
	                return false; 
	        } 
	  
	        // For sums of Columns 
	        for (int i = 0; i < N; i++) { 
	  
	            int colSum = 0; 
	            for (int j = 0; j < N; j++) 
	                colSum += mat[j][i]; 
	  
	            // check if every column sum is 
	            // equal to prime diagonal sum 
	            if (sum != colSum) 
	                return false; 
	        } 
	  
	        return true; 
	} 
}
