package Sorting;
import java.util.Scanner;
public class InsertionSort{


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
        for( int i=1 ; i<n ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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

