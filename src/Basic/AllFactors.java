
package Basic;

import java.util.ArrayList;

public class AllFactors{
    public static ArrayList<Integer> factors(int num){

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1 ; i<=Math.sqrt(num) ; i++){
            if(num%i==0){
                
                arr.add(i);
                if(i!= num/i)arr.add(num/i);
                
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int num = 36;
        ArrayList<Integer> result = factors(num);

        for(int factor : result) {
            System.out.print(factor + " ");
        }
    
    }
    
}















