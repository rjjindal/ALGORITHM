class Main{

  int arr[] = {4,3,9,6,7};

  void sort(){

    for(int i=1 ;i<arr.length ;i++){
      int temp = arr[i];
      int j = i-1;

      while( j>=0 && temp>arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }

  }

  void print(){
    for(int i =0;i<arr.length ;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {

    Main obj = new Main();
    obj.sort();
    obj.print();
  }
}
