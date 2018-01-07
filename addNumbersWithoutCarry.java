import java.util.Stack;

class Solution{

  public static int add(int a, int b){
    Stack st = new Stack();

    int result = 0;
    int cnt = 0;
    int temp=0;
    while( a!=0 && b!=0){
      temp = a%10 + b%10;
      temp = (temp) >9? temp%10 : temp;

      st.push(new Integer(temp));
      a = a/10;
      b = b/10;
      cnt++;
    }

    while(!st.empty()){
      result= result*10 + (Integer)st.pop();
    }

    // fill up the part of integer left
    if(a!=0){
      result = (int)Math.pow(10,cnt)*a + result;
    }
    if(b!=0){
      result = (int)Math.pow(10,cnt)*a + result;
    }

    return(result);

  }


  public static void main(String[] args) {
    System.out.println(Solution.add(1646,2089));
  }
}
