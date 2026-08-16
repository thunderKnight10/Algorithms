
package Basic;


public class DifferenceArray{
    public static void rangeUpdate(int[] arr,int left,int right,int val){
        
        arr[left]+=val;
        if(right+1<arr.length) arr[right+1]-=val;
        
    }

    public static void prefixSum(int[] arr,int[] diff){
        
        arr[0]=diff[0];
        for(int i=1 ; i<arr.length ; i++){
            arr[i]=arr[i-1]+diff[i];       
        }

    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int[] diff = new int[arr.length];

        diff[0]=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            diff[i] = arr[i] - arr[i-1];    
        }

        rangeUpdate(diff, 2, 3, 5);
        rangeUpdate(diff, 1, 4, 7);
        prefixSum(arr, diff);
    }

}