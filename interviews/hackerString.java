import java.util.*;
class Main{

  public static int[] frequency(String s)
  {
      int[] arr= new int[27];

      Arrays.fill(arr, 0);

      for( int i=0; i < s.length() ; i++){

        if( s.charAt(i)=='(')
        {
          int j = i+1;
          while( j< s.length() && s.charAt(j) !=')')
            j++;

          if((i-1)>=0 && s.charAt(i-1) =='#')
          {

              arr[ (s.charAt(i-3)-'0') * 10 + (s.charAt(i-2)-'0') ] += Integer.parseInt(s.substring( i+1 , j ))  -1;

          }else if((i-1)>=0){

            arr[ s.charAt(i-1)-'0'] += Integer.parseInt(s.substring( i+1 , j ))  - 1;
          }

          i = j;

        }else if( (i+2) < s.length() && s.charAt(i+2) =='#' ){

              arr[ (s.charAt(i)-'0') * 10 + (s.charAt(i+1)-'0') ]++;
              i += 2;

        }else{
          arr[ s.charAt(i)-'0']++;
        }
      }
      return arr;
    }

    public static void main(String[] args)
    {
        String s="23#(2)24#25#26#23#(3)";
        // String s="1(2)23(3)";
        int[] arr = frequency(s);
        for(int i=1;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
