package medium;

import java.util.ArrayList;
import java.util.List;

public class L6 {
    public static void main(String[] args) {
        String s = "AB";
        int numRows = 3;
        System.out.println(new L6().convert(s, numRows));
    }

    public String convert(String s, int numRows) {
        int n = s.length();
        if (n == 1 || numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        List<StringBuilder> segments = new ArrayList<>();

        for (int i = 0; i < numRows; i++)
            segments.add(new StringBuilder());

        int row = 0;
        int i = 0;
        String flow = "down";

        while (row < numRows && i < n) {

            if (row == 0 && flow.equals("up")) {
                segments.get(row).append(s.charAt(i));
                flow = "down";
                row++;
                i++;
                continue;
            }

            segments.get(row).append(s.charAt(i));

            if (row == numRows - 1 && flow.equals("down")) {
                flow = "up";
                row--;
                i++;
                continue;
            }

            if (flow.equals("up")) row--;
            if (flow.equals("down")) row++;

            if (i == s.length() - 1) break;

            i++;
        }

        for (StringBuilder segment : segments)
            result.append(segment);

        return result.toString();
    }

}
