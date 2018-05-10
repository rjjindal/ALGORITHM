// this is the complete working program to cal the sum of two numbers.
// given first num  is greater than the second number.

class Main{

  int carry;
  LinkedList res = new LinkedList();

  Main(){
    carry = 0;
  }

  void addSameSizeNum(Node h1, Node h2){

    if(h1==null && h2==null)
      return;

    addSameSizeNum(h1.next, h2.next);


    int sum = h1.data + h2.data + carry;

    // System.out.println("h1:" + h1.data + "h2:" + h2.data + "Sum:"+ sum + "carry " + carry );

    carry = sum / 10;

    res.insertAtBeg(sum % 10);
  }


  void addRestNumbers(Node h1, Node cur){

    if(h1!=cur){
      addRestNumbers(h1.next, cur);
      int sum = h1.data + carry;
      carry = sum / 10;
      res.insertAtBeg(sum % 10);
    }
  }


  void addNumbers(Node h1, Node h2){

    if(h1==null){
      res.head = h2;
      return;
    }

    if(h2==null){
      res.head = h1;
      return;
    }

    int s1 = getSize(h1);
    int s2 = getSize(h2);

    if(s1 == s2){
      addSameSizeNum(h1, h2);
    }else{

      // assuming h1 size is greater than h2 size
      int diff = Math.abs(s1 - s2);

      // move diff. number of nodes in first list
      Node temp = h1;
      Node cur = null;
      while (diff-- >= 0)
      {
          cur = temp;
          temp = temp.next;
      }

      addSameSizeNum(cur, h2);

      addRestNumbers(h1, cur);
    }
    if(carry > 0)
      res.insertAtBeg(carry);
  }

  int getSize(Node h){

    if (h==null)
      return(0);

    return(1 + getSize(h.next));
  }

  public static void main(String[] args) {

    LinkedList list1 = new LinkedList();

    list1.insertAtBeg(9);
    list1.insertAtBeg(4);
    list1.insertAtBeg(8);

    LinkedList list2 = new LinkedList();


    list2.insertAtBeg(3);
    // list2.insertAtBeg(6);
    // list2.insertAtBeg(5);

    Main obj = new Main();

    obj.addNumbers(list1.head, list2.head);
    obj.res.printNodes();
  }
}
