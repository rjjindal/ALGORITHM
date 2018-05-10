class Main{


  public int size(Node head){

    if(head==null)
      return(0);

    return(1 + size(head.next));
  }

  public static void main(String[] args) {

    LinkedList list1 = new LinkedList();

    list1.insertAtBeg(3);
    list1.insertAtBeg(6);
    list1.insertAtBeg(7);
    list1.insertAtBeg(9);

    Main obj = new Main();

    System.out.println(obj.size(list1.head));
    
  }
}
