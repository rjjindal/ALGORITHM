import java.util.*;

class Main{


  public static void main(String[] args) {

    Deque<String> q = new LinkedList<>();

    q.add("element1");
    q.add("element2");
    q.push("element3");
    q.push("element3");

    String f = q.removeFirst();
    String l = q.removeLast();

    System.out.print(f+" "+l);
    Iterator itr = q.iterator();
    while(itr.hasNext()){
      System.out.print(itr.next()+" ");
    }

  }
}
