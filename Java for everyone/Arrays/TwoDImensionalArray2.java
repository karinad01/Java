package Examples_01;

public class TwoDImensionalArray2 {
    public static void main(String[] args) {
        int i,j,val=1;
        int[][] nums = new int[4][];
        for (int k = 0; k <nums.length ; k++) {
            nums[k] = new int[k+1];
        }
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l <nums[k].length; l++) {
                nums[k][l] = val++;
                System.out.print(nums[k][l] + " ");
            }
            System.out.println();
        }
    }
}
