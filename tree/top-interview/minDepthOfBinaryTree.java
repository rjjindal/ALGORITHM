import java.util.*;

// http://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree//
class Main{

  int levelOrderTraverse(Node root){
    if(root==null){
      return(0);
    }
    Queue<Node> q = new LinkedList();
    q.add(root);
    while(!q.isEmpty()){
        root = q.poll();
        // System.out.println(root.data);

        if(root.left == null && root.right == null){
          return(root.height);
        }

        if(root.left != null){
          root.left.height= root.height + 1;
          q.add(root.left);
        }
        if(root.right != null){
          root.right.height= root.height + 1;
          q.add(root.right);
        }

    }
    return(1);
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
    System.out.print(obj.levelOrderTraverse(n));
  }
}
