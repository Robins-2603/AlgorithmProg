package com.algorithmProg;

import java.util.ArrayList;

public class BinarySearchWord<T extends Comparable<T>> {

    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(ArrayList<String> arr, String x)
    {
        int left = 0, right = arr.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            // Check if x is present at mid
            if (x.compareTo(arr.get(mid)) == 0)
                return mid;

            // If x greater, ignore left half
            if (x.compareTo(arr.get(mid))> 0)
                left = mid + 1;

            // If x is smaller, ignore right half
            if (x.compareTo(arr.get(mid))< 0)
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
    public static void main(String[] args) {
        BinarySearchWord ob = new BinarySearchWord();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mango");
        arr.add("Apple");
        arr.add("Orange");
        arr.add("Pineapple");
        String x = "Orange";
        // Printing elements of array list
        System.out.println("The elements of the arraylist are: "+arr);
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("The Element " + x + " is found at "
                    + "index " + result);
    }

}
