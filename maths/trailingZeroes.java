// Given an integer n, return the number of trailing zeroes in n!.

class Solution {
	public static int trailingZeroes(int a) {

	    int result=0;
	    int temp=a;
	    for(int i=5; (a/i)!=0; i=i*5){
	        result += a/i;
	    }
	    return(result);
	}

  public static void main(String[] args) {

    int num = 5;
    System.out.println(trailingZeroes(num));
  }
}
