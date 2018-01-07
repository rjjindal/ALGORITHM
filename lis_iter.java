/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static int len(int arr[], int n){
		
		int len[] = new int[n];
		
		for(int i=0;i<n;i++){
			len[i] = 1;
		}
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i] && (len[j]+1)>len[i]){
					len[i] = len [j] + 1;
				}
			}
		}
		int temp = len[0];
		for(int i=0;i<n;i++){
			if(temp<len[i])
				temp = len[i];
		}
		return(temp);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] ={3,10,2,1,20};
		System.out.println(Ideone.len(arr, tarr.length));
	}
}
