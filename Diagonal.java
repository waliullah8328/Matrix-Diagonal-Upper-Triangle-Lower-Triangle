package com.company;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        int m,n;
        int sum1 = 0 ,sum = 0,sum2 = 0;

        System.out.print("Enter how many row you want to insert: ");
        m = input.nextInt();
        System.out.print("Enter how many Colum you want to insert: ");
        n = input.nextInt();
        int [][] A = new int [m][n];
        System.out.println("------------------- Enter your "+(m*n)+" digit ---------------------------- ");
        System.out.println();
        for (row = 0; row < m ; row++)
        {
            for(col = 0; col< n; col++)
            {
                System.out.printf("Enter your A[%d][%d] number : ",row,col);
                A[row][col]= input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Your Matrix:");
        for (row = 0; row < m ; row++)
        {
            for(col= 0; col< n; col++)
            {
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Diagonal list :");
        for (row = 0; row < m ; row++)
        {
            for(col = 0; col< n; col++)
            {
                if( row == col)
                {
                    System.out.print(" "+A[row][col]);
                    sum = sum + A[row][col];
                }

            }

        }
        System.out.println();
        System.out.print("Sum of Diagonal : "+sum);

        System.out.printf("\n\n");
        System.out.println("Upper Triangle :");
        for (row = 0; row < m ; row++)
        {
            for(col = 0; col < n; col++)
            {
                if( row < col)
                {
                    System.out.print(" "+A[row][col]);
                    sum1 = sum1 + A[row][col];
                }

            }

        }
        System.out.println();
        System.out.println("Sum of Upper Triangle : "+sum1);

        System.out.println();
        System.out.println("Lower Triangle :");
        for (row = 0; row < m ; row++)
        {
            for(col = 0; col < n; col++)
            {
                if( row > col)
                {
                    System.out.print(" "+A[row][col]);
                    sum2 = sum2 + A[row][col];
                }

            }

        }
        System.out.println();
        System.out.println("Sum of Lower Triangle : "+sum2);


    }
}
