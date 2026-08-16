

package Basic;


public class ExtendedEculedin{
    public static int[] gcd_lcm(int a, int b){

        if(b == 0) return new int[] {a,1,0};

        int[] rem = gcd_lcm(b,a%b);

        int gcd = rem[0];
        int p = rem[1];
        int q = rem[2];


        int new_x = q;
        int new_y =p-(a/b)*q;


        return new int[] {gcd,new_x,new_y};
        
    }

    public static void main(String[] args){
        int a=  2;
        int b=  5;

        int[] res = gcd_lcm(a,b);
        System.out.println(res[0]);
        System.out.println(( a / res[0] ) * b );
        System.out.println(res[1]);
        System.out.println(res[2]);

        
    }
}