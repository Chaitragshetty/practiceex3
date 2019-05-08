package com.stackroute.PE3;
import java.util.Scanner;

public class AddMatrix {
    public static void main(String args[]) {
        AddMatrix object= new AddMatrix();
        object.add();

    }

    public static void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = scan.nextInt();

        System.out.println("enter number of columns");
        int col = scan.nextInt();

        int add[][] = new int[row][col];
        int matrix[][] = new int[row][col];
        int matrix1[][] = new int[row][col];

        System.out.println("enter first matrix elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                add[i][j] = matrix[i][j] + matrix1[i][j];
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(add[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}