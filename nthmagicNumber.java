import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
 
	static int nthMagicNum(int n){
		int pow=1;
		int ans=0;
		int temp =1;
		while(n!=0){
			pow = pow*5;
 
			if((n&temp)==1){
				ans+=pow;
			}
 
			n = n>>1;
		}
		return(ans);
	} 
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(nthMagicNum(4));
	}
}
