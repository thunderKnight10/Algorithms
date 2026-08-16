
package Basic;


public class Eculedin{
    public static int[] gcd_lcm(int a, int b){
        
        int x =a;
        int y =b;

        while(b != 0){
            int rem = a%b;
            a=b;
            b=rem;
        }

        int gcd = a;
        int lcm = (x*y)/gcd;
        
        return new int[] {gcd,lcm};
        
    }

    public static void main(String[] args){
        int a=  2;
        int b=  5;

        int[] res = gcd_lcm(a,b);
        System.out.println(res[0]);
        System.out.println(res[1]);
        
    }
}