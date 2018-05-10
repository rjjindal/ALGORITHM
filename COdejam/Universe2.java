import java.io.*;
import java.util.*;

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

            int n = in.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int res = Solution.sol(arr);

            System.out.println("Case #" + i + ": " + (res == -1 ? "OK" : res));
        }
    } catch (FileNotFoundException e) {

    }
  }

  public static int sol(int[] arr) {

    int p = sortPos(arr);
    if (p != -1) {
        return p;
    }

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return i;
        }
    }

    return -1;
  }

  public static int sortPos(int[] arr) {

    boolean pres = false;
    while (!pres) {
        pres = true;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 2]) {
                pres = false;
                int t = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = t;
            }
        }
    }
    return -1;
  }
}
