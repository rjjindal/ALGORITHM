import java.util.Map.Entry;
import java.util.*;
class Main{

  void getVerticalOrder(BNode root ,int hd ,TreeMap<Integer, ArrayList<Integer>> m){

    if(root==null){
      return;
    }
    ArrayList<Integer> bucket = m.get(hd);

    if(bucket==null){
      bucket = new ArrayList<Integer>();
      bucket.add(root.data);
    }else{
      bucket.add(root.data);
    }

    m.put(hd, bucket);

    getVerticalOrder(root.left, hd-1, m);
    getVerticalOrder(root.right, hd+1, m);

  }

  void printVerticalOrder(BNode root){



    TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
    int hd=0;
    getVerticalOrder(root, hd, m);

    for(Entry<Integer, ArrayList<Integer>> e: m.entrySet()){
      System.out.println(e.getValue());
    }
  }

  public static void main(String[] args) {

    BNode root = new BNode(1);
    root.left = new BNode(2);
    root.right = new BNode(3);
    root.left.left = new BNode(4);
    root.left.right = new BNode(5);

    root.right.left = new BNode(6);
    root.right.left.right = new BNode(8);
    root.right.right = new BNode(7);
    root.right.right.right = new BNode(9);

    Main obj = new Main();
    obj.printVerticalOrder(root); 
  }
}
