
package Basic;
import java.util.ArrayList;

public class PrimeFactorization{
    public static ArrayList<Integer> primeNumbers(int num){

        ArrayList<Integer> arr = new ArrayList<>();

        while(num%2==0){
            arr.add(2);
            num/=2;
        }

        for(int i=3 ; i*i<=num ; i+=2){
            while(num%i==0){
                arr.add(i);
                num/=i;
            }
        }

        if(num>1) arr.add(num);

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















