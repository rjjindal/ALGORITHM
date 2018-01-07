class Main{

  static int count = 0;

  Main(){
    count++;
    System.out.println(count);
  }

  static cube(int c){
    return(c*c*c);
  }

  public static void main(String[] args) {

    Main obj =new Main();
    Main obj2 =new Main();
    Main obj3 =new Main();
  }
}
