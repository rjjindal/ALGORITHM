class Main{

  Node root;
  static int preIndex = 0;


////////////////////////////////////////////
  Node buildTree(int in[], int pre[], int instart, int inend){

    if(instart>inend)
      return(null);

    Node temp = new Node(pre[preIndex++]);

    if(instart==inend)
      return(temp);

    int inIndex = search(in, instart, inend, temp.data);

    temp.left = buildTree(in, pre, instart, inIndex-1);
    temp.right = buildTree(in, pre, inIndex+1, inend);

    return(temp);
  }






  
  int search(char arr[], int strt, int end, char value)
      {
          int i;
          for (i = strt; i <= end; i++)
          {
              if (arr[i] == value)
                  return i;
          }
          return i;
      }

  /* This funtcion is here just to test buildTree() */
  void printInorder(Node node)
  {
      if (node == null)
          return;

      /* first recur on left child */
      printInorder(node.left);

      /* then print the data of node */
      System.out.print(node.data + " ");

      /* now recur on right child */
      printInorder(node.right);
  }

  // driver program to test above functions
  public static void main(String args[])
  {
      BinaryTree tree = new BinaryTree();
      char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
      char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
      int len = in.length;
      Node root = tree.buildTree(in, pre, 0, len - 1);

      // building the tree by printing inorder traversal
      System.out.println("Inorder traversal of constructed tree is : ");
      tree.printInorder(root);
  }
}
