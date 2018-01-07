/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
   public static int ans(int n){
        int defeven = 0xAAAAAAAA;
        int defodd = 0x55555555;
        int even =defeven&n;
        int odd = defodd&n;
        int temp= 1;
        int ans = (even>>temp) | (odd<<temp);
        return(ans); 
    }	
    public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Ideone.ans(23));
	}
}
