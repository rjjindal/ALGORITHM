class Main{

  Node reverseLL(Node head){


    // if(head==null || head.next==null)
    //   return(head);

    Node prev = null, curr = head, next =null;
    while(curr!=null){

      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return(prev);
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtBeg(9);
    list.insertAtBeg(7);
    // list.insertAtBeg(5);
    // list.insertAtBeg(3);
    //
    // list.insertAtEnd(11);
    // list.sortedInsert(6);

    // list.printNodes();

    Main obj = new Main();

    list.head = obj.reverseLL(list.head);

    list.printNodes();
  }
}
