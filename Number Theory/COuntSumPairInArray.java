import java.util.*;
class Main{

  static int countPairs(int arr[], int sum){

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<arr.length; i++){

      if(!map.containsKey(arr[i]))
        map.put(arr[i], 0);

      map.put(arr[i], map.get(arr[i])+1);
    }

    int res = 0;
    for(int i=0;i< arr.length;i++){

      if(map.containsKey(sum-arr[i]))
        res += map.get(sum-arr[i]);

      if(sum == arr[i]*2)
        res--;
    }

    return(res/2);
  }

  public static void main(String[] args) {

    int arr[] = {1, 1, 1, 1};
    int sum = 2;

    System.out.println(Main.countPairs(arr, sum));
  }
}
