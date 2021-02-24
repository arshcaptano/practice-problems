import java.util.Arrays;

public class L153 {

    public static void main(String[] args) {
        int[] num = {3, 4, 5, 1, 2};
        System.out.println(new L153().findMin(num));
    }

    public int findMin(int[] nums) {
        int len = nums.length;

        if (len == 0) return 0;

        int min = nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }
}
