class Main{

  int fact(int n){
    if(n<2)
      return(1);
    else
      return(n*fact(n-1));
  }

  public static void main(String[] args) {
    Main obj = new Main();

    System.out.println(obj.fact(4));
  }
}
