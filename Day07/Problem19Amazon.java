// problem: Delete N nodes after M nodes of a linked list

class Solution {

    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node current = head;

        while (current != null) {
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                break;
            }

            Node temp = current.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            current.next = temp;

            current = temp;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}