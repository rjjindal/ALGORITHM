import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int q = in.nextInt();
    int l = in.nextInt();
    int r = in.nextInt();

    int arr[] = new int[n];

    Arrays.fill(arr,0);
    while(q-->0){
      int qType = in.nextInt();
      int qL = in.nextInt();
      int qR = in.nextInt();

      if(qType==1){
        arr[qL-1] = qR;
      }else{
        int cnt = 0;

        for (int i=(qL-1); i <qR; i++)
        {
          int max = arr[i];
            if(max>=l && max<=r){
              cnt++;
            for (int j=i+1; j<qR; j++)
            {
              if(max < arr[j]){
                max = arr[j];
                if(max>=l && max<=r){
                  cnt++;
                }else{
                  break;
                }
              }
              cnt++;
            }
          }
        }
        System.out.println(cnt);
      }
    }
  }
}
