import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) {

        try {

            InputStream is;
            if (args.length != 0) {
                is = new FileInputStream(args[0]);
            } else {
                is = System.in;
            }

            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(is)));

            int t = in.nextInt();

            for (int i = 1; i <= t; ++i) {

                int d = in.nextInt();
                String code = in.next().trim();

                int pos = Solution.solve(d, code);
                System.out.println("Case #" + i + ": " + (pos == -1 ? "IMPOSSIBLE" : pos));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static int solve(int d, String raw) {

        char[] str = raw.toCharArray();
        int n = 0;

        if (str.length > 1) {
            boolean isPres;
            do {
                if (damage(str) <= d) {
                    return n;
                }

                isPres = false;

                for (int i = str.length - 1; i > 0; i--) {

                    if ((str[i - 1] == 'C') && (str[i] == 'S')) {

                        char t = str[i];
                        str[i] = str[i - 1];
                        str[i - 1] = t;
                        n++;

                        isPres = true;

                        break;
                    }
                }
            } while (isPres);
        }

        int dam = damage(str);

        return dam <= d ? n : -1;
    }

    static int damage(char[] str) {
        int damage = 0;
        int change = 1;

        for (int i = 0; i < str.length; i++) {

            switch (str[i]) {
                case 'S':
                    damage += change;
                    break;
                case 'C':
                    change *= 2;
                    break;
            }
        }
        return damage;
    }
}
