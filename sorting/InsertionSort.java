/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.sorting;

import java.util.Scanner;

/**
 *
 * @author rishabh
 */
public class InsertionSort {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]={1,40,3,44};
        int temp,j;
        
                
        for(int i=1;i<arr.length;i++){
            
             temp=arr[i];
             j=i-1;
            while(temp<arr[j]&& j>=0){
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=temp;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
