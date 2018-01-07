class Main{

  int fact(int factStart, int num, int s){

    int fact = factStart;
    for(int i= s ; i<=num ; i++){
      fact *= i ;
    }
    return(fact);
  }

  public static void main(String[] args) {

    int n1 = 1, n2 =1;
    int s,g;
    if(n1>n2){
      g = n1;
      s = n2;
    }else{
      g = n2;
      s = n1;
    }

    Main obj = new Main();
    int Fs = obj.fact(1, s, 2);
    int Fg = obj.fact( Fs, g, s);

    double diff = 1.0/Fs - 1.0/Fg;

    System.out.print(diff);
  }
}
