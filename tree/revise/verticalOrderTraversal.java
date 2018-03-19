import java.util.*;

class VerticalOrderTraversal{


  void printVerticalOrder(Node root, int hd, TreeMap<Integer, ArrayList<Integer>> map){

    if(root==null)
      return;

    ArrayList<Integer> get = map.get(hd);

    if(get==null){
      get = new ArrayList<>();
      get.add(root.data);
    }else{
      get.add(root.data);
    }

    map.put(hd, get);

    printVerticalOrder(root.left, hd-1, map);
    printVerticalOrder(root.right, hd+1, map);

  }

  void verticalOrder(Node root){

    TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

    printVerticalOrder(root, 0, map);

    for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet())
      System.out.println(m.getValue() + " ");
  }

  void verticalOrderLevelTraversal(Node root){

    // Base case
    if(root==null)
      return;

    // Create a map and to store the vertical order
    TreeMap<Integer, Queue<Integer>> map = new TreeMap<>();

    // Queue for level order traversal
    Queue<Node> q = new LinkedList<>();

    // init root hd
    root.hd = 0;
    q.add(root);

    while(!q.isEmpty()){

        Node curr = q.poll();

        // get the  Arraylist at 'hd'
        Queue<Integer> get = map.get(curr.hd);

        // Store current node in map 'm'
        if(get==null){
          get = new LinkedList<>();
          get.add(curr.data);
        }else{
          get.add(curr.data);
        }

        map.put(curr.hd, get);

        if(curr.left!=null){
          curr.left.hd= curr.hd - 1;
          q.add(curr.left);
        }

        if(curr.right!=null){
          curr.right.hd= curr.hd + 1;
          q.add(curr.right);
        }
      }

      for(Map.Entry<Integer, Queue<Integer>> m: map.entrySet()){
        System.out.println(m.getValue()+" ");
      }
  }


  public static void main(String[] args) {

    VerticalOrderTraversal obj = new VerticalOrderTraversal();

    BinaryTree binaryTree = new BinaryTree();
    Node n = null;

    n = binaryTree.insertNode(n, 10);
    n = binaryTree.insertNode(n, 15);
    n = binaryTree.insertNode(n, 5);
    n = binaryTree.insertNode(n, 7);
    n = binaryTree.insertNode(n, 19);
    n = binaryTree.insertNode(n, 20);
    n = binaryTree.insertNode(n, -2);
    n = binaryTree.insertNode(n, -3);
    n = binaryTree.insertNode(n, 3);
    n = binaryTree.insertNode(n, 6);
    n = binaryTree.insertNode(n, 8);

    binaryTree.preOrder(n);
    System.out.println();
    obj.verticalOrderLevelTraversal(n);
  }
}
