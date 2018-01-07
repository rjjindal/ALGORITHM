import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-->0){
      int n1 = in.nextInt();
      int nums[] = new int[n1];

      for(int i=0;i<n1;i++){
        nums[i] = in.nextInt();
      }

      int maxOne = 0;
  		int maxTwo = 0;
  		for(int n:nums){
  			if(maxOne < n){
  				maxTwo = maxOne;
  				maxOne =n;
  			} else if(maxTwo < n){
  				maxTwo = n;
  			}
  		}

      int frqMaxTwo =0;
      int frqMaxOne =0;
      for(int n:nums){
        if(n == maxOne)
          frqMaxOne++;
        else if(n == maxTwo)
          frqMaxTwo++;
      }
      float res = 0;
      if(frqMaxOne>1){

        res = (float)(frqMaxOne*(frqMaxOne-1))/(n1*(n1-1)) ;
        System.out.println(res);
      }else{
        res = (float)(frqMaxTwo)/(n1*(n1-1)/2) ;
        System.out.println(res);
      }
    }
  }
}
