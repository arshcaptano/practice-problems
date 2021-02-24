import java.util.Arrays;

public class L128 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 1};
        System.out.println(new L128().longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        if (len == 0) return 0;
        if (len == 1) return 1;

        int current = nums[0];
        int prevCount = 1;
        int count = 1;

        for (int i = 1; i < len; i++) {
            if (nums[i] != current) {
                if (nums[i] == current + 1) {
                    count++;
                } else {
                    if (count > prevCount)
                        prevCount = count;
                    count = 1;
                }

                current = nums[i];
            }

        }

        return Math.max(prevCount, count);
    }
}
