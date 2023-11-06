package codinGame;

import java.util.Scanner;

public class AsciiArt {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine().toUpperCase();

        int A = (int) 'A';
        int Z = (int) 'Z';

        for (int i = 0; i < H; i++) {
            String row = in.nextLine();
            StringBuilder line = new StringBuilder();

            for (char s : T.toCharArray()) {
                int c = (int) s;

                if (c < A || c > Z) {
                    line.append(row.substring(L * (Z - A + 1), L * (Z - A + 2)));
                } else {
                    line.append(row, L * (c - A), L * (c - A + 1));
                }
            }
            System.out.println(line);
        }
    }
}
