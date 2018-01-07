// Given an array of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Main{

  public static int findMinXor(ArrayList<Integer> A) {

       Collections.sort(A);

       int min=Integer.MAX_VALUE;
       for(int i=0;i< A.size()-1;i++){

               int temp =(A.get(i)^ A.get(i+1));
               // if(min > temp){
               //     min = A.get(i)^ A.get(i+1);
               // }
               min = Math.min(temp, min);
           }

       return(min);
   }

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();

    al.add(3);
    al.add(1);
    al.add(13);
    al.add(12);
    al.add(121);
    System.out.println(Main.findMinXor(al));
  }
}
