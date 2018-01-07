import java.util.*;
class Main{

  static String naiveSearch(String str, String patt, String replace){

    int j=0;
    for(int i=0;i<=str.length()-patt.length();i++){
      int flag = 0;
      for(j=0;j<patt.length(); j++){

        if(str.charAt(i+j)!= patt.charAt(j)){
          flag = 1;
        }
      }
      if(flag == 0){
        str = str.substring(0,i)+replace +str.substring(i+j, str.length());
      }
    }
    return(str);
  }

  public static void main(String[] args) {

    String str = "rishabh jindal jindal";
    String patt = "jindal";
    String replace = "Gupta";
    System.out.println(Main.naiveSearch(str, patt, replace));
  }
}
