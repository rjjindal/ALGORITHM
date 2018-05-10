class Main{

  void mirror(Node root){

    if(root==null){
      return;
    }else{

      mirror(root.left);
      mirror(root.right);

      Node temp;

      temp = root.left;
      root.left = root.right;
      root.right = temp;
    }
  }

  public static void main(String[] args) {

  

  }
}
