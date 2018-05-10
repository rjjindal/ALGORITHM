import java.util.*;

class Main{

  boolean isPalindrome(Node head){

    Stack<Integer> s = new Stack<>();
    Node temp = head;

    while(temp!=null){
      s.push(temp.data);
      temp = temp.next;
    }

    Node temp2 = head;
    while(!s.empty()){

      int curr = s.pop();
      System.out.println("n:"+curr);
      if(temp2.data != curr){
        return(false);
      }
      temp2 = temp2.next;
    }
    return(true);
  }

  public static void main(String[] args) {


    LinkedList list = new LinkedList();

    list.insertAtBeg(10);
    list.insertAtBeg(4);
    list.insertAtBeg(4);
    list.insertAtBeg(10);

    Main obj = new Main();

    System.out.println(obj.isPalindrome(list.head));
  }
}
