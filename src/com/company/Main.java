package com.company;

public class Main {

    public static void main(String[] args) {
        //int[] arr = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        //int N = arr.length;
        //int key = 13;

        //if (arr[N] == key)
          //  System.out.println(arr);

        //for (int i = 0; i <= arr.length; i++)
          //  if (arr[i] == key)
            //    System.out.println(arr);

        //not printing 14 because 13 is the first mid point and on the left side, the next mid point is 15
        int [] arr = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int N = arr.length;
        int key = 15;

        int low = 0;
        int high = N - 1;
        boolean found = false;

        while (!found && low <= high) {
            int mid = (low + high) / 2;
            int v = arr[mid];
            System.out.println(v);
            if (key == v)
                found = true;
            else if (key < v)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println(found);

    }
}