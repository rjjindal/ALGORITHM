class Node{

  int data;
  Node next;

  Node(){}

  Node(int data){
    this.data = data;
    next = null;
  }

  static Node newNode(int data){
    Node n = new Node(data);
    return(n);
  }
}
