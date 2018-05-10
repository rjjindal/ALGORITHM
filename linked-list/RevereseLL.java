class Main{

  Node head = null;

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

  void reverseRecursive(Node curr, Node prev){

    if(curr.next==null){

      head = curr;
      curr.next = prev;
      return;
    }

    Node next = curr.next;
    curr.next = prev;
    reverseRecursive(next, curr);
  }


  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtBeg(9);
    list.insertAtBeg(7);
    list.insertAtBeg(5);

    Main obj = new Main();

    list.printNodes();
    obj.head = list.head;
    obj.reverseRecursive(obj.head, null);

    System.out.println("After Recusrsion");
    list.printNodes(obj.head);
  }
}
