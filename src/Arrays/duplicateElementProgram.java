package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class duplicateElementProgram {
    //brute force 0(n^2)
    public static int duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    // Approach 1 Optimal 0(nlog n)
    public static int optimalDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    // using the hashset approach 0(n)
    public static int usingHash(int [] arr){
        HashSet<Integer> seen=new HashSet<>();
        for(int num:arr){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    public static int spaceDuplicate(int[] arr){
        int slow=arr[0];
        int  fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        while (slow!=fast);

        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }


    public static void main(String[] args) {
        int[] arr={1,4,3,2,2};
        System.out.println("Using the Brute force");
        System.out.println(duplicate(arr));
        System.out.println("Using the Optimal Approach");
        System.out.println(optimalDuplicate(arr));
        System.out.println("Using the Hash: ");
        System.out.println(usingHash(arr));
    }
}
