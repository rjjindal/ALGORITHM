class Main{

  Node search(Node root, int data){

    if(root==null)
      return(null);

    Node parent = null, current = root;
    if (root.data == data) {
      return(root);
    }else if(root.data > data){
      return(search(root.left,data));
    }else
      return(search(root.right,data));
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

    Node res = obj.search(n, 1);
    if(res!=null){
      System.out.println(res.data);
    }else{
      System.out.println("Not Found!");
    }
  }
}
