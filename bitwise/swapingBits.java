// Reverse bits of an 32 bit unsigned integer

class Main {

  public static long reverse(long A) {
	    long rev = 0;

	    for (int i = 0; i < 32; i++) {
	        rev <<= 1;
	        if ((A & (1 << i)) != 0)
	            rev |= 1;
	    }

	    return rev;

	}

	// public static long reverse(long a) {
  //
	//     long rev1 = (a & 0xffff0000) >> 16;
	//     long rev2 = (a & 0x0000ffff) << 16;
	//    // long temp = 0L;
  //   //     for(int i=31;i>=15;i--){
  //
  //   //         temp +=  (a & 1) << i;
  //   //     }
  //
  //       return ( rev1 | rev2);
	// }

  public static void main(String[] args) {

    System.out.println(reverse(3));
  }
}
