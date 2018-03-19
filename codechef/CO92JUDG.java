import java.util.*;

class Main{

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0){

          int n = in.nextInt();
          Integer a[] = new Integer[n];
          int sumA = 0;
          int sumB = 0;
          Integer b[] = new Integer[n];

          for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            sumA+=a[i];
          }

          for(int i=0;i<n;i++){
            b[i] = in.nextInt();
            sumB += b[i];
          }

          sumA -= Collections.max(Arrays.asList(a));
          sumB -= Collections.max(Arrays.asList(b));

          if(sumA==sumB){
            System.out.println("Draw");
          }else if(sumA<sumB){
            System.out.println("Alice");
          }else{
            System.out.println("Bob");
          }
        }
  }
}
