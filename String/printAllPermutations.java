// WAP to print all the permutations of a String( chars must be non repeating)

class Main{

  static void permute(char[] str, int l, int r){

    char temp;

    if(l==r)
      System.out.println(str);
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


  public static void main(String[] args) {

    char[] str = {'A','B','C'};
    Main.permute(str, 0, 2);
  }
}
