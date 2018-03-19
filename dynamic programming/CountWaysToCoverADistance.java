import java.util.*;
class Main{

  int lookUp[] = new int[10000000];

  Main(){
    Arrays.fill(lookUp, -1);
  }

  int solve(int n){

    if(n<0)
      return(0);

    if(n==0)
      lookUp[n] = 1;

    if(lookUp[n]!=-1)
      return(lookUp[n]);

    return( lookUp[n] = solve(n-1) +  solve(n-2) +  solve(n-3));
  }

  public static void main(String[] args) {

    Main obj = new Main();
    System.out.println(obj.solve(4));
  }
}
