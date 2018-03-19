class Main{

  public static void main(String[] args) {

    int k = 1, lineNUm = 1;

    for(int i=0; i<4; i++){

      for(int j=i; j>=0; j--){

        if(lineNUm % 2 == 0)
          System.out.print(k+j);

        if(lineNUm % 2 != 0)
          System.out.print(k);
        k++;

      }
      lineNUm++;
      System.out.println();
    }
  }
}
