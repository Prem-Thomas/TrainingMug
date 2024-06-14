package com.hosanna.TrainingMugExercise;

public class DecimalToBinary {
    public static void main(String[] args) {
        /*
           1. ex :- 34
         */
        int decimal;
        decimal = 19;
       int remainder;
       int binary;
       int i;
       i = 1;
       binary = 0;
        while (decimal != 0){
            remainder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + remainder * i;
            i = i * 10;
        }
        System.out.println(binary);
    }
}
