class Main{

  Node lowestCommonAncestor(Node root, int n1, int n2){

    if(root.data > Math.max(n1, n2)){
      return(lowestCommonAncestor(root.left, n1, n2));
    }else if(root.data > Math.max(n1, n2)){
      return(lowestCommonAncestor(root.right, n1, n2));
    }else{

      return(root);
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

    Main obj = new Main();
    Node res = obj.lowestCommonAncestor(n, 20, 7);
    System.out.println(res.data);
  }
}
