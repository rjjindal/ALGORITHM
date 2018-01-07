import java.util.*;

// write a program for eliminating the duplicates values from a given array
class Main{

  public static void main(String[] args) {
    int arr[] = { 1, 2 ,1 ,2 ,4, 5};

    HashSet<Integer> m = new HashSet<Integer>();

    for(int i=0;i<arr.length; i++){
      m.add(arr[i]);
    }

    for(int i : m){
      System.out.println(i);
    }
  }
}
