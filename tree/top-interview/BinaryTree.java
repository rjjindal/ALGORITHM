class Node{

  int data;
  Node left;
  Node right;
  int size;
  int height;

  public static Node newNode(int data){

    Node n = new Node();
    n.data = data;
    n.left = null;
    n.right = null;
    n.size = 1;
    n.height = 1;

    return(n);
  }
}


class BinaryTree{

  Node insertNode(Node root, int data){
    Node node = Node.newNode(data);

    if(root==null){
      return(node);
    }
    Node parent = null, current = root;

    while(current!=null){
      parent = current;

      if(current.data < data)
        current = current.right;
      else
        current = current.left;
    }

    if(parent.data < data){
      parent.right = node;
    }else{
      parent.left = node;
    }
    return(root);
  }

  int height(Node root){

    if(root==null){
      return(0);
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return(1+ Math.max(leftHeight, rightHeight));
  }


    int heightMin(Node root){

      if(root==null){
        return(0);
      }
      int leftHeight = height(root.left);
      int rightHeight = height(root.right);
      return(1+ Math.min(leftHeight, rightHeight));
    }

  // returns total number of nodes in the tree
  int size(Node root){
    if(root==null){
      return(0);
    }

    int leftNum = size(root.left);
    int rightNum = size(root.right);
    return(leftNum+rightNum+1);
  }

  void inOrderTraverse(Node root){
    if(root!=null){
      inOrderTraverse(root.left);
      System.out.println(root.data);
      inOrderTraverse(root.right);
    }
  }


  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    Node n = null;
    n = binaryTree.insertNode(n, 10);
    n = binaryTree.insertNode(n, 15);
    n = binaryTree.insertNode(n, 5);
    n = binaryTree.insertNode(n, 7);
    n = binaryTree.insertNode(n, 19);
    n = binaryTree.insertNode(n, 20);
    n = binaryTree.insertNode(n, -2);
    System.out.println(binaryTree.heightMin(n));
  }
}
