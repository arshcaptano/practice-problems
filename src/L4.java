import java.util.Arrays;

public class L4 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(new L4().findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1 + n2];

        if (n1 == 0 && n2 == 0) return 0;

        for (int i = 0; i < n1; i++) {
            res[i] = nums1[i];
        }

        int k = n1;
        for (int j = 0; j < n2; j++) {
            res[k] = nums2[j];
            k++;
        }

        Arrays.sort(res);

        if (res.length % 2 != 0)
            return res[res.length / 2];
        else {
            int left = res[res.length / 2 - 1];
            int right = res[res.length / 2];
            return (left + right) / 2.0;
        }
    }
}
