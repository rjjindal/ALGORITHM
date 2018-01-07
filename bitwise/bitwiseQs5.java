class Main{

	public static int numSetBits(long a) {
	    int count = 0;
	    while(a!=0){
	        count += a & 1;
	        a = a >> 1;
	    }
	    return(count);
	}

  public static void main(String[] args) {

    System.out.println(Main.numSetBits(3));
  }
}
