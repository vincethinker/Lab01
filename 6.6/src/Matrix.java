import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, c, d;
	      Scanner num = new Scanner(System.in);
	 
	      System.out.println("Input number of rows of matrix");
	      m = num.nextInt();
	      System.out.println("Input number of columns of matrix");
	      n = num.nextInt();
	 
	      int matrix1[][] = new int[m][n];
	      int matrix2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            matrix1[c][d] = num.nextInt();
	 
	      System.out.println("Input the elements of second matrix");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            matrix2[c][d] = num.nextInt();
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = matrix1[c][d] + matrix2[c][d]; 
	 
	      System.out.println("Sum of the matrices:");
	 
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	      }
	}

}
