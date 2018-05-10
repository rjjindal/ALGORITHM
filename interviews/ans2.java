import java.util.*;
class Main{

  public static int[] frequency(String s)
  {
      int[] dict= new int[26];

      Arrays.fill(dict, 0);

      for( int i=0; i < s.length() ; i++){

        if( s.charAt(i)=='(')
        {
          int freq = i+1;
          while( freq< s.length() && s.charAt(freq) !=')')
            freq++;

          if((i-1)>=0 && s.charAt(i-1) =='#')
          {

              dict[ (s.charAt(i-3)-'0') * 10 + (s.charAt(i-2)-'0') -1] += Integer.parseInt(s.substring( i+1 , freq ))  -1;

          }else if((i-1)>=0){

            dict[ s.charAt(i-1)-'0' - 1] += Integer.parseInt(s.substring( i+1 , freq ))  - 1;
          }

          i = freq;

        }else if( (i+2) < s.length() && s.charAt(i+2) =='#' ){

              dict[ (s.charAt(i)-'0') * 10 + (s.charAt(i+1)-'0') - 1]++;
              i += 2;

        }else{
          dict[ s.charAt(i)-'0' - 1]++;
        }
      }
      return dict;
    }

    public static void main(String[] args)
    {
        // String s="23#(2)24#25#26#23#(3)";
        // String s="1(2)23(3)";
        String s="1(1)2(2)3(3)4(4)5(5)6(6)7(7)8(8)9(9)10#";
        // String s="1(1)2(2)3(3)4(4)5(5)6(6)7(7)8(8)9(9)10#(10)11#(11)12#(12)13#(13)14#(14)";
        int[] dict = frequency(s);
        for(int i=0;i<dict.length;i++)
        {
            System.out.print(dict[i] + " ");
        }
        System.out.println();
    }
}
