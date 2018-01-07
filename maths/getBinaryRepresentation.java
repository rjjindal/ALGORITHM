class Main{

  public static void main(String[] args) {

    int num=10;

    System.out.println(Main.getBin(num));
  }

  public static String getBin(int a){
    String bin = new String();
    String temp=null;
    while(a!=0){
      bin += ( (a & 1 )== 1 )? "1" : "0";
      a = a>>1;
    }
    return(bin);
  }
}
