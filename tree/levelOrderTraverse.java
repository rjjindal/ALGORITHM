import java.util.*;

class Main{

  void levelOrderTraverse(Node root){
    if(root==null){
      return;
    }
    Queue<Node> q = new LinkedList();
    q.add(root);
    while(!q.isEmpty()){
        root = q.poll();
        System.out.println(root.data);
        if(root.left != null){
            q.add(root.left);
        }
        if(root.right != null){
          q.add(root.right);
        }

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

    System.out.println("inorder Traversal");
    binaryTree.inOrderTraverse(n);

    System.out.println("level Order Traversal");
    Main obj = new Main();
    obj.levelOrderTraverse(n);
  }
}
