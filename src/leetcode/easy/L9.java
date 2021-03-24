package leetcode.easy;

public class L9 {

    public static void main(String[] args) {
        int num = 13231;
        System.out.println(new L9().isPalindrome(num));
    }

    public boolean isPalindrome(int x) {
        String in = String.valueOf(x);
        int len = in.length();

        if (len < 1) return false;
        if (len == 1) return true;

        int start = 0;
        int end = len - 1;

        while (start < len) {
            if (start == len / 2) return true;

            if (in.charAt(start) == in.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(int x) {
        String input = String.valueOf(x);
        int inLen = input.length();

        if (inLen < 1) return false;
        if (inLen == 1) return true;

        StringBuilder output = new StringBuilder();
        for(int i = inLen - 1; i >= 0; i--)
         output.append(input.charAt(i));

        return output.toString().equals(input);
    }
}
