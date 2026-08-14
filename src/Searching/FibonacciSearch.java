package Searching;
import java.util.Scanner;

public class FibonacciSearch{
    public static int search(int[] arr, int num){

        int n = arr.length;

        if (n == 0) return -1;
       
        int fib2 = 0;            // (m-2)'th Fibonacci
        int fib1 = 1;            // (m-1)'th Fibonacci
        int fib = fib1 + fib2;   // m'th Fibonacci

        //  smallest Fibonacci number >= n
        while (fib < n) {
            fib2 = fib1;
            fib1 = fib;
            fib = fib1 + fib2;
        }

        int offset = -1;

        while (fib > 1) {

            int i = Math.min(offset + fib2, n - 1);

            if (arr[i] < num){

                fib = fib1;
                fib1 = fib2;
                fib2 = fib - fib1;
                offset = i;

            }

            else if (arr[i] > num){

                fib = fib2;
                fib1 = fib1 - fib2;
                fib2 = fib - fib1;

            }

            else return i;
            
        }

        if (fib1 != 0 && offset + 1 < n && arr[offset + 1] == num) return offset + 1;
        
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array with sorted numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int m = sc.nextInt();

        int res = search(arr, m);

        if (res == -1)
            System.out.println("No element found.");
        else
            System.out.printf(
                "The number %d is at index %d",
                m, res
            );

        sc.close();
    }
}