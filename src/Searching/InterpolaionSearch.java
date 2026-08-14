


package Searching;

import java.util.Scanner;

public class InterpolaionSearch{

    public static int search(int[] arr, int num){

        int low=0;
        int high=arr.length-1;

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







