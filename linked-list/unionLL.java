import java.util.*;

class Main{

  LinkedList resUnion = new LinkedList();
  LinkedList resInters = new LinkedList();

  Main(){

  }

  // first list should be bigger than the second list
  void unionIntersection(Node h1, Node h2){

    if(h1==null){
      resUnion.head = h2;
      return;
    }

    if(h2==null){
      resUnion.head = h1;
      return;
    }

    HashMap<Integer, Integer> map = new HashMap<>();

    int count = 0;
    while(h1!=null){

      map.put(h1.data, count);
      resUnion.insertAtBeg(h1.data);
      h1 = h1.next;
      count++;
    }

    while(h2!=null){

      if(map.containsKey(h2.data)){

        resInters.insertAtBeg(h2.data);
      }else{
        resUnion.insertAtBeg(h2.data);
      }
      h2 = h2.next;
    }

  }

  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.insertAtBeg(10);
    list.insertAtBeg(15);
    list.insertAtBeg(4);
    list.insertAtBeg(20);

    LinkedList list2 = new LinkedList();

    list2.insertAtBeg(8);
    list2.insertAtBeg(4);
    list2.insertAtBeg(2);
    list2.insertAtBeg(10);

    Main obj = new Main();

    obj.unionIntersection(list.head, list2.head);

    obj.resUnion.printNodes();
  }
}
