package com.algorithmProg;

public class InsertionSort {
    public static void main(String[] args){
        String[] arr ={"Rob", "Robin","New York","Mumbai","Delhi","Hyderabad"};
        int count = 0;
        String sortedArray[] = sortSub(arr, arr.length);
        for(int i=0;i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }
    }

    public static String[] sortSub(String array[], int size){
        String temp="";
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
