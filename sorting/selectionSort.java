class Main{

  int arr[] = {4,3,9,6,7};

  void sort(){

    for(int i=0 ;i<arr.length ;i++){

      int tempMax = arr[i];
      int index = i;
      for(int j=i+1 ;j<arr.length ;j++){

        if(tempMax<arr[j]){
          tempMax = arr[j];
          index = j;
        }
      }

      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
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
