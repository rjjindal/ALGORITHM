

class Solution {

	public static boolean isPalindrome(int a) {
    String str = String.valueOf(a);
	  StringBuilder sb = new StringBuilder(str);
		  // System.out.println(sb.reverse().toString());
	  if( sb.reverse().toString().equals(str)){
	    return(true);
    }
	  return(false);
	}

  public static void main(String[] args) {
    System.out.println(isPalindrome(12321));
  }
}
