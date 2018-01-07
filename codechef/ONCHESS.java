import java.util.*;
class Player{
  public int r;
  public int min;
  public int max;
  public int time;
  public String isRated;
  public String color;
  public int flag = 0;
}
class Ideone{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-->0){

      int n = in.nextInt();
      ArrayList<Player> list = new ArrayList();
      for(int j=0;j<n;j++){

        Player p = new Player();

        p.r = in.nextInt();
        p.min = in.nextInt();
        p.max = in.nextInt();
        p.time = in.nextInt();
        p.isRated = in.next();
        p.color = in.next();

        // list.add(p);
        int flag = 0;
        int i=0;
        for(i=0;i<list.size();i++){

	if(list.get(i).flag==0){
          if(list.get(i).color.equals("random") && p.color.equals("random") || list.get(i).color.equals("black") && p.color.equals("white") || list.get(i).color.equals("white") && p.color.equals("black") ){

            if (list.get(i).isRated.equals("rated") && p.isRated.equals("rated") || list.get(i).isRated.equals("unrated") && p.isRated.equals("unrated")) {
              if (list.get(i).time == p.time) {

                if ((p.r >= list.get(i).min && p.r <= list.get(i).max ) && ( list.get(i).r >= p.min && list.get(i).r <= p.max)) {
                  flag = 1;
                  list.get(i).flag=1;
                  break;
                }

              }

            }
          }
	}
          }

          list.add(p);
          if(flag==0){
            System.out.println("wait");
          }else{
            System.out.println(i+1);

          }

      }

    }
  }
}
