class Main{

  private final static int SIZE = 5;
  int top = -1;
  int[] stack = new int[10];

  public void push(int e){
    if(top == SIZE){
      System.out.println("Overflow");
    }
    else{
      top++;
      stack[top] = e;
    }
  }

  public int pop(){
    if(top == -1){
      System.out.println("Underflow");
      return(-1);
    }
    else {
      top--;
      return(1);
    }
  }

  public void print(){
    for(int i=0;i<=top;i++){
      System.out.println("stack[" + i + "]:" + stack[i]);
    }
  }

  public static void main(String[] args) {
    Main obj = new Main();

    obj.push(3);
    obj.push(2);
    obj.push(1);
    obj.print();
    obj.pop();
    obj.print();

  }
}
