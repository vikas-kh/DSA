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
        Node new_node=new Node(data);
        if(head == null){
            head=new_node;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        } 
        currNode.next=new_node;
    }
    public void display(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        } 
        System.out.print("null");
    }
    //delete fisrt,last
    public void deleteFirst(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        //only one element
        if(head.next==null){
            head=null;
            return;
        }
        //has many nodes
        head=head.next;
    }

    puvlic void public void deleteLast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("vikas");
        list.deleteFirst();
         list.deleteFirst();
        list.display();
    }
}