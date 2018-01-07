import java.util.ArrayList;
import java.util.Arrays;

class Main{


  public static void main(String[] args) {


    System.out.println(sieve(30));
  }

  public static ArrayList<Integer> sieve(int a){
    ArrayList<Integer> result = new ArrayList<Integer>();
    Boolean mat[] = new Boolean[1000];

    Arrays.fill(mat, Boolean.TRUE);

    for(int i=2;i*i<=a;i++){

      if(mat[i]){
      for(int j=i*2; j<=a; j=j+i){
        mat[j] = false ;
      }
      }
    }

    for(int i=2;i<=a;i++){
      if(mat[i])
        result.add(i);
    }

    return result;

  }
}


// Sieve of Erastothenes
// Generate isPrime List less equal than N
// vector<bool> isPrime(N + 1, true);
// isPrime[0] = false;
// isPrime[1] = false;
        // for(int i = 2; i <= N; i++) {
        //     if (!isPrime[i]) continue;
        //     if (i > N / i) break;
        //     for (int j = i * i; j <= N; j += i) isPrime[j] = false;
        // }
