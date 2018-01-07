class Main{
  public static void main(String[] args) {
    String str = "xxforxx xx for xx";

    String str1[] = str.subString("xx");
    for(String s: str1){
      System.out.println(s);
    }

  }
}
