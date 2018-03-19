
class Node{

  int data;
  Node next;

  Node(){}

  Node(int data){
    this.data = data;
    this.next = null;
  }

   static Node createNode(int n){
    return(new Node(n));
  }
}

class LinkedList{

  Node head = null;

  void printNodes(){

    Node temp = head;
    if(temp==null)
      return;

    while(temp!=null){

      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  void printNodes(Node head){

    Node temp = head;
    if(temp==null)
      return;

    while(temp!=null){

      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  void insertAtBeg(int n){

    Node newNode = Node.createNode(n);

    if(head==null){
      head = newNode;
    }else{
      newNode.next = head;
      head = newNode ;
    }
  }

  void insertAtEnd(int n){

    Node newNode = Node.createNode(n);
    Node temp = head;
    if(temp==null)
      head = newNode;
    else{
      while(temp.next!=null){
        temp = temp.next;
      }

      temp.next = newNode ;
    }
  }

// assuming list is sorted in ascending order
  void sortedInsert(int n){

    Node newNode = Node.createNode(n);

    Node prev = null;
    Node curr = head;

    if(curr==null || curr.data > n ){

      newNode.next = head;
      head = newNode;
    }else{

      while(curr != null && curr.data < n){
        prev = curr;
        curr = curr.next;
      }

      newNode.next = curr;
      prev.next = newNode;
    }

  }

  boolean deleteNode(Node n){

    if(head==null)
      return(false);

    if(head.data == n.data){
      head = head.next;
      return(true);
    }

    Node prev = null, curr = head;
    while(curr!=null){

      if(curr.data == n.data){
        prev.next = curr.next;
        return(true);
      }

      prev = curr;
      curr = curr.next;

    }
    return(false);
  }

  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.insertAtBeg(9);
    list.insertAtBeg(7);
    list.insertAtBeg(5);
    list.insertAtBeg(3);

    list.insertAtEnd(11);
    list.sortedInsert(6);


    list.printNodes();
    System.out.println("After deletion!");
    list.deleteNode(new Node(3));

    list.printNodes();
  }
}
