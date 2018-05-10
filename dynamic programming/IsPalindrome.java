class Main{

  boolean isPalindrome(int arr[], int n){

    boolean lookup[][] = new boolean[n][n];

    for(int i=0;i<n;i++)
      lookup[i][i] = true;

    for(int i=0; i<n ;i++){
      for(int j=0, p=i; j<(n-i) && p < n; j++,p++){

        if(j==p){
          // dp[j][p] = 1;
          continue;
        }

        if((j+1)==p){
          lookup[j][p] = arr[j]==arr[p];
          continue;
        }

        lookup[j][p] = arr[j]==arr[p] && lookup[j+1][p-1];
      }
    }
    return(lookup[0][n-1]);
  }

  public static void main(String[] args) {

    Main obj = new Main();

    int arr[] = {3,3,4,3,1};
    System.out.println(obj.isPalindrome(arr, arr.length));
  }
}
