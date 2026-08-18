/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
      if(head.next == null) 
          return head;

      Node lastNode = head;

      int l = 1;
      while(lastNode.next != null) 
      {       
          l++;
          lastNode = lastNode.next;
      }
      k=k%l;                
      for(int i=0; i<k; i++) 
      {
          Node curr = head;

          head = curr.next;

          curr.next = null;

          lastNode.next = curr;

          lastNode = curr;
      }

      return head;
    }
}