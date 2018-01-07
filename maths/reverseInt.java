
public class Solution {
	public int reverse(int a) {
        String str = String.valueOf(a);
        StringBuilder sb = new StringBuilder(str);

	    String  rev = sb.reverse().toString();

	    try{
	    if(a<0){
	        return(Integer.valueOf(rev)*-1);
	    }else{
	        return(Integer.valueOf(rev));
	    }
	    }catch(Exception e){
            return(0);
	    }

	}
}
