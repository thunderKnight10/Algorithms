package Searching;
import java.util.Scanner;

public class JumpSearch{
    public static int search(int[] arr, int num){

        int n = arr.length;

        if (n == 0) return -1;

        int jump = (int) Math.sqrt(n);
        int step = jump;
        int prev = 0;

        
        while (prev < n && arr[Math.min(step, n) - 1] < num){

            prev = step;
            step += jump;

            if (prev >= n) return -1;
        
        }

        
        while (prev < Math.min(step, n)) {

            if (arr[prev] == num) return prev;

            prev++;

        }

        return -1;
    }

    public static void main(String[] args){

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

        if(res == -1) System.out.println("No element found.");
        else System.out.printf("The number %d is at index %d", m, res);

        sc.close();
        
    }
}