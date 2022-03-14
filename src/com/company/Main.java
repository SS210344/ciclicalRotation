package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]A=new int[5];
        A[0] = 3;
        A[1] = 8;
        A[2] = 9;
        A[3] = 7;
        A[4] = 6;
        int K = 3;
        A=Solution(A,K);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }



    }
    public static int[] Solution(int[] A,int K){
        for (int i = 0; i < K; i++) {
            int[]B=A.clone();
            for (int j = 0; j < A.length-1; j++) {
                int C=B[j];
                A[j+1]=C;
            }
            int C=B[B.length-1];
            A[0]=C;
        }
        return A;
    }
}
