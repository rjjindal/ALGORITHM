class Main{

  int id;
  String name;
  static String college="MSIT";

  Main(){

  }

  Main(int id, String name){
    this.id = id;
    this.name = name;
  }

  void display(){
    System.out.println("id:"+id+ " name:" + name + " college:" + college);
  }

  public static void main(String[] args) {

    Main obj = new Main(2,"Rishabh");

    obj.display();
  }
}
