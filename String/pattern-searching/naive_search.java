import java.util.*;
class Main{

  static ArrayList<Integer> naiveSearch(String str, String patt){

    ArrayList<Integer> sol = new ArrayList<Integer>();
    for(int i=0;i<=str.length()-patt.length();i++){
      int flag = 0;
      for(int j=0;j<patt.length(); j++){

        if(str.charAt(i+j)!= patt.charAt(j)){
          flag = 1;
        }
      }
      if(flag == 0){
        sol.add(i);
      }
    }

    return(sol);
  }

  public static void main(String[] args) {

    String str = "rishabh jindal jindal";
    String patt = "jindal";

    ArrayList<Integer> sol = new ArrayList(Main.naiveSearch(str, patt));

    for(Integer n: sol){
      System.out.println(n);
    }
  }
}
