package Examples_01;

public class LengthOfAnArray {
    public static void main(String[] args) {
        int i, n;
        int[] data = new int[] {3,8,1,7};
        n = data.length;

        int[] nums = new int[n];

        for (int j = 0; j <nums.length ; j++) {
            nums[j] = 2*data[j]-3;
            System.out.println("nums["+j+"] = "+nums[j]);
        }
    }
}
