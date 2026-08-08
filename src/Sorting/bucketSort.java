

package Sorting;
import java.util.Scanner;
public class BucketSort{


    public static void print(int n , float[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void bucketInternalSort(float[] arr,int size){

        for(int i=1 ; i<size ; i++){
            float key=arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }   


    public static void sort(float[] arr){
        int n = arr.length;
        float[][] bucket = new float[n][n];
        int[] bucketIndex = new int[n];

        for( int i=0 ; i<n ; i++){
            int idx=(int)(arr[i]*n);
            bucket[idx][bucketIndex[idx]]=arr[i];
            bucketIndex[idx]++;
        }


        for( int i=0 ; i<n ; i++){
            if(bucketIndex[i]>1){
                bucketInternalSort(bucket[i],bucketIndex[i]);
            }
        }

        int k =0;
        for( int i=0 ; i<n ; i++){
            for( int j=0 ; j<bucketIndex[i] ; j++){
                arr[k++]=bucket[i][j];
            }
        }

    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        float[] arr = new float[n];
        for( int i=0 ; i<n ; i++){
            arr[i]=input.nextFloat();
        }

        sort(arr);

        print(n,arr);

    }


}

