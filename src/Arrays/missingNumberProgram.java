package Arrays;

public class missingNumberProgram {
    public static int missingNumber(int[] arr,int N){
        int totalsum=N*(N+1)/2;
        int arraySum=0;
        for(int i=0;i<arr.length;i++){
            arraySum+=arr[i];
        }
        return totalsum-arraySum;
    }
    public static void main(String [] args){
        int[] arr={1,2,4,5};
        int N=5;
        System.out.println(missingNumber(arr,N));

    }
}
