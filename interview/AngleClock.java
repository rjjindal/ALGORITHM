class Main{

  static int angleCLock(int h, int m){

    h = h % 12;
    m = m % 60;

    int hangle = (int)(h * 30 + m * 0.5);
    int hminute = 6 * m;

    int angle = Math.abs(hangle- hminute);

    angle = Math.min(360-angle, angle);
    return(angle);
   }

  public static void main(String[] args) {

    System.out.println(Main.angleCLock(9, 60)+" degree");
    System.out.println(Main.angleCLock(3, 30)+" degree");
  }
}
