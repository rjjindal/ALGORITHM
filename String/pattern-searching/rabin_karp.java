import java.util.*;

class Main{

  int prime = 101;

  int getPatternIndex(char txt[], char patt[]){

    int n = txt.length;
    int m = patt.length;
    long pHash = createHash(patt,0, m-1);
    long tHash = createHash(txt,0, m-1);

    for(int i=0;i<=n-m; i++){
      if(pHash==tHash){
        if (checkEqual(txt, i, i+m-1, patt, 0, m-1)) {
          return(i);
        }
      }else{
        tHash = createNextHash(txt, i, i+m-1, m,tHash);
      }
    }
    return(-1);
  }

  boolean checkEqual(char txt[], int s,int e, char patt[], int start, int end){
    boolean isEqual = true;
    for(int i=0;i<=end; i++){
      if(txt[i+s]!=patt[i]){
        isEqual = false;
        return(isEqual);
      }
    }
    return(isEqual);
  }

  long createNextHash(char txt[], int old, int end, int pattLen, long oldHash){
    long newHash = oldHash - txt[old];
    newHash = newHash/prime;
    newHash = newHash + (long)(txt[end+1]*Math.pow(prime,pattLen-1));
    return(newHash);
  }

  long createHash(char txt[], int s, int e){
    long hashVal = 0;
    for(int i=s;i<=e; i++){
      hashVal += txt[i]*Math.pow(prime,i);
    }
    return(hashVal);
  }

  public static void main(String[] args) {
    Main obj = new Main();
    String txt = "rishabhjindal";
    String patt = "jindal";
    System.out.println(obj.getPatternIndex(txt.toCharArray(), patt.toCharArray()));
  }
}
