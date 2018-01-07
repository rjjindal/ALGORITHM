class Main{

  public boolean isTreeSame(Node root1, Node root2){

    if(root1==null && root2==null)
      return(true);
    if(root1==null || root2==null)
      return(false);

    return(root1.data == root2.data && isTreeSame(root1.left, root2.left)
    && isTreeSame(root1.right, root2.right));
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

    BinaryTree binaryTree2 = new BinaryTree();
    Node n2 = null;
    n2 = binaryTree2.insertNode(n, 10);
    n2 = binaryTree2.insertNode(n, 15);
    n2 = binaryTree2.insertNode(n, 5);
    n2 = binaryTree2.insertNode(n, 7);
    n2 = binaryTree2.insertNode(n, 19);
    n2 = binaryTree2.insertNode(n, 20);
    n2 = binaryTree2.insertNode(n, -2);

    Main obj = new Main();

    System.out.println(obj.isTreeSame(n, n2));
  }
}
