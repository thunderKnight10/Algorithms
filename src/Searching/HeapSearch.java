package Searching;
import java.util.Scanner;

public class HeapSearch{
    public static int search(int[] heap, int num){

        for (int i = 0; i < heap.length; i++){
            if (heap[i] == num) return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the heap:");
        int n = sc.nextInt();

        int[] heap = new int[n];

        System.out.println("Enter the heap elements:");

        for (int i = 0; i < n; i++) {
            heap[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int num = sc.nextInt();

        int result = search(heap, num);

        if (result == -1)System.out.println("No element found.");
        else
            System.out.printf(
                "The number %d is at index %d",
                num, result
            );

        sc.close();
    }
}