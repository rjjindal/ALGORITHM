// having problem with lis loop structure
// https://www.geeksforgeeks.org/dynamic-programming-set-21-box-stacking-problem/

import java.util.*;

class Box implements Comparable<Box>{

  int l, b, h, area;

  Box(){

  }

  Box(int l, int b, int h){
    this.l = l;
    this.b = b;
    this.h = h;
  }

  public int compareTo(Box b){
    return(b.area - this.area);
  }
}

class Main{

  public static int boxStack(Box[] arr, int n){

    Box lis[] = new Box[n*3];

    int sol[] = new int[n*3];



    for(int i=0;i<n;i++){

      Box obj = arr[i];

      lis[3*i] = new Box(Main.max(obj.b, obj.h), Main.min(obj.b, obj.h), obj.l);

      lis[3*i + 1] = new Box(Main.max(obj.l, obj.h), Main.min(obj.l, obj.h), obj.b);

      lis[3*i + 2] = new Box(Main.max(obj.l, obj.b), Main.min(obj.l, obj.b), obj.h);
    }

    for(int i=0;i<3*n;i++)
      lis[i].area = lis[i].l * lis[i].b;


    Arrays.sort(lis);

    // for(int i=0;i<lis.length;i++){
    //   System.out.println(lis[i].area);
    // }


    for(int i=0;i<3*n;i++)
      sol[i] = lis[i].h;

    for(int i=0;i<lis.length;i++){
      System.out.println(lis[i].h);
    }

    for(int i=1; i<3*n;i++){
      for(int j=0; j<i ; j++){

        if(lis[i].h > lis[j].h && lis[i].l < lis[j].l && lis[i].b < lis[j].b && sol[i] < sol[j] + lis[i].h)
          sol[i] = sol[j] + lis[i].h;
      }
    }

    int res = -1;
    for( int i=0; i<n*3;i++){
      if(res < sol[i]){
        res = sol[i];
      }
    }

    return(res);
  }

  static int max(int a, int b){
    return( a > b? a: b);
  }

  static int min(int a, int b){
    return( a < b? a: b);
  }


  public static void main(String[] args) {

    Box[] arr = new Box[3];
       arr[0] = new Box(1, 2, 3);
       arr[1] = new Box(4, 5, 6);
       arr[2] = new Box(10, 12, 32);

    // Box arr[] = new Box[] { new Box(1,2,3), new Box(4,5,6), new Box(10,12,32)};

    System.out.println(Main.boxStack(arr, arr.length));
  }
}
