class Main{

  int id;
  String name;

  Main(){}

  Main(int id, String name){
    this.id = id;
    this.name =name;
  }

  void display(){
    System.out.println("Id:"+id+" name:"+name);
  }

  public static void main(String[] args) {

    Main obj = new Main(1,"rishabh");
    obj.display();
  }
}
