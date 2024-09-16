package Matrix;

public class rotateMatrixProgram {

    public static int[][] rotateMatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] rotated=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=arr[i][j];
            }
        }
        return rotated;
    }
    public static void optimalRotate(int [][] matrix){
        //transpose
        for(int i=0;i<matrix.length;i++)
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        // reverse
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][matrix.length-i-1];
                matrix[j][matrix.length-i-1]=temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Actual Matrix");
        printMatrix(matrix);
        int [][] rotated=rotateMatrix(matrix);
        optimalRotate(matrix);
        System.out.println("Optimal Rotated Matrix");
        printMatrix(matrix);
        System.out.println("Rotated Matrix");
    }

}
