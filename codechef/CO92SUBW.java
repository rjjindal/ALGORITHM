import java.util.*;

class Main{

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while(t-->0){

      int x = in.nextInt();
      int count = 0, i = 0, temp, flag=0;

      for(i=1; x!=0;i++){

        temp = x - i;
        if(temp>=0){
          x = temp;
          count++;
        }else{
            flag = 1;
          break;
        }

      }
      if(flag==1){
          if(x<=(i-x))
            count += x;
          else
            count += i - x + 1;
      }
      System.out.println(count);
    }
  }
}
