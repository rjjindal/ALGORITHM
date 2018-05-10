import java.util.*;
import java.io.*;

class Solution{

  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    int t = in.nextInt();

    for(int j=0; j < t; j++){

      int d = in.nextInt();
      String code = in.next().trim();

      int switchs = Solution.getSwitchs(d, code);

      System.out.println("Case #" + j + ": " + (switchs == -1 ? "IMPOSSIBLE" : switchs));
    }
  }

  static public int getSwitchs(int d, String raw) {

    int n = 0;

    char[] str = raw.toCharArray();
    if (str.length > 1) {
        boolean ispres;
        do {
            if (Solution.getDamage(str) <= d) {
                return n;
            }

            ispres = false;

            for (int i = str.length - 1; i > 0; i--) {
                if ((str[i - 1] == 'C') && (str[i] == 'S')) {
                    char temp = str[i];
                    str[i] = str[i - 1];
                    str[i - 1] = temp;
                    n++;

                    ispres = true;

                    break;
                }
            }
        } while (ispres);
    }

    int df = Solution.getDamage(str);

    return df <= d ? n : -1;
  }

  static int getDamage(char[] code) {
    int damage = 0;
    int change = 1;

    for (int i = 0; i < code.length; i++) {
        switch (code[i]) {
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
