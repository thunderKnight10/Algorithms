
package Basic;
public class DNF{
    public static void swap(int[] arr,int a,int b){
        
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    public static void sort012(int[] arr){

        int low=0 , mid=0 , high=arr.length-1;
        while(mid<=high){

            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }

            else if(arr[mid]==1) mid++;

            else{
                swap(arr, mid, high);
                high--;
            }

        }


    }


    public static void main(String[] args){

        int[] arr={2, 0, 2, 1, 1, 0, 2, 1, 0};
        sort012(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }

    }
}














