import java.util.*;
class Main{

  public static void main(String[] args) {
    String str = "rishabhjindal";
    char arr[] = str.toCharArray();
    Arrays.sort(arr);
    for(char c: arr){
      System.out.print(c+" ");
    }
  }
}
