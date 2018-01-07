class Main{

  // my sol

  // int minValue = Integer.MIN_VALUE;
  // int maxValue = Integer.MAX_VALUE;
  //
  // boolean checkBST(Node root){
  //   if(root==null)
  //     return(true);
  //
  //   if(root.data < minValue && root.data > maxValue){
  //     return(false);
  //   }
  //
  //   maxValue = root.data;
  //   checkBST(root.left);
  //   minValue = root.data;
  //   checkBST(root.right);
  //   return(true);
  //
  // }


  public boolean isBST(Node root){
    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBST(Node root, int min, int max){
    if(root == null){
      return true;
    }
    if(root.data <= min || root.data > max){
      return false;
    }
    return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
  }

  public static void main(String[] args) {


      // this class won't work because it adds elements in bst fashion
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
    System.out.println(obj.checkBST(n));

  }
}
