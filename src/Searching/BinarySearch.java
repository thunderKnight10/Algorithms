
package Searching;

import java.util.Scanner;

public class BinarySearch{

    public static int search(int[] arr, int num){

        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==num) return mid;

            else if(arr[mid]>num) right= mid-1;    

            else  left=mid+1 ;

        }

        return -1;

    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array with sorting  numbers:");
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







