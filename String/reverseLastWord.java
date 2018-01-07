class Solution {
	public static int reverseWords(String a) {
	    int len = a.length();

      // System.out.println(len+"");
      int count=0;
      for(int i=len-2; i>=0; i--){
        count++;
        if(a.charAt(i)==32 || i==0){
          return(count);
        }
      }
      return(0);
	}

  public static void main(String[] args) {

    System.out.println(Solution.reverseWords("the sky is blue"));

  }
}
