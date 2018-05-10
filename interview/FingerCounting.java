class Main{


  static int fingerCounting(int n){

    int temp = n % 8;

    if(temp==0){
      return(2);
    }else if(temp <= 5){
      return(temp);
    }else{
      return(10-temp);
    }
  }


  public static void main(String[] args) {

    System.out.println( Main.fingerCounting(10));
  }
}
