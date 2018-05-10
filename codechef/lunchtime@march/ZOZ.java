import java.util.*;
class Main{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    while(t-->0){

      int res = 0;
      int n = in.nextInt();
      int k = in.nextInt();

      int arr[] = new int[n];
      int sum = 0;
      for(int i=0;i<n;i++){

        arr[i] = in.nextInt();
        sum += arr[i];
      }

      for(int i=0;i<n;i++){
        if( (arr[i]+k) > (sum - arr[i]))
          res++;
      }

      System.out.println(res);
    }
  }
}
