import java.util.*;
class Main{

  static int bitonicSeq(int a[], int n){

    int lrLPS[] = new int[n];
    int rlLPS[] = new int[n];
    int sol[] = new int[n];

    Arrays.fill(lrLPS, 1);
    Arrays.fill(rlLPS, 1);

    for(int i=1;i<n;i++){
      for(int j=0;j<i;j++){

        if(a[i]> a[j] && lrLPS[i]< (lrLPS[j] + 1))
          lrLPS[i] = lrLPS[j] + 1;
      }
    }

    for(int i=n-2;i>=0;i--){
      for(int j=n-1;j>i;j--){

        if(a[i]> a[j] && rlLPS[i]< (rlLPS[j] + 1))
          rlLPS[i] = rlLPS[j] + 1;
      }
    }

    // bitonic sequence array
    for(int i=0;i<n;i++)
      sol[i] = lrLPS[i] + rlLPS[i] - 1;

    int t = -1;

    for(int i=0;i<n;i++){
      if(t<sol[i])
        t = sol[i];
    }

    return(t);
  }

  public static void main(String[] args) {
    int a[] = {2,-1,4,3,5,-1,3,2};

    System.out.println(Main.bitonicSeq(a, a.length));

  }
}
