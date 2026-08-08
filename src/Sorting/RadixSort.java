

package Sorting;
import java.util.Scanner;
public class RadixSort{


    public static int getMax(int[] arr ){
        int max=arr[0];
        for( int num:arr){
            if(num>max) max=num;
        }
        return max;
    }


    public static void radixInternalSort(int[] arr,int exp){
       int n = arr.length;
       int[] count = new int[10];
       int[] output = new int[n];
       
       for(int i=0 ; i<n ; i++){
        count[(arr[i]/exp)%10]++;
       }

       for(int i=1 ; i<10 ; i++){
        count[i]+=count[i-1];
       }

       for(int i=n-1 ; i>=0 ; i--){
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;
       }

       for(int i=0 ; i<n ; i++){
        arr[i]=output[i];
       }

    }


    public static void print(int n , int[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void sort(int n , int[] arr){
        int max = getMax(arr);
        
        for(int exp=1 ; max/exp>0 ; exp*=10){
            radixInternalSort(arr,max,exp);
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

