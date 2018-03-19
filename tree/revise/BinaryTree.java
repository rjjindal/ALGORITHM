import java.util.*;

class Node{

  int data;
  Node left;
  Node right;

  int size;
  int height;
  int hd;

  public static Node newNode(int data){

    Node n = new Node();
    n.data = data;
    n.left = null;
    n.right = null;
    n.hd = 0;

    n.size = 1;
    n.height = 1;

    return(n);
  }
}

class BinaryTree{

  Node insertNode(Node root, int data){

      Node n = Node.newNode(data);

      if(root==null){
        return(n);
      }

      Node parent = null, current = root;

      // moving to the inserting node
      while(current!=null){
        parent = current;

        if(current.data < data){
          current = current.right;
        }else{
          current = current.left;
        }
      }

      // inserting element
      if(parent.data < data){
        parent.right = n;
      }else{
        parent.left = n;
      }

      return(root);
  }

  public void preOrder(Node root){
    if(root!=null){
      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  // public void verticalPreOrder(Node root, int hd){
  //   if(root!=null){
  //
  //     root.hd = hd;
  //
  //     verticalPreOrder(root.left, hd-1);
  //     verticalPreOrder(root.right, hd+1);
  //   }
  // }


  public Node search(Node root,int key){

    if(root==null){
      return(null);
    }

    if(root.data == key){
      return(root);
    }

    if(root.data < key){
      return(search(root.right,key));
    }else{
      return(search(root.left,key));
    }
  }

  public boolean isSame(Node root1, Node root2){

    if(root1==null && root2==null){
      return(true);
    }

    if(root1==null || root2==null){
      return(false);
    }

    return( root1.data == root2.data && isSame(root1.left, root2.left) && isSame(root1.right, root2.right));
  }

  public int height(Node root){

    if(root==null){
      return(0);
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return(1 + (int)Math.max(leftHeight, rightHeight));
  }

  public boolean rooToLeafSum(Node root, int sum, ArrayList<Node> path){

    if(root==null){
      return(false);
    }

    if(root.left==null && root.right==null){

      if(root.data == sum){
        path.add(root);
        return(true);
      }else{
        return(false);
      }
    }

    if(rooToLeafSum(root.left, root.data-sum, path)){
      path.add(root);
      return(true);
    }
    if(rooToLeafSum(root.right, root.data-sum, path)){
      path.add(root);
      return(true);
    }

    return(false);
  }

  void levelOrderTraverse(Node root){

    if(root==null)
      return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){

      Node curr = q.poll();

        if(curr.left!=null)
          q.add(curr.left);

        if(curr.right!=null)
          q.add(curr.right);

        System.out.print(curr.data+" ");
    }
  }

  void levelOrderTraverse1(Node root){

    if(root==null)
      return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){

      Node curr = q.poll();

      if(curr==null){
        if(!q.isEmpty())
          q.add(null);
      }
      else
      {
        if(curr.left!=null)
          q.add(curr.left);

        if(curr.right!=null)
          q.add(curr.right);

        System.out.print(curr.data+" ");
      }
    }
  }

  void levelOrderTraverse2(Node root){

    if(root==null)
      return;

    Queue<Node> q1 = new LinkedList<>();
    Queue<Node> q2 = new LinkedList<>();
    q1.add(root);

    while(!q1.isEmpty() || !q2.isEmpty()){

      while(!q1.isEmpty()){
        Node curr = q1.poll();
        System.out.print(curr.data+" ");

        if(curr.left!=null)
          q2.add(curr.left);

        if(curr.right!=null)
          q2.add(curr.right);


        if (q1.isEmpty()) {
          System.out.println();
        }
      }

      while(!q2.isEmpty()){
        Node curr = q2.poll();
        System.out.print(curr.data+" ");

        if(curr.left!=null)
          q1.add(curr.left);

        if(curr.right!=null)
          q1.add(curr.right);

        if (q2.isEmpty()) {
          System.out.println();
        }
      }
    }
  }


  void reverseLevelOrderTraversal(Node root){

    if(root==null)
      return;

    Queue<Node> q = new LinkedList<>();
    Stack<Integer> s = new Stack();

    q.add(root);

    while(!q.isEmpty()){

      Node curr = q.poll();

      if(curr.right!=null)
        q.add(curr.right);

      if(curr.left!=null)
        q.add(curr.left);

      s.push(curr.data);
    }
    while(!s.empty())
    System.out.print(s.pop()+" ");

  }

  void spiralOrderTraverse(Node root){

    if(root==null)
      return;

    Stack<Node> s1 = new Stack();
    Stack<Node> s2 = new Stack();

    s1.push(root);

    while(!s1.empty() || !s2.empty()){

      while(!s1.empty()){

        Node curr = s1.pop();

        System.out.print(curr.data+" ");


        if(curr.left!=null)
          s2.push(curr.left);

        if(curr.right!=null)
          s2.push(curr.right);
      }

      while(!s2.empty()){

        Node curr = s2.pop();

        System.out.print(curr.data+" ");

        if(curr.right!=null)
          s1.push(curr.right);

        if(curr.left!=null)
          s1.push(curr.left);

      }

    }
  }

  void spiralOrderTraverseDeque(Node root){

    if(root==null)
      return;

    Deque<Node> dq = new LinkedList<>();

    dq.add(null);
    dq.addFirst(root);

    while(dq.isEmpty()){

      Node curr1 = dq.removeFirst();
      Node curr2 = dq.removeLast();

      while(curr1==null){

        System.out.print(curr1);

      }
    }
  }

  // void verticalOrderTraversal(Node root){
  //
  //
  //   if(root==null)
  //     return;
  //
  //   verticalPreOrder(root, 0);
  //
  //   HashMap<Integer, Queue<Node>> map = new HashMap<>();
  //   Queue<Node> q = new LinkedList<>();
  //   q.add(root);
  //
  //   while(!q.isEmpty()){
  //
  //
  //       Node curr = q.poll();
  //
  //       if(map.containsKey((Integer)curr.hd)){
  //         Queue<Node> qtemp = map.get(curr.hd);
  //         qtemp.add(curr);
  //         map.put((Integer)curr.hd, qtemp);
  //       }else{
  //         Queue<Node> temp = new LinkedList<>();
  //         temp.add(curr);
  //         map.put((Integer)curr.hd, temp);
  //       }
  //
  //
  //       if(curr.left!=null)
  //         q.add(curr.left);
  //
  //       if(curr.right!=null)
  //         q.add(curr.right);
  //
  //       // System.out.print(curr.data+" ");
  //   }
  //
  //       // TreeMap to store values of HashMap
  //       TreeMap<Integer, Queue<Node>> sorted = new TreeMap<>();
  //
  //       // Copy all data from hashMap into TreeMap
  //       sorted.putAll(map);
  //
  //       // Display the TreeMap which is naturally sorted
  //       for (Map.Entry<Integer, Queue<Node>> entry : sorted.entrySet()){
  //
  //         Node tt = entry.getValue();
  //         System.out.print(tt.data+" ");
  //         // for(Queue<Node> n: entry.getValue()){
  //         //
  //         //   while(!n.isEmpty()){
  //         //
  //         //     System.out.print(n.pop()+" ");
  //         //   }
  //         // }
  //       }
  //     }

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
    n = binaryTree.insertNode(n, -3);
    n = binaryTree.insertNode(n, 3);
    n = binaryTree.insertNode(n, 6);
    n = binaryTree.insertNode(n, 8);

    // binaryTree.verticalPreOrder(n, 0);

    binaryTree.preOrder(n);
    System.out.println();
    // binaryTree.verticalOrderTraversal(n);
    // binaryTree.spiralOrderTraverse(n);
  }
}
//
