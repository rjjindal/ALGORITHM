import java.util.*;

class Main{

  int lookUp[] = new int[1000000000];

  Main(){
    Arrays.fill(lookUp, -1);
    for(int i=0;i<12;i++){
      lookUp[i] = i;
    }
  }

  int solve(int n){

    if(n<12)
      return(lookUp[n]);

    if(lookUp[n]!=-1)
      return(lookUp[n]);

    return( lookUp[n] = solve(n/2) + solve(n/3) + solve(n/4));
  }

  public static void main(String[] args) {

    Main obj = new Main();

    System.out.println(obj.solve(12));
  }
}
