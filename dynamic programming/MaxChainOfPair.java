import java.util.*;
class Pair{

  int a;
  int b;

  Pair(){

  }

  Pair(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

class Main{

  static int maxChainPair(Pair[] arr, int n){

    int lis[] = new int[n];

    Arrays.fill(lis, 1);

    for(int i=1;i<n;i++){
      for(int j=0; j<i; j++){
        if(arr[j].b < arr[i].a && lis[i]< lis[j] + 1)
          lis[i] = lis[j] + 1;
      }
    }

    int temp = -1;
    for(int i=0;i<n;i++){
      if(temp < lis[i])
        temp = lis[i];
    }
    return(temp);
  }

  public static void main(String[] args) {

    // taking a sorted array set for example
    Pair arr[] = new Pair[] {new Pair(5,24), new Pair(15, 25),
								new Pair (27, 40), new Pair(50, 60)};

    System.out.println(Main.maxChainPair(arr, arr.length));
  }
}
