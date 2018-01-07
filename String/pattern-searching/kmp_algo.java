import java.util.*;
class Main{

  public static int[] createLps(char pat[], int n){

    int lps[] = new int[n];
    lps[0] = 0;
    int index=0;
    for(int i=1;i<n;){
      if(pat[index]==pat[i]){
        lps[i] = index+1;
        index++;
        i++;
      }else{
        if(index!=0){
          index = lps[index-1];
        }else{
          lps[i] = 0;
          i++;
        }
      }
    }
    return(lps);
  }

  public static boolean kmp(char text[], char patt[]){

    int lps[] = Main.createLps(patt, patt.length);

    int i=0,j = 0;

    while( i < text.length && j < patt.length){
      if(text[i]==patt[j]){
        i++;
        j++;
      }else{
        if(j==0)
          i++;
        else
          j = lps[j-1];
      }
    }

    if(j==patt.length){
      return(true);
    }
    return(false);
  }

  public static void main(String[] args) {

    String str = "rishabhjindal";
    String subString = "jindal";
    boolean result = Main.kmp(str.toCharArray(), subString.toCharArray());
    System.out.println(result);
  }
}
