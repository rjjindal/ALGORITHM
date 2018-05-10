import java.util.*;

class Main{

  static int count(int arr[], int n, int s){

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<n;i++)
      map.put(arr[i], i);

    int count = 0;
    for(int i=0;i<(n-1);i++){

      for(int j=i+1;j<n;j++){

        if( arr[i]*arr[j] <=s && arr[i]*arr[j]!=0 && s % (arr[i]*arr[j])  == 0){
          int check = s/(arr[i]*arr[j]);

          if(map.containsKey(check) && check!=arr[i] && check!=arr[j] && i < map.get(check) && j < map.get(check)){
            count++;
          }
        }
      }
    }
    return(count);
  }

  public static void main(String[] args) {

    int arr[] = {1, 4, 6, 2, 3, 8};
    int sum = 24;
    System.out.println(Main.count(arr, arr.length, sum));
  }
}
