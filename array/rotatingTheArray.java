
import java.util.ArrayList;

class Solution {

  public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
    int temp = B%A.size();
		for (int i = 0; i < (A.size()-temp); i++) {
			ret.add(A.get(i + temp));
		}
		for(int j=0; j<temp ;j++){
		    ret.add(A.get(j));
		}
		return ret;
	}

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(Solution.rotateArray(list, 6));
  }
}
