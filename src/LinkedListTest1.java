public class LinkedListTest1 {
    
    
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void printNode(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void printMiddleNode(){
        Node fastNode = head;
        Node slowNode = head;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        System.out.println("Middle Node : "+ slowNode.data);
    }

    public boolean checkCycle() {
        Node fastNode = head;
        Node slowNode = head;
        boolean result = false;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(fastNode == slowNode)
            {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListTest1 obj = new LinkedListTest1();
        obj.addElement(10);
        obj.addElement(20);
        obj.addElement(30);
        obj.addElement(40);
        obj.addElement(50);
        obj.addElement(60);
        obj.printNode();
        obj.printMiddleNode();
        //obj.head.next.next = obj.head.next;
        System.out.println("Is Cyclic : "+obj.checkCycle());
    }
}
