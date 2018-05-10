// Given two numbers IN a linked list from M.S.B to L.S.B. Find the sum of these two numbers and store them in a linked list

// Implimentation problem with recursion solution for numbers of different sizes.

class Main{

  int carry = 0;

  void addNumbers(Node h1, Node h2){

    if(h1==null && h2==null)
      return;

    if(h1.next==null && h2.next!=null)
      addNumbers(h1, h2.next);

    if(h1.next!=null && h2.next==null)
      addNumbers(h1.next, h2);

    addNumbers(h1.next, h2.next);

    // System.out.println(h1.data+" "+ h2.data);

    int sum = h1.data + h2.data + carry;
    carry = sum/10;

    System.out.println(sum % 10);

  }

  public static void main(String[] args) {

    LinkedList list1 = new LinkedList();

    list1.insertAtBeg(3);
    list1.insertAtBeg(6);
    // list1.insertAtBeg(5);
    // list1.printNodes();
    // list1.insertAtBeg('k');
    // list1.insertAtBeg('s');
    // list1.insertAtBeg('a');

    LinkedList list2 = new LinkedList();

    // list2.insertAtBeg('g');

    list2.insertAtBeg(2);
    list2.insertAtBeg(4);
    // list2.insertAtBeg(8);
    // list2.printNodes();
    // list2.insertAtBeg('s');
    // list2.insertAtBeg('a');

    Main obj = new Main();

    obj.addNumbers(list1.head, list2.head);

  }
}
