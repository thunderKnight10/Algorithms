package Sorting;
import java.util.Scanner;
public class MergeSort{


    public static void print(int n , int[] arr){
        for( int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
    
    
    public static void merge(int[] arr, int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for(int i=0 ; i<n1 ; i++){
            l[i]=arr[i+left];
        }

        for(int j=0 ; j<n2 ; j++){
            r[j]=arr[j+mid+1];
        }

        int i=0 ,j=0,k=left;
        while(i<n1 && j<n2){
            if(l[i]<r[j]){
                arr[k]=l[i];
                i++;
            }
            else{
                arr[k]=r[j];
                j++;
            }
            k++;
        }

        while(i<n1 ){
            arr[k]=l[i];
            i++;
            k++;
        }

        while(j<n2 ){
            arr[k]=r[j];
            j++;
            k++;
        }

    }    


    public static void sort(int[] arr, int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr,left,mid,right);
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



