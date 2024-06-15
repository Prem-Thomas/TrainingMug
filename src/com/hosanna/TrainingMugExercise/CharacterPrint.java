package com.hosanna.TrainingMugExercise;

public class CharacterPrint {
    public static void getCharacters(int n){
        for(int i = n; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 6;
        getCharacters(n);
    }
}
