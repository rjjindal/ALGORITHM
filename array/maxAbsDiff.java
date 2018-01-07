import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static int maxArr(ArrayList<Integer> A) {
        // int min = A.get(0);
        // int max = A.get(0);
        // int imin = 0;
        // int imax=0;
        // for(int i = 0; i < A.size(); i++) {
        //  int number = A.get(i)+i;
        //  if(number < min){ min = number;
        //  imin = i;
        //  }
        //  if(number > max){ max = number;
        //  imax = i;
        //  }
        // }
        //
        // System.out.println(imin+" "+imax);
        //
        // int temp = -(A.get(imax)+imax) + A.get(imin)+imin) ;
        Collections.sort(A);
        System.out.println(A);
        return(0);
    }

    public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();

      list.add(1);
      list.add(3);
      list.add(-1);

      System.out.println(Solution.maxArr(list));
    }
}
