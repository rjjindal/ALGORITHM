class Main{

  int lookUp[] = new int[100];

  Main(){
    lookUp[1] = 1;
    lookUp[2] = 1;
  }

  int fibo(int n){

    if(lookUp[n]!=0){
      return(lookUp[n]);
    }else{
      lookUp[n] = fibo(n-1) + fibo(n-2);
    }
    return(lookUp[n]);
  }

  public static void main(String[] args) {

    Main obj = new Main();
    System.out.print(obj.fibo(3));
  }
}
