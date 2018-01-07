class Main{

  boolean checkCompleteBinaryTree(BNode root){

    if(root==null)
      return(true);

    if(root.left==null && root.right==null)
      return(true);

    if(root.left!=null && root.right!=null)
      return( checkCompleteBinaryTree(root.left) && checkCompleteBinaryTree(root.right) );

    return(false);
  }

  public static void main(String[] args) {


    BNode root = new BNode(1);
    root.left = new BNode(2);
    root.right = new BNode(3);
    root.left.left = new BNode(4);
    root.left.right = new BNode(5);

    root.right.left = new BNode(6);
    root.right.left.left = new BNode(9);
    root.right.left.right = new BNode(8);
    root.right.right = new BNode(7);

    Main obj = new Main();
    System.out.println(obj.checkCompleteBinaryTree(root));
  }
}
