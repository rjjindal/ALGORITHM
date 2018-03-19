import java.util.*;

class Main{

  int numberOfArrangements(int s[], int m, int n){

    if(n==0)
      return(1);

    if(n<0)
      return(0);

    if (m <=0 )
        return 0;

    return(numberOfArrangements(s, m-1, n) + numberOfArrangements(s, m, n-s[m-1]));
  }

  public static void main(String[] args) {

    int s[] = {1,2,3};
    int n = 4;
    Main obj = new Main();

    System.out.println(obj.numberOfArrangements(s, s.length, n));
  }
}
