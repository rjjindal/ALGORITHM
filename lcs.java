/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	int lcs(char X[], char Y[], int m, int n){
		
		int L[][] = new int[m+1][n+1];
		
		for(int i =0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				if(i==j)
					L[i][j] = 0;
				else if(X[i]==Y[j])
					L[i][j] = L[i-1][j-1];
				else
					L[i][j] = max(L[i][j-1], L[i-1][j]); 
			}
		}
		
		return(L[m][n]);
	}
	
	int max(int a,int b){
		return( a>b ? a : b);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj = new Ideone();
		char X[] = "AGGTAB".toCharArray();
		char Y[] = "GXTXAYB".toCharArray();
 
		int m = X.length;
		int n = Y.length; 
		System.out.println(obj.lcs(X, Y, m, n));
		
	}
}
