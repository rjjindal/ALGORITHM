import java.util.*;

class Main{

  public static void main(String[] args) {


    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    int res = 0;
    while(t-->0){

      char[] str = in.nextLine().toCharArray();

      int flag = 0;
      for(int i=0;i<str.length-1;i++){

        if((str[i]=='c' && str[i+1]=='h') || (str[i]=='h' && str[i+1]=='e') || (str[i]=='e' && str[i+1]=='f')){
          flag = 1;
        }
      }

      if(flag==1){
        res++;
      }

    }

    System.out.println(res);
  }
}
