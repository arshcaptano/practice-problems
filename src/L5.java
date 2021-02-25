public class L5 {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(new L5().longestPalindrome(s));
    }

    private String longestPalindrome(String s) {
        int len = s.length();
        String palindrome = "";

        if (len <= 1) return s;

        StringBuilder temp = new StringBuilder();

        int i = 0;
        int start = 0;
        while (i < len) {
            temp.append(s.charAt(i));

            if (isPalindrome(temp.toString()) && temp.length() > palindrome.length())
                palindrome = temp.toString();

            if (i == len - 1) {
                i = start++;
                temp = new StringBuilder();
            }

            i++;
        }

        return palindrome;
    }

    private boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder reverse = new StringBuilder();

        if (n <= 1) return true;

        for (int i = n - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        return reverse.toString().equals(s);
    }
}
