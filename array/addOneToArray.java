import java.util.ArrayList;
import java.util.Collections;

class Solution {
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    Collections.reverse(a);
			int temp=0;
	    int carry=1;

	    for(int i=0;i< a.size(); i++){

					temp = a.get(i)+carry;
	        a.set( i, temp%10);
	        if(temp==10){
	            carry = 1;
	        }else{
	            carry = 0;
	            break;
	        }
	    }
	    if(carry==1)
	        a.add(1);
	    Collections.reverse(a);
			return(a);
	}

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(Solution.plusOne(list));
  }
}
