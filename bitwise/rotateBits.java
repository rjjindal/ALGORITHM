class Main{

  public static int leftShift(int n, int d){

    return((n<<d) | (n>>(32-d)));
  }

  public static itn rightShift(int n, int d){

    return((n>>d) | (n<<(32-d)));
  }

  public static void main(String[] args) {
    System.out.println(Main.leftShift(4,30));
  }
}
