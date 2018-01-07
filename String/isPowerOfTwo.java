
import java.util.ArrayList;

class Solution{

  public static int power(String a) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    String s[] = a.split("(?<=\\G.........)");
    Integer temp=0;

    for(String str: s){
      list.add(Integer.valueOf(str));
    }

    for(Integer i: list){
      System.out.println(i);
    }

    while(list.get(list.size()-1)>1){

    if(list.get(list.size()-1)%2 ==1 )
      return(0);

    for(int i=0; i< list.size(); i++){



      if(list.get(i)%2!=0 && i!=(list.size()-1)){
        temp =  (int)Math.pow(10, Solution.getLen(list.get(i+1))) + list.get(i+1) ;
        list.set(i+1, temp) ;

      }
      list.set(i,list.get(i)/2) ;
    }
    for(Integer i: list){
      System.out.println(i);
    }
    }
    return(1);
  }

  static int getLen(int num){
    int cnt =0;
    while(num!=0){
      cnt++;
      num = num/10;
    }
    return(cnt);
  }
  public static void main(String[] args) {

    System.out.println(Solution.power("147573952589676412928"));
  }
}
