
package Sorting;
import java.util.Scanner;
public class CountingSort{


    public static int max(int[] arr ){
        int mx=arr[0];
        for( int i=1 ; i<arr.length ; i++){
            if(arr[i]>mx) mx=arr[i];
        }
        return mx;
    }


    public static void print(int n , int[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void sort(int n , int[] arr){
        int mx = max(arr);
        int[] count = new int[mx+1];
        for( int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }

        int k=0;
        for( int i=0 ; i< mx+1 ; i++){
            while(count[i] > 0){
                arr[k]=i;
                k++;
                count[i]--;
            }
            
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

