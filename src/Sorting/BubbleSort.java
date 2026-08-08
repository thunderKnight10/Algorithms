package Sorting;
import java.util.Scanner;
public class BubbleSort {


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
            boolean swapped = false;
            for( int j=0 ; j<n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }    
            }
            if(!swapped) break;
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
