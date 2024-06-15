package com.hosanna.TrainingMugExercise;

public class FindFactorials {
    public static void getFactor(int f){
        int pw;
        pw = 1;
        while(f != 0 ){
            pw = pw * f;
            f--;
        }
        System.out.print(pw);

    }

    public static void main(String[] args) {
        int n = 5;
        getFactor(n);
    }
}
