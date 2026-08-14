package Searching;

import java.util.Scanner;

public class ExponentialSearch{

    public static int internalsearch(int[] arr, int num , int low,int high){

        while(low<=high && num>=arr[low] && num<=arr[high] ){
            
            if(arr[low]==arr[high]){
                if(arr[low]==num) return low;
                return -1;
            }

            int pos = low +((num-arr[low])*(high-low)/(arr[high]-arr[low]));
            
            if(arr[pos]==num) return pos;

            else if(arr[pos]<num) low=pos+1;    

            else high=pos-1; 
            
        }

        return -1;

    }

    public static int getMin(int a,int b){
        
        if(a<b) return a;
        
        return b;
    }

    public static int search(int[] arr, int num){

        int n = arr.length;
        if(n==0)        return -1;
        if(arr[0]==num) return 0;

        int i=1 ;
        while(i < n && arr[i]<num){
            i*=2;
        }

        return internalsearch(arr, num,i/2,getMin(i,n-1)) ;   

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array with sorting  numbers:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int m = sc.nextInt();

        int res = search(arr, m);

        if (res == -1) System.out.println("No element found.");
        else System.out.printf("The number %d is at index %d", m, res);

        sc.close();
    }
}







