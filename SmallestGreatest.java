/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @author rishabh
 * 
 * 
 * using median order statistics 
 * this algo decreases the complexity for finding smallest and largest element in the array
 * 
 */
public class SmallestGreatest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        int index;
        int min=0,max=0;
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        
        if(size%2!=0){
            min=arr[0];
            max=arr[0];
            index=1;
        }else{
            if(arr[0]<arr[1]){
                min=arr[0];
            }else{
                max=arr[1];
            }
            index=2;
        }
        
        for(int j=index;j<size;j=j+2){
            int tempMin;
            int tempMax;
            if(arr[j]<arr[j+1]){
                tempMin=arr[j];
                tempMax=arr[j+1];
            }else{
                tempMin=arr[j+1];
                tempMax=arr[j];
            }
            if(min>tempMin){
                min=tempMin;
            }
            if(max<tempMax){
                max=tempMax;
            }
            
        }
        System.out.println("Smallest:"+min);
        System.out.println("Largest:"+max);
        
    }
}
