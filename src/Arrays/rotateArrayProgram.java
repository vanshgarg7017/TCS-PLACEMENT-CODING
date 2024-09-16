package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class rotateArrayProgram {
    //with Extraspace
    public static int[] rotateArray(int []arr,int k){
        int n=arr.length;
        int [] temp=new int[n];

        //formula used: (n+2)%n
        // not use nums because elements override problems

        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        return temp;
    }

    // without_the_Extraspace
    public static int[] optimalrotateArray(int arr[],int k){
        int n=arr.length;
        k=k%n;

        // using the recursion we can rotate the array without using the extra space
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    public static void reverse(int arr[],int end,int start){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr={2,3,4,5};
        int n=arr.length;
        int k=2;
//        System.out.println("rotated Array : "+ Arrays.toString(rotateArray(arr,k)));
        System.out.println("Rotated Array: "+ Arrays.toString(optimalrotateArray(arr,k)));
    }
}
