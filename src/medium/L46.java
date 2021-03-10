package medium;

import java.util.ArrayList;
import java.util.List;

public class L46 {
    /*
    Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]


    Output: [[1,2,3],[1,3,2],[3,1,2],[3,2,1],[2,3,1],[2,1,3]]


    Output: [[1,2,3],[2,1,3],[2,3,1],[3,2,1],[3,1,2],[1,3,2]]


    Input: nums = [0,1]
    Output: [[0,1],[1,0]]

    ---------------------
    [[2,1,3,4],[2,3,1,4],[2,3,4,1],[3,2,4,1],[3,4,2,1],[3,4,1,2],[4,3,1,2],[4,1,3,2],[4,1,2,3],[1,4,2,3],[1,2,4,3],[1,2,3,4]]


    [[1,2,3,4],[1,2,4,3],[1,3,2,4],[1,3,4,2],[1,4,2,3],[1,4,3,2],[2,1,3,4],[2,1,4,3],[2,3,1,4],[2,3,4,1],[2,4,1,3],[2,4,3,1],
    [3,1,2,4],[3,1,4,2],[3,2,1,4],[3,2,4,1],[3,4,1,2],[3,4,2,1],[4,1,2,3],[4,1,3,2],[4,2,1,3],[4,2,3,1],[4,3,1,2],[4,3,2,1]]
    */

    public static void main(String[] args) {
        // TODO: NOT COMPLETE

        int[] nums = {1, 2, 3};
        List<List<Integer>> lists = new L46().permute(nums);
        for (List<Integer> list : lists)
            System.out.println(list.toString());
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;

        if (n < 1 || n > 6) return new ArrayList<>();

        List<List<Integer>> lists = new ArrayList<>();

        if (n == 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums)
                list.add(num);
            lists.add(list);
            return lists;
        }

        swap(lists, nums, 0, 0);

        return lists;
    }

    public int[] swap(List<List<Integer>> lists, int[] nums, int i, int j) {
        nums[i] = (nums[i] + nums[j]) - (nums[j] = nums[i]);

        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            list.add(num);

        if (exists(lists, list)) return nums;
        else {
            lists.add(list);
            i++;

            if (i == nums.length - 1) {
                i = 0;
            }

            return swap(lists, nums, i, i + 1);
        }
    }

    private boolean exists(List<List<Integer>> lists, List<Integer> checkList) {
        for (List<Integer> list : lists) {
            if (list.equals(checkList)) return true;
        }
        return false;
    }

}
