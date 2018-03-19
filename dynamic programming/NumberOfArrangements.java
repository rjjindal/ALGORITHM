import java.util.*;
class Main{

  int lookUp[] = new int[100];

  Main(){
    Arrays.fill(lookUp, -1);
  }

  public int solve(int n){

    if(n<0)
      return(0);

    if(n==0)
      return(1);

    if(lookUp[n]!=-1)
      return(lookUp[n]);

    return( lookUp[n] = solve(n-n/2) + solve(n-n/3) + solve(n-n/4));
  }

  public static void main(String[] args) {

    Main obj = new Main();

    System.out.println(obj.solve(12));
  }
}
