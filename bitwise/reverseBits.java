// Reverse bits of an 32 bit unsigned integer
// x = 3,

//           00000000000000000000000000000011 
// =>        11000000000000000000000000000000



class Main{
  public static int revBits(int n){
    int low = 1;
    int high = 0x10000000;
    int temp1 =0;
    int temp2 =0;
    int i=1;
    while(i<=16){

      temp1 = n & low;
      temp2 = n & high;
      if((temp2^temp1 )!=0){
        n = (n^high) | (n^low);
        high = high >>i;
        low = low <<i;
      }
      i++;
    }
    return(n);
  }
  public static void main(String[] args) {

    System.out.println(Main.revBits(3));
  }
}
