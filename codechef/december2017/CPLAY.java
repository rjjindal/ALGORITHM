import java.util.*;
class Main{

  public static void main(String[] args) {
    String s;
    Scanner in = new Scanner(System.in);

    while(in.hasNext()){
      s = in.next();
      int m,p1=0,p2=0;
      String a =new String();
      String b =new String();
      for(int i=0;i<20;i+=2){
        a = a+s.charAt(i);
      }

      for(int i=1; i<20 ; i+=2){
        b = b+s.charAt(i);
      }

      int flag = 0;
      int i=0,j=0;
      for(i=0,j=0;i<5;){
        if(( p1>p2+5-j) || ( p2>p1 + 5 -i)){
          flag = 1;
          break;
        }

        if(a.charAt(i++)=='1'){
          p1++;
        }
        if((p1 > p2+5-j)|| (p2>p1+5-i)){
          flag = 1;
          break;
        }

        if(b.charAt(j++)=='1'){
          p2++;
        }
        if((p1>p2+5-j)||(p2>p1+5-i)){
          flag=1;
          break;
        }
      }

      if(flag==1 && p1!=p2){
          if(p1>p2)
              System.out.print("TEAM-A "+ (i+j) + "\n");
          else
              System.out.print("TEAM-B "+(i+j)+"\n");
      }else{

          for(i=5;i<10;i++){
            if(a.charAt(i)=='1' && b.charAt(i)=='0'){
              System.out.print("TEAM-A "+(2*i+2)+"\n");
              break;
            }

            if(a.charAt(i)=='0' && b.charAt(i)=='1'){
              System.out.print("TEAM-B "+(2*i+2)+"\n");
              break;
            }
          }
          if(i==10){
            System.out.print("TIE\n");
          }
      }
    }
  }
}
