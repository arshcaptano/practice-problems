package medium;

public class L12 {
    /*
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
     */
    public static void main(String[] args) {
        int num = 58;

        System.out.println(new L12().intToRoman(num));
    }

    private String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int diff = num;

        while (diff > 0) {
            if (diff >= 1000) {
                roman.append("M");
                diff = diff - 1000;
                continue;
            }
            if (diff >= 900) {
                roman.append("CM");
                diff = diff - 900;
                continue;
            }
            if (diff >= 500) {
                roman.append("D");
                diff = diff - 500;
                continue;
            }
            if (diff >= 400) {
                roman.append("CD");
                diff = diff - 400;
                continue;
            }
            if (diff >= 100) {
                roman.append("C");
                diff = diff - 100;
                continue;
            }
            if (diff >= 90) {
                roman.append("XC");
                diff = diff - 90;
                continue;
            }
            if (diff >= 50) {
                roman.append("L");
                diff = diff - 50;
                continue;
            }
            if (diff >= 40) {
                roman.append("XL");
                diff = diff - 40;
                continue;
            }
            if (diff >= 10) {
                roman.append("X");
                diff = diff - 10;
                continue;
            }
            if (diff >= 9) {
                roman.append("IX");
                diff = diff - 9;
                continue;
            }
            if (diff >= 5) {
                roman.append("V");
                diff = diff - 5;
                continue;
            }
            if (diff >= 4) {
                roman.append("IV");
                diff = diff - 4;
                continue;
            }

            roman.append("I");
            diff = diff - 1;
        }

        return roman.toString();
    }

    public String intToRoman2(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String characters[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int indis = 0;
        while (num > 0) {
            if (num < values[indis])
                indis++;
            else {
                sb.append(characters[indis]);
                num -= values[indis];
            }
        }
        return sb.toString();
    }

}
