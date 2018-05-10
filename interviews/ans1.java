import java.util.*;

class Main{

  int out[] = new int[1000001];

  void dpSolve(){

    Arrays.fill(out, 0);

    for(int i=1; i<1000001;i++){

      int isPresent[] = new int[10];
      Arrays.fill(isPresent,0);

      int flag = 0;
      String numStr = String.valueOf(i);

      for(int j=0; j < numStr.length();j++){

        if(isPresent[numStr.charAt(j)-'0']!=0){
          flag = 1;
          break;
        }else{
          isPresent[ numStr.charAt(j) - '0'] = 1;
        }
      }

      if(flag == 1)
        out[i] = 0;
      else
        out[i] = 1;
    }

    for(int i=1;i<1000001;i++)
      out[i] += out[i-1];
  }

  void countNumbers(int arr[][]){

    dpSolve();

    for(int i=0;i<arr.length;i++){
      System.out.println(out[arr[i][1]] - out[arr[i][0]-1]);
    }
  }

  public static void main(String[] args) {

    Main obj = new Main();
    int arr[][] = {{7,8},{52,80},{57,64}, {74,78}};

    obj.countNumbers(arr);

  }
}
