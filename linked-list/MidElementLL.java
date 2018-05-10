class Main{

  Node getMidElement(Node head){

    Node slow = head, fast = head;

    while(fast!=null && fast.next!=null){

      slow = slow.next;
      fast = fast.next.next;
    }

    return(slow);
  }

  Node getMidElementMethod2(Node head){

    Node mid = head;
    int counter = 0;

    while(head!=null){

      if(counter%2 == 1)
        mid = mid.next;

      head = head.next;
      counter++;
    }

    return(mid);
  }

  public static void main(String[] args) {

    LinkedList list1 = new LinkedList();

    list1.insertAtBeg(3);
    list1.insertAtBeg(6);
    list1.insertAtBeg(7);
    list1.insertAtBeg(9);
    list1.insertAtBeg(19);

    Main obj = new Main();

    // System.out.println(obj.getMidElement(list1.head).data);
    System.out.println(obj.getMidElementMethod2(list1.head).data);
  }
}
