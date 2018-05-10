import java.util.*;

class Main{

  Node head;





  // detect and remove loop floyd cycle algortihm
  void detectAndRemoveLoop2(){

    Node slow = head , fast = head;
    // boolean isLoop = false;

    while(slow!=null && fast!=null && fast.next!=null){

      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast){
        System.out.println("Found Loop");
        removeLoop2(slow);
        break;
      }
    }
  }

  // using k (floyd - cycle)
  void removeLoop2(Node loopNode){

    int k=1;
    Node ptr1 = loopNode, ptr2 = loopNode;
    while(ptr2.next!=ptr1){
        k++;
        ptr2 = ptr2.next;
    }
    ptr1 = head;
    ptr2 = head;
    while(k-->0){
      ptr2 = ptr2.next;
    }

    while(ptr1!= ptr2){
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
    }
    while(ptr2.next!= ptr1){
      ptr2 = ptr2.next;
    }
    ptr2.next = null;
    // System.out.println(k);
  }

  void removeLoop(Node loopNode){

    Node ptr1 = head, ptr2;

    while(true){

      ptr2 = loopNode;
      while(ptr2.next!=loopNode && ptr2.next!= ptr1){
        ptr2 = ptr2.next;
      }

      if(ptr2.next == ptr1){
        ptr2.next = null;
        break;
      }
      ptr1 = ptr1.next;
    }
  }

  // using hashing method
  boolean detectAndRemoveLoop(){

    HashMap<Integer, Node> map = new HashMap<>();
    boolean isPresent = false;
    int count = 0;
    Node temp = head;

    while(temp!=null && temp.next!=null){

      isPresent = map.containsValue(temp.next);
      map.put(count++, temp);

      if(isPresent){
        temp.next = null;
        return(isPresent);
      }else{
        temp = temp.next;
      }
    }
    return(isPresent);
  }



  // Function to print the linked list
  void printList() {

    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {

    Main list = new Main();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		list.head.next.next.next.next.next = list.head.next.next;
		list.detectAndRemoveLoop2();

    System.out.println("Linked List after removing loop : ");
		list.printList();
  }
}
