import java.util.*;

class Main{

  void revLevelOrderTraverse(Node root){
    if(root==null){
      return;
    }
    Queue<Node> q = new LinkedList<>();
    Stack<Node> s = new Stack<>();

    q.add(root);
    while(!q.isEmpty()){

      Node curr = q.poll();
      // System.out.println(root.data);

      if(curr.right != null){
        q.add(curr.right);
      }

      if(curr.left != null){
        q.add(curr.left);
      }
      s.push(curr);
    }

    while(!s.empty())
      System.out.print(s.pop().data);
  }

  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree();
    Node n = null;
    n = binaryTree.insertNode(n, 10);
    n = binaryTree.insertNode(n, 30);
    n = binaryTree.insertNode(n, 25);
    n = binaryTree.insertNode(n, 35);
    n = binaryTree.insertNode(n, -10);
    n = binaryTree.insertNode(n, 0);
    n = binaryTree.insertNode(n, -20);
    n = binaryTree.insertNode(n, -15);
    n = binaryTree.insertNode(n, 45);

    System.out.println("inorder Traversal");
    binaryTree.inOrderTraverse(n);

    System.out.println("level Order Traversal");
    Main obj = new Main();
    obj.revLevelOrderTraverse(n);
  }
}
