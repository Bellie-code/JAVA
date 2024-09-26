package addition;

import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	   //Input matrix dimensions
		System.out.print("Enter the number of rows:");
		int rows = input.nextInt();
		System.out.print("Enter the number of columns:");
		
		int columns = input.nextInt();
		
		
		//Initialize matrices
		int[][] matrix1 = new int[rows][columns];
		int[][] matrix2 = new int[rows][columns];
		int[][] sum = new int[rows][columns];
		
		//Input elements for the first matrix
		System.out.println("Enter elements for the first matrix:");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                   matrix1[i][j] = input.nextInt();
			}
		}
        //Input elements for second matrix
		System.out.println("Enter elements for the second matrix:");
		for (int i=0;i<rows;i++) {
			for (int j=0;j < columns;j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");

				matrix2[i][j] = input.nextInt();
			}
	}
        //Perform matrix addition
		for (int i=0;i<rows;i++) {
		    for (int j=0;j < columns ;j++) {
			     sum[i][j] = matrix1[i][j] + matrix2[i][j];
		}
}
       //Display the result
		System.out.println("Sum of the matrices:");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
			