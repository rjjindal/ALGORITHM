class Main{

  Node head;

  void sortedInsert(Node new_node)
    {
         Node current;

         /* Special case for head node */
         if (head == null || head.data >= new_node.data)
         {
            new_node.next = head;
            head = new_node;
         }
         else {

            /* Locate the node before point of insertion. */
            current = head;

            while (current.next != null &&
                   current.next.data < new_node.data)
                  current = current.next;

            new_node.next = current.next;
            current.next = new_node;
         }
     }
  void printList()
       {
           Node temp = head;
           while (temp != null)
           {
              System.out.print(temp.data+" ");
              temp = temp.next;
           }
       }


  /* Drier function to test above methods */
 public static void main(String args[])
 {
     Main llist = new Main();
     Node new_node;
     new_node = Node.newNode(5);
     llist.sortedInsert(new_node);
     new_node = Node.newNode(10);
     llist.sortedInsert(new_node);
     new_node = Node.newNode(7);
     llist.sortedInsert(new_node);
     new_node = Node.newNode(3);
     llist.sortedInsert(new_node);
     new_node = Node.newNode(1);
     llist.sortedInsert(new_node);
     new_node = Node.newNode(9);
     llist.sortedInsert(new_node);
     System.out.println("Created Linked List");
     llist.printList();
 }
}
