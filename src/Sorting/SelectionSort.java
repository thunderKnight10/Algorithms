
package Sorting;
import java.util.Scanner;
public class SelectionSort {


    public static void swap(int[] arr ,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void print(int n , int[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void sort(int n , int[] arr){
        for( int i=0 ; i<n-1 ; i++){
            int minIdx = i;
            for( int j=i+1 ; j<n ; j++){
                if(arr[minIdx] > arr[j]) minIdx= j;   
            }
            swap(arr, i, minIdx);
        }
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for( int i=0 ; i<n ; i++){
            arr[i]=input.nextInt();
        }

        sort(n, arr);

        print(n,arr);

    }


}

