
package Basic;
import java.util.ArrayList;

public class SieveOfEratosthenes{
    public static ArrayList<Integer> primeNumbers(int num){

        ArrayList<Integer> arr = new ArrayList<>();

        boolean[] isPrime = new boolean[num+1];

        for(int i=2 ; i<=num ; i++)isPrime[i]=true;

        for(int i=2 ; i*i<=num ; i++){
            if(isPrime[i]){
                for(int j=i*i ; j<=num ; j+=i) isPrime[j]=false;
            }
        }

        for(int i=0 ; i<isPrime.length ; i++){
            if(isPrime[i]) arr.add(i);    
        }

        return arr;
    }

    public static void main(String[] args) {

        int num = 36;
        ArrayList<Integer> result = primeNumbers(num);

        for(int factor : result) {
            System.out.print(factor + " ");
        }
    
    }
    
}















