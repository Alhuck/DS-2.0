package alhuck.challenges.mediumlc;

public class LongestCommonSubsequence {

    public static int getLongestCommonSubsequence(String text1, String text2) {

        // initialize the 2 dimensional array with size text1.length +1 & text2.length+1
        // loop the array
        // check the characters in the text1 and text 2
        // if the chars are equal, then get the i-1, j-1 value of array and add 1 and
        // set to the array index i, j
        // if the chars are not equal, then get the max value of [i-1][j], [i][j-1] and
        // set to the index i, j
        // return the value of last cell in the array

        int[][] lcs = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        return lcs[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        System.out.println(getLongestCommonSubsequence("abcde", "ace"));
    }
}
