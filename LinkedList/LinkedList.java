package LinkedList;
class LinkedList{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
        this.data=data;
        this.next=null;
        }
    }
    //add- first, last
    public void addFirst(String data){
        Node new_node=new Node(data);
        if(head == null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }

    public void addLast(String data){
        
    }
    void display(){
        
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
    }
}