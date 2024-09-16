package Arrays;

import java.util.Arrays;

public class mergeArrayProgram {
    public static void merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;

        for(int i=0;i<n;i++){
            if(arr1[n-1]>arr2[i]){
                int temp=arr1[n-1];
                arr1[n-1]=arr2[i];
                arr2[i]=temp;
                Arrays.sort(arr1);
                Arrays.sort(arr2);

            }
        }
    }
    public static void printArrays(int[] arr1,int[] arr2){
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1={1,4,6};
        int[] arr2={2,5,9};
        merge(arr1,arr2);
        printArrays(arr1,arr2);
    }
}
