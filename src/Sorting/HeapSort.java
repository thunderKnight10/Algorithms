

package Sorting;
import java.util.Scanner;
public class HeapSort{


    public static void heapify(int[] arr ,int n,int i ){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;


        if(left<n && arr[left]>arr[largest])largest=left;

        if(right<n && arr[right]>arr[largest])largest=right;

        if(i!=largest){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
        
    }


    public static void print(int n , int[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void sort(int n , int[] arr){
        
        for( int i=n/2-1 ; i>=0 ; i--){
            heapify(arr,n,i);
        }

        for( int i=n-1 ; i>0 ; i--){

            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            heapify(arr,i,0);
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

