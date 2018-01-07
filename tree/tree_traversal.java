class Main{


  void preorderTraversal(Node n){

    if(n!=null){
      System.out.println(n.data);
      preorderTraversal(n.left);
      preorderTraversal(n.right);
    }
  }

  void inorderTraversal(Node n){
    if(n!=null){
      inorderTraversal(n.left);
      System.out.println(n.data);
      inorderTraversal(n.right);
    }
  }

  void postorderTraversal(Node n){
    if(n!=null){
      postorderTraversal(n.left);
      postorderTraversal(n.right);
      System.out.println(n.data);
    }
  }

  public static void main(String[] args) {

    Main obj = new Main();

    BinaryTree binaryTree = new BinaryTree();
    Node n = null;
    n = binaryTree.insertNode(n, 10);
    n = binaryTree.insertNode(n, 15);
    n = binaryTree.insertNode(n, 5);
    n = binaryTree.insertNode(n, 7);
    n = binaryTree.insertNode(n, 19);
    n = binaryTree.insertNode(n, 20);
    n = binaryTree.insertNode(n, -2);
    // System.out.println(binaryTree.height(n));
    obj.preorderTraversal(n);
    System.out.println();
    obj.inorderTraversal(n);
    System.out.println();
    obj.postorderTraversal(n);
  }
}
