package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter Dimensions");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] A =new int[m][n];
        for(int i=0; i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter dimensions");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int[][] B =new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                B[i][j]=A[j][i];
            }
        }
        System.out.println("Rearranged array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(B[i][j]+" ");

            }
            System.out.println();
        }
    }
}


