// WAP to print all the permutations of a String( chars must be non repeating)

// having some problem with
// o/p
// eivw
// view
// eivw
// eiwv
// eviw
// evwi
// ewvi
// ewiv
// ievw
// iewv
// ivew
// ivwe
// iwve
// iwev
// view
// viwe
// veiw
// vewi
// vwei
// vwie
// wive
// wiev
// wvie
// wvei
// wevi
// weiv
// -16


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Main{

  ArrayList<String> sol = new ArrayList<String>();

  void permute(char[] str, int l, int r){


    char temp;

    if(l==r){
      sol.add(String.valueOf(str));
      System.out.println(String.valueOf(str));
     }
    else{

        //SWAP
        for(int i=l; i<=r ; i++){
          temp = str[i];
          str[i] = str[l];
          str[l] = temp;

          permute(str, l+1, r);

          //SWAP
          temp = str[i];
          str[i] = str[l];
          str[l] = temp;

        }
    }

  }
  int getRank(char[] str, int l, int r, String var){
    permute(str, l, r);
    return(Collections.binarySearch(sol,var)+1);
  }


  public static void main(String[] args) {

    String var = "view";
    Main obj = new Main();

    char ch[] = var.toCharArray();
    Arrays.sort(ch);
    System.out.println(String.valueOf(ch));
    System.out.println(var);
    System.out.println(obj.getRank(ch, 0, var.length()-1, var));
  }
}
