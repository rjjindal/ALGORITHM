// You are given two positive numbers A and B. You need to find the maximum valued integer X such that:
//
//     X divides A i.e. A % X = 0
//     X and B are co-prime i.e. gcd(X, B) = 1

class Main{

  public int cpFact(int A, int B) {

      int c= A;
       while(getGcd(A,B)!=1){
            A = A/getGcd(A,B);
       }

       return(getGcd(c,B) == 1? c : A );
   }

   int getGcd(int a, int b){
       if(b==0)
           return(a);
       else
           return(getGcd(b, a%b));
   }

  public static void main(String[] args) {

    Main obj = new Main();
    System.out.println(obj.cpFact(30,12));
  }
}
