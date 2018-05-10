import java.util.*;

class Main{

  public static void main(String[] args) {

    Scanner in  = new Scanner(System.in);

    int n = in.nextInt();

    int c[] = new int[n];
    int t[] = new int[n];

    for(int i=0;i<n;i++){
      c[i] = in.nextInt();
    }

    int t1min = Integer.MAX_VALUE, t2min = Integer.MAX_VALUE, t3min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      t[i] = in.nextInt();

      if(t[i] == 1 && t1min > c[i]){
        t1min = c[i];
      }else if(t[i] == 2 && t2min > c[i]){
        t2min = c[i];
      }
      else if(t[i] == 3 && t3min > c[i]){
        t3min = c[i];
      }
    }

    int res = Math.min(t3min, (t1min + t2min));
    System.out.println(res);

  }
}
