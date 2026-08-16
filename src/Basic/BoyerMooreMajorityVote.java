
package Basic;


public class BoyerMooreMajorityVote{
    public static int majority(int[] arr){

        int candidate=0;
        int count = 0;

        for(int num:arr){
            if(count==0) candidate=num;

            if(candidate==num) count++;
            else count--;
        }

        return candidate;
    }

    public static void main(String[] args){
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int res = majority(arr);
        System.out.println(res);
    }
}