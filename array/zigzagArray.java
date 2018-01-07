// Convert array into Zig-Zag fashion
// Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
// Example:
// Input:  arr[] = {4, 3, 7, 8, 6, 2, 1}
// Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
//
// Input:  arr[] =  {1, 4, 3, 2}
// Output: arr[] =  {1, 4, 2, 3}
import java.util.Collections;
import java.util.ArrayList;

class Main{

  static ArrayList<Integer> zigzagArray(ArrayList<Integer> list){

    int temp = 0;
    Collections.sort(list);
    for(int i=1;i<list.size()-1;i=i+2){
      temp =list.get(i);
      list.set(i,list.get(i+1));
      list.set(i+1,temp);
    }
    return(list);
  }

  public static void main(String[] args) {

// {4, 3, 7, 8, 6, 2, 1}
    ArrayList<Integer> ll = new ArrayList<Integer>();
    ll.add(4);
    ll.add(3);
    ll.add(7);
    ll.add(8);
    ll.add(6);
    ll.add(2);
    ll.add(1);

    System.out.println(Main.zigzagArray(ll));

  }
}
