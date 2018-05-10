import java.util.*;

class Main{



  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int t = in.nextInt();

    HashMap<Interger, String> map = new HashMap<>();
    while(t-->0){

      int n = in.nextInt();
      int l = in .nextInt();

      char str[][] = new char[n][l];
      for(int i=0;i<n;i++){

        String t = in.next();
        str[i] = t.toCharArray();
        map.put(i, t);
      }

      for(int i=0;i<n;i++){

        for(int j=0;i<n-1;j++){

          if(str[j][i]!=str[j+1][i]){
            char temp = str[j][i];
            str[j][i] = str[j+1][i];
            str[j+1][i] = temp;
          }

          for(int i=0;i<n;i++){
            String s1 = new String(str)
            res = map.containsValue()
          }
          if(res!=null){
            System.out.println(res);
            break;
          }
        }
      }

      for(int )
    }
  }
}
