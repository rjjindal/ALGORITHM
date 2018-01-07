import java.util.Scanner;

class Main{

  public static void main(String[] args) {

      // String str = "A.ABB.BAA";
       //Scanner
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();


      while(t>0){
      String str = s.next();


      int aCount=0, bCount=0;
      char prev = str.charAt(0);
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='A'){
          aCount++;
        }else if (str.charAt(i)=='B') {
          bCount++;
        }else{
          if(prev=='A'){
            aCount++;

          }else if (prev=='B') {
            bCount++;

          }
        }
        prev = str.charAt(i);
      }

       System.out.println(aCount+" "+bCount);
       t--;
     }
  }
}
