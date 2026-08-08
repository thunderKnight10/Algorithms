package Sorting;
import java.util.Scanner;
public class QuickSort{


    public static void print(int n , int[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
    

    public static void swap(int[] arr ,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int partition(int[] arr, int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low ; j<high ; j++){
            if(arr[j]<pivot){
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1 , high); 

        return i+1;
    }


    public static void sort(int[] arr, int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
    
        }
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for( int i=0 ; i<n ; i++){
            arr[i]=input.nextInt();
        }

        sort(arr,0,n-1);

        print(n,arr);

    }


}




