package Basic;

public class Kadane{
    public static int[] maxSubArraySum(int[] arr){
        int current_sum=arr[0];
        int max_sum = arr[0];
        int start = 0;
        int end = 0;
        int temp = 0;

        for(int i=1; i<arr.length ; i++){
            if(arr[i]>current_sum+arr[i]){
                current_sum=arr[i];
                temp=i;
            }

            else current_sum+=arr[i];

            if(current_sum>max_sum){
                max_sum=current_sum;
                start=temp;
                end=i;
            }
        }

        return new int[] {max_sum,start,end};
    }

    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] res = maxSubArraySum(arr);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
    }
}