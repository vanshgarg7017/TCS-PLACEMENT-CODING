package Arrays;

import java.util.Arrays;

public class kthSmallestProgram {
    public static int kthSmallest(int n,int k,int[]arr){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args){
        int arr[]={5,9,1,8,10,6,4 };
        int n=arr.length;
        int k=5;
        System.out.println(kthSmallest(n,k,arr));
    }
}
