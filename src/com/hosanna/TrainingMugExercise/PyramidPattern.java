package com.hosanna.TrainingMugExercise;

public class PyramidPattern {
    public static void printPyramid(int n)
    {
        for(int i = n; i >= 1; i--){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        n = 5;
        printPyramid(n);
    }
}
