package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

          System.out.println("nhap so dong: ");
          int row = input.nextInt();
          System.out.println("nhap so cot: ");
          int column = input.nextInt();


        int[][] matrix=new int[row][column];

//
        for ( int i = 0; i < row;i++) {
            for ( int j = 0; j < column; j++) {
                System.out.print("Nhap phan tu thu ["+i+","+j+"]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Mang vua nhap: ");
        for ( int i = 0; i < row;i++) {
            for ( int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println("");
        }
        System.out.println("Tong dwowng cheo la: "+sumcheo(matrix,row,column));


    }
    public static int sumcheo(int matrix[][],int row,int column){
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j)
                    sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
}
