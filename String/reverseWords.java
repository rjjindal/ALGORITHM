class Solution {
	public static String reverseWords(String a) {
	    String str[] = a.split(" ");
      StringBuilder result = new StringBuilder();

      for(int i=str.length-1 ; i>=0; i--){
        // System.out.println(s);
        result.append(str[i]+" ");
      }
      return(result.toString());
	}

  public static void main(String[] args) {

    System.out.println(Solution.reverseWords("the sky is blue"));

  }
}
