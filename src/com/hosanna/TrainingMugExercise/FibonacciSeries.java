package com.hosanna.TrainingMugExercise;

public class FibonacciSeries {
    public static void getFibonacci(int f)
    {
        int f0 = 0, f1 = 1;
       while(f0 <= f)
       {
           System.out.print(f0 + " " );
          int  f2 = f0 + f1;
          f0 = f1;
          f1 = f2;
       }

    }
    public static void main(String[] args) {
        int n = 1000;
          getFibonacci (n);

    }
}
