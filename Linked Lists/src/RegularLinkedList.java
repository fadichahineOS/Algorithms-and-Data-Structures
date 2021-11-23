public class RegularLinkedList {

  static class LinkedList {

    Node head;

    class Node {

      int data;
      Node next;

      Node(int d) {
        data = d;
        next = null;
      }
    }

    public void addToFront(int newData){
      Node newNode = new Node(newData);

      newNode.next = head;

      head = newNode;

    }

  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    llist.addToFront(6);

    System.out.println(llist.head.data);

  }
}
