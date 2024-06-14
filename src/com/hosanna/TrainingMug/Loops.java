package com.hosanna.TrainingMug;

public class Loops {
    public static void main(String[] args) {
        /*
         WAP print EvenNumbers only with in N value;
         */
        int N;
        N = 100;
       /*
           For Loop
       for (int i = 1 ; i <= N ; i++){
            if( i % 2 == 0){
                System.out.println("Even Number : " + i);
            }
        } */

       /* While Loop

       int i;
        i = 1;
        while( i <= N){
            if( i % 2 == 0){
                System.out.println("Even Number : " + i);
            }
            i++;
        } */

        // Do - while Loop
        int n;
        n = 1;
        do {
            if(n % 2 == 0)
            System.out.println(" Even Number :" + n);
            n++;
        }while( n <= N);

    }
}
