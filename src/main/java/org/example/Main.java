package org.example;

    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    class Main {

        public static void main(String[] args) {
            int[] values = {77, 4, 6, 313, 29, 88};

            Node head = null;
            for (int i = values.length - 1; i >= 0; i--) {
                head = new Node(values[i], head);
            }

            head = reverse(head);
            printList(head);
        }
        public static void printList(Node head)
        {
            Node node = head;
            while (node != null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        public static Node reverse(Node head)
        {
            Node previous = null;
            Node current = head;

            while (current != null)
            {
                Node next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            return previous;
        }
    }

