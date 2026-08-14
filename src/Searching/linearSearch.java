package Searching;

import java.util.*;

public class linearSearch{

    public static int search(int[] arr, int num){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) return i;
        }

        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int m = sc.nextInt();

        int res = search(arr, m);

        if (res == -1) System.out.println("No element found.");
        else System.out.printf("The number %d is at index %d", m, res);

        sc.close();
    }
}