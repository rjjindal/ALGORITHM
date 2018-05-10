import java.util.*;

class Main{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    while(t-- >0){

      int n = in.nextInt();
      int arr[] = new int[n];
      HashSet<Integer> map = new HashSet<>();

      for(int i=0;i<n;i++){
        arr[i] = in.nextInt();
        map.add(arr[i]);
      }

      int res = 0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){

          int sum = arr[i] + arr[j];
          if(sum % 2 == 0){
            if(map.contains( sum/2)){
              res++;
            }
          }
        }
      }

      System.out.println(res);
    }
  }
}
