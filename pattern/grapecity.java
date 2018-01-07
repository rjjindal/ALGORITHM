class Main{
  public static void main(String[] args) {

    int j=0;
    for(int i=1;i<=5;i++){
      for(j=0;j<i;j++){
        System.out.print((i+j));
      }
      for(int k=1;k<i;k++){
        System.out.print((i+j-k-1));
      }
      System.out.println();
    }
  }
}
