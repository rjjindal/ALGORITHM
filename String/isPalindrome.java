class Solution {
	public static int isPalindrome(String a) {

			// convert str to only alphanumeric str
	    String st = a.replaceAll("[^A-Za-z0-9]","").replaceAll("[\\s]","").toLowerCase();
			System.out.println(st+"");
	    int l = st.length();
	    int flag=0;
	    for(int i=0, j=l-1; i<j; i++,j--){
	        if(st.charAt(i)!=st.charAt(j)){
	            flag=1;
	            return(0);
	        }
	    }
	    return(1);
	}

  public static void main(String[] args) {

    String str = "A man, a plan, a canal: Panama";
    System.out.println(Solution.isPalindrome(str));
  }
}
