package Searching;
import java.util.Scanner;

public class LinearProbingSearch{
    public static int search(int[] hashTable, int key){

        int size = hashTable.length;

        int index = key % size;
        int start = index;

        while(hashTable[index] != -1){
            
            if(hashTable[index] == key) return index;
            
            index = (index + 1) % size;

            if(index == start) break;
  
        }

        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hash table size:");
        int n = sc.nextInt();

        int[] hashTable = new int[n];

        
        for (int i = 0; i < n; i++) {
            hashTable[i] = -1;
        }

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();

            int index = key % n;

            while (hashTable[index] != -1) {
                index = (index + 1) % n;
            }
            hashTable[index] = key;
        }

        System.out.println("Enter the number you want to find:");
        int key = sc.nextInt();

        int result = search(hashTable, key);

        if (result == -1) System.out.println("No element found.");
        else
            System.out.printf("The number %d is at index %d",key, result );

        sc.close();

    }
}