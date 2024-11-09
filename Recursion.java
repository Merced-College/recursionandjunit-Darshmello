// Darsh Gangakhedkar 
//November 8 2024
//Recursion practice and jtest
public class Recursion {

    // Problem 1: Count occurrences of 8 as a digit, with double counting for consecutive 8s
    public static int count8(int n) {
        if (n == 0) return 0;
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);  // Double count for consecutive 8s
            } else {
                return 1 + count8(n / 10);  // Single count
            }
        } else {
            return count8(n / 10);  // Move to next digit
        }
    }

    // Problem 2: Count occurrences of "hi" in a string
    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    // Problem 3: Count occurrences of "hi" without counting "hi" with 'x' before it
    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        } else if (str.length() > 2 && str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        } else {
            return countHi2(str.substring(1));
        }
    }

    // Problem 4: Count non-overlapping occurrences of a substring
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    // Problem 5: Return "cleaned" string where adjacent chars are reduced to one char
    public static String stringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    // Main method to manually test the recursive methods
    public static void main(String[] args) {
        // Testing count8
        System.out.println("count8(8) = " + count8(8));           // Expected: 1
        System.out.println("count8(818) = " + count8(818));       // Expected: 2
        System.out.println("count8(8818) = " + count8(8818));     // Expected: 4

        // Testing countHi
        System.out.println("countHi(\"xxhixx\") = " + countHi("xxhixx"));    // Expected: 1
        System.out.println("countHi(\"xhixhix\") = " + countHi("xhixhix"));  // Expected: 2

        // Testing countHi2
        System.out.println("countHi2(\"ahixhi\") = " + countHi2("ahixhi"));  // Expected: 1
        System.out.println("countHi2(\"xhixhi\") = " + countHi2("xhixhi"));  // Expected: 0

        // Testing strCount
        System.out.println("strCount(\"catcowcat\", \"cat\") = " + strCount("catcowcat", "cat"));  // Expected: 2
        System.out.println("strCount(\"catcowcat\", \"cow\") = " + strCount("catcowcat", "cow"));  // Expected: 1

        // Testing stringClean
        System.out.println("stringClean(\"yyzzza\") = " + stringClean("yyzzza"));  // Expected: "yza"
        System.out.println("stringClean(\"abbbcdd\") = " + stringClean("abbbcdd")); // Expected: "abcd"
    }
}
