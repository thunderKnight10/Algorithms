

package Basic;
public class preffix_Sum{
    public static void operation(int[] arr){

        for(int i=1 ; i <arr.length ; i++) arr[i]+=arr[i-1];

    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        operation(arr);

        for(int num : arr)
            System.out.print(num + " ");

    }

}













