class Main{

  int compare(Node l1, Node l2){

    while(l1!=null && l2!=null){

      if(l1.data != l2.data){

        return(l1.data > l2.data ? 1 : -1);
      }
      l1 = l1.next;
      l2 = l2.next;
    }

    if(l1!=null){
      return(1);
    }

    if(l2!=null){
      return(-1);
    }
    return(0);
  }

  public static void main(String[] args) {

    LinkedList list1 = new LinkedList();

    list1.insertAtBeg('g');
    list1.insertAtBeg('e');
    list1.insertAtBeg('e');
    list1.insertAtBeg('k');
    list1.insertAtBeg('s');
    list1.insertAtBeg('a');

    LinkedList list2 = new LinkedList();

    // list2.insertAtBeg('g');
    list2.insertAtBeg('e');
    list2.insertAtBeg('e');
    list2.insertAtBeg('k');
    list2.insertAtBeg('s');
    list2.insertAtBeg('a');

    Main obj = new Main();

    System.out.println(obj.compare(list1.head, list2.head));


  }
}
