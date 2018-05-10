import java.util.*;
class Main{


  // O(n) complexity
  // works for binary tree and binary search tree
  public boolean rootToLeafSum(Node root, int sum, ArrayList<Integer> result){

    if(root==null)
      return(false);

    // leaf node
    if( root.left==null && root.right==null ){
      if(sum == root.data){
        result.add(root.data);
        return(true);
      }else{
        return(false);
      }
    }

    if(rootToLeafSum(root.left, sum-root.data, result)){
      result.add(root.data);
      return(true);
    }

    if(rootToLeafSum(root.right, sum - root.data, result)){
      result.add(root.data);
      return(true);
    }

    return(false);

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
    ArrayList<Integer> res = new ArrayList<>();
    System.out.println(obj.rootToLeafSum(n, 13, res));

    for(Integer num: res){
      System.out.println(num);
    }
  }
}
