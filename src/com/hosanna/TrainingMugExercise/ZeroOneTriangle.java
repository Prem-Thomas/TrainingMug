package com.hosanna.TrainingMugExercise;

public class ZeroOneTriangle {
    public static void getZeroOne(int n){
       for (int i = 0; i <= n; i++){
           for(int j = 0; j <= i; j++){
               System.out.print(j % 2 + " ");
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        int n;
         n = 5;
         getZeroOne(n);
    }
}
