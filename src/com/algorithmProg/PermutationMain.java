package com.algorithmProg;

import java.util.Scanner;

public class PermutationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----welcome to permutation program-----");
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println("Here's your output");
        permutation(str.toCharArray(),0);
    }
    // function to swap characters in character array
    public static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    // Recursive function to generate all permutation
    public static void permutation(char[] ch, int currentIndex){
        if(currentIndex == ch.length-1){
            System.out.println(String.valueOf(ch));
        }
        for( int i=currentIndex; i< ch.length; i++){
            swap(ch, currentIndex, i);
            permutation(ch,currentIndex+1);
            swap(ch, currentIndex, i);
        }
    }
}
