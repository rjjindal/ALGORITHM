class Main{

  int lookup[] = new int[100];

  public int fibo(int n){
      lookup[0] = 1;
      lookup[1] = 1;
      for(int i=2;i<=n;i++){
        lookup[i] = fibo(i-1) + fibo(i-2);
      }
      return(lookup[n]);
  }

  public static void main(String[] args) {

    Main obj = new Main();
    System.out.println(obj.fibo(3));
  }
}
