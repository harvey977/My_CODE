import java.util.*;
import java.io.*;

public class add_matrix_1 {
    public static void main(String args[]) {
        Scanner us = new Scanner(System.in);
        System.out.print("Enter the number row :- ");
        int row = us.nextInt();
        System.out.print("Enetr any number column:- ");
        int column = us.nextInt();
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] sumMatrix = new int[row][column];

        System.out.println("Enter elements of the first matrix :- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = us.nextInt();
            }
        }
        System.out.println("Enter elements of the Second matrix :- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = us.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        System.out.println("After addition :-- ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sumMatrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}