
// Reverse an array without affecting special characters
// Input:   str = "a,b$c"
// Output:  str = "c,b$a"
// Note that $ and , are not moved anywhere.
// Only subsequence "abc" is reversed
//
// Input:   str = "Ab,c,de!$"
// Output:  str = "ed,c,bA!$"

class Main{

  static String revString(String strr){

    int l=0;
    int r = strr.length();
    char temp;

    StringBuilder str = new StringBuilder(strr);

    for(int i=l,j=r-1;i<j;){
      if(!Character.isLetterOrDigit(str.charAt(i)))
        i++;
      else if (!Character.isLetterOrDigit(str.charAt(j))) {
        j--;
      }else{
        temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j, temp);
        i++;
        j--;
      }
    }
    return(str.toString());
  }

  public static void main(String[] args) {
    System.out.println(Main.revString("Ab,c,de!$"));
  }
}
