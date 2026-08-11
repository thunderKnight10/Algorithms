

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


    public static void sort_0_1_range(float[] arr){
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


    public static void Sort_allNeg_float(float[] arr){

        int n = arr.length;
        if(n==1) return;

        float max=arr[0];
        float min=arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }

        if(max==min) return;

        float[][] bucket = new float[n][n];
        int[] bucketSize = new int[n];

        for(int i=0 ; i<n ; i++){
            int index=(int)(((arr[i]-min)/(max-min))*n);
            if(index==n)index=n-1;
            bucket[index][bucketSize[index]]=arr[i];
            bucketSize[index]++;
        }

        for(int i=0 ; i<n ; i++){
            if(bucketSize[i]>1){
                bucketInternalSort(bucket[i],bucketSize[i]);
            }
        }

        int k = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<bucketSize[i] ; j++){
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

        //  if element bettween 0 to 1 float num
        //  sort_0_1_range(arr);

        //  elements neg and float num all range
        //  Sort_allNeg_float(arr);
        print(n,arr);

    }


}

