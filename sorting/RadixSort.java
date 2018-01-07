/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rishabh
 */
public class RadixSort {
    
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++){
            System.out.print("a["+i+"]:");
            arr[i]=input.nextInt();
        }
        
        int index[]=new int[10];
        Arrays.fill(index, 0);
        int status[][]=new int[10][size];
        for(int i=0;i<10;i++){
            Arrays.fill(status[i],0 );
        }
        
        
        
        int length=digitLength(max(arr,size));
        
        for(int i=0;i<length;i++){
            
            
            for(int j=0;j<size;j++){
            int place= arr[j]% (int)Math.pow(10,i);
                
                status[place][index[place]]=arr[j];
                index[place]++;
            }
            
            int indx=0;
            for(int k=0;k<10;i++){
                for(int l=0;l<size;l++){
                    if(status[k][l]!=0){
                        arr[indx]=status[k][l];
                    }
                }
            }
            
        }
        printArray(arr, size);
        
    }
    
    public static int max(int arr[],int size){
        int temp=arr[0];
        
        for(int i=0;i<size;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
    public static int digitLength(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    
    public static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    
    
   
    
}
