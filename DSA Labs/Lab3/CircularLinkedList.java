public class CircularLinkedList {
    public class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
 static   Node head, tail;
    int size=0;

////////// insert first/////////////
    public void insertAtBeginning(int data){
        Node n=new Node(data);
        if(head==null){
            head =tail=n;
            size++;
            return;
        }
        n.next=head;
        head=n;
        tail.next=head;
        size++;
    } /////insert first
    public void insertnodeatfirst(Node h){
        if(head==null){
            head=h;
            return;
        }
        h.next=head;
        head=h;
    }
// insert nod with data

    public Node insertNodeWithdata(int data, Node h){
        Node n=new Node(data);
        if(h==null){
            h=n;
            return h;
        }
        Node temp=h;
        while(temp.next!=h){
            temp=temp.next;
        }
        temp.next=n;
        n.next=h;
        return h;
    }
//insert noda at last    
    public void insertNodeAtLast(Node h)
    {
        if(head==null){
            head=tail=h;
            h.next=head;return;
        }
       tail.next=h;
       h.next=head;
       tail=h;
    }
    


    // ////////// insert end/////////////
 public void insertAtEnd(int data){
    Node n=new Node(data);
    if(head==null){
        head=tail=n;
        size++;
        return;
    }
    tail.next=n;
    tail=n;
    tail.next=head;
    size++;
}
//////////////// ad at middle
public void addAtMiddle(int index, int data){
    Node n=new Node(data);
    if(index==1){
        n.next=head;
        head=n;
        return;
    }
    Node temp=head;
    int k=1;
    while(k<index-1){
        temp=temp.next;
        k++;
    }
    n.next=temp.next;
    temp.next=n;
}
  ///////////////// remove first ///////////////////
  public void removeFirst(){
    if(head==null){
        return;
    }
    head=head.next;
    tail.next=head;
    size--;
  }
    ///////////////// remove last ///////////////////

    public void removeLast(){
      if(head==null){
            return;
        }
    Node n=head;
    while(n.next!=tail) {
        n=n.next;
    }  
    tail=n;
    tail.next=head;
    size--;
    }


///////// detect a cycle//////////\
public boolean detectCycle(){
    if(head==null){
        System.out.println("no node");
        return false;
    }
    Node stepOne=head;
    Node stepTwo=head;
    while(stepTwo!=null && stepTwo.next!=null){
        stepOne=stepOne.next;
        stepTwo=stepTwo.next.next;
        if(stepOne==stepTwo){
            return true;
        }
        
    }
    return false;
}
///////////////// print ///////////////////
  public void printAll( ){
     if(head==null){
         System.out.println(" no node");
         return;
     }
 
     Node n=head;
     while(n!=tail){
         System.out.print(n.data+" ");
         n=n.next;
     }
     System.out.print(tail.data);
     System.out.println();
  }
  public static void main(String[] args) {
    CircularLinkedList c=new CircularLinkedList();
    c.insertAtBeginning(3);
    c.insertAtBeginning(4);
    c.insertAtBeginning(5);
    c.insertAtEnd(5);
    c.insertAtEnd(6);
    c.printAll();
    System.out.println("insert at middle");
    c.addAtMiddle(3, 9);
    c.printAll();
    c.removeFirst();
    System.out.println("remove first");
    c.printAll();
    Node p=null;
    p=c.insertNodeWithdata(25, p);
    c.insertNodeAtLast(p);
    System.out.println("add node at last");
    c.printAll();
    Node h=null;
    h= c.insertNodeWithdata(33, h);
    c.insertnodeatfirst(h);
    System.out.println("add node at first");
    c.printAll();
    c.removeLast();
    System.out.println("remove last");
    c.printAll();
    System.out.println(c.detectCycle());

  }
    
}
