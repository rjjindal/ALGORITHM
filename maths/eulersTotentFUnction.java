class Main{

  public static int gcd(int a,int b){

    if(b==0)
      return(a);
    else
      return(gcd(b,a%b));
  }

  public static int eulersFunction(int n){

    int count = 0;

    for(int i=1;i<n;i++){
      if(gcd(i,n)==1){
        count++;
      }
    }

    return(count);
  }

  public static void main(String[] args) {

    System.out.println(Main.eulersFunction(5));
  }
}
