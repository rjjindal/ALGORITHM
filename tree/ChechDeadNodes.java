import java.util.*;

class Main{

  HashMap<Integer, Integer> map = new HashMap<>();
  HashMap<Integer, Integer> lMap = new HashMap<>();


  void postOrder(Node root){

    if(root!=null){

      postOrder(root.left);
      postOrder(root.right);

      map.put(root.data,0);

      if(root.left==null && root.right==null)
        lMap.put(root.data, 0);
    }
  }

  boolean checkDeadNodes(Node root){


    if(root!=null){

      postOrder(root);

      for(Map.Entry<Integer, Integer> entry: lMap.entrySet()){

        if(entry.getKey() == 0 && map.containsKey(entry.getKey()+1)){
          return(true);
        }

        if(map.containsKey(entry.getKey()-1) && map.containsKey(entry.getKey()+1)){
          return(true);
        }
      }

    }
    return(false);
  }

  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree();
    Node n = null;
    n = binaryTree.insertNode(n, 8);
    n = binaryTree.insertNode(n, 5);
    n = binaryTree.insertNode(n, 2);
    n = binaryTree.insertNode(n, 3);
    n = binaryTree.insertNode(n, 7);
    n = binaryTree.insertNode(n, 11);
    n = binaryTree.insertNode(n, 4);

    Main obj = new Main();

    System.out.println(obj.checkDeadNodes(n));
  }
}
