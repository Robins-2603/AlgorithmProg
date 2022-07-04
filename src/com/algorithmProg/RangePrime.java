package com.algorithmProg;

public class RangePrime {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Here's all the prime numbers between 0 to 1000 range.");
        System.out.print(2+" ");
        for (int i=2;i<1000;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count=0;
                    break;
                }else{
                    count++;
                }
            }
            if(count>0) {
                System.out.print(i+" ");
            }
        }
    }
}
