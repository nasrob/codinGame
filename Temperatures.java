package codinGame;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        int result;

        if (n == 0) result = 0;
        else {
            result = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int t = in.nextInt();
                if (Math.abs(t) < Math.abs(result) || (t == -result && t > 0)) {
                    result = t;
                }
            }
        }

        System.out.println(result);
        in.close();
    }
}