class Main{

  int MAX = 100;
  int lookUp[] = new int[MAX];
  int NULL = -1;

  void init(){

    lookUp[0] = 1;
    lookUp[1] = 1;
    for(int i=2; i<MAX;i++){
      lookUp[i] = NULL;
    }
  }

  int fibo(int n){

    if(lookUp[n]==NULL){
        if(n<=1)
          lookUp[n] = 1;
        else
          lookUp[n] = fibo(n-1) + fibo(n-2);
    }
    return(lookUp[n]);
  }

  public static void main(String[] args) {

    int n=3;
    Main obj = new Main();
    obj.init();
    System.out.println(obj.fibo(n));
  }
}
