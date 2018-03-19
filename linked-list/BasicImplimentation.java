import java.util.*;

class Main{

  public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();

    list.addFirst(4);
    list.addFirst(6);
    list.addFirst(5);

    for(Integer n : list){
      System.out.println(n);
    }
  }
}
