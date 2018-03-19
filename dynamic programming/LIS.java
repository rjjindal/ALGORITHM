import java.util.*;

class Main{

  static int lis(int arr[], int l){

    int dp[] = new int[l];

    ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();

    Arrays.fill(dp, 1);

    for(int i=1;i<l;i++){

      for(int j=0; j<i; j++){

        if(arr[i]>arr[j] && dp[i]< (dp[j]+1)){
          dp[i] = dp[j] + 1;
        }
      }
    }


    int max = -1;

    for(int i=0; i<l; i++){
      if(max<dp[i]){
        max = dp[i];
      }
    }
    return(max);
  }

  public static void main(String[] args) {

    int arr[] = {2,-1,4,3,5,-1,3,2};

    System.out.println(Main.lis(arr, arr.length));
  }
}
