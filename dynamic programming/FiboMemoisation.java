import java.util.*;

class Main{

  int lookup[] = new int[100];

  Main(){
    Arrays.fill(lookup, -1);
  }

  public static int fib(int n){

    if(n<=2)
      return(1);

    return(fib(n-1)+fib(n-2));
  }

  public int fiboDP(int n){

    if(lookup[n]==-1){

      if(n<=2)
        lookup[n] = 1;
      else
        lookup[n] = fib(n - 1) + fib(n - 2);
    }
    return(lookup[n]);
  }

  public static void main(String[] args) {

    Main obj = new Main();

    System.out.println(obj.fiboDP(1));
    // System.out.println(obj.lookup[10]);
  }
}
