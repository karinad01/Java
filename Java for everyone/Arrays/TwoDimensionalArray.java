package Examples_01;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int i,j,n=3,val=1;
        int[][] nums = new int[n-1][n];

        for (int k = 0; k < n - 1; k++) {
            for (int l = 0; l < n; l++) {
                nums[k][l] = val++;
                System.out.print(nums[k][l]+" ");
            }
            System.out.println();
        }
    }
}
