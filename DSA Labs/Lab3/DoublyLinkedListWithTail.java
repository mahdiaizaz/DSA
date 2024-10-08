public class DoublyLinkedListWithTail {
    public class Node {
        int data;
        Node next;
        Node prew;
        Node (int data){
            this.data=data;
            this.next=null;
            this.prew=null;
        }
    }
    static  Node head;
    static Node tail;
    int size=0;

// insert at begining
    public void insertAtBeginning(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
            size++;
            return;
        }
        n.next=head;
        head.prew=n;
        head=n;
        size++;
    }
// circulaar
    public void makeCircular(){
        if(head==null){
           System.out.println("no node is here");
            return;
        }
        Node k=head;
        while(k.next!=null){
            k=k.next;
        }
        k.next=head;       

    }
// adding at beginign node////////////////
    /////////////////////////////////////////
    public void insertAtBeginning(Node node){
        if(head==null){
        head=tail=node;
        size++;
        return;
    }
    node.next=head;
    head.prew=node;
    head=node;
    size++;
}

// insert at end
    public void insertAtEnd(int data)
    {
    Node n=new Node(data);
    if(head==null){
        head=tail=n;
        size++;
        return;
    }
    n.prew=tail;
    tail.next=n;
    tail=n;
    size++;
}

// Add node in end of linkedlist, node as parameter 
  ////////////////
    /////////////////////////////////////////
  public void insertAtEnd(Node node){
    if(head==null){
        head=tail=node;
        size++;
        return;
    }
    node.prew=tail;
    tail.next=node;
    tail=node;size++;
}

 public void printAll(Node hea){
    if(hea==null){
        System.out.println(" no node");
        return;
    }
    else{Node n=hea;
    while(n!=null){
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
    }
 }
 /////print
 public void printAll( ){
    if(head==null){
        System.out.println(" no node");
        return;
    }

    Node n=head;
    while(n!=null){
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
 }
// insert node with data
    public Node insertAtLast(int data, Node n){
    Node n1=new Node(data);
        if(n==null){ n=n1;
                    size++;
                }
        else {Node k=n;
    while(k.next!=null){
        k=k.next;
    }
    k.next=n1;
    size++;
    }
    return n;
    }

// insert data in node in first
 public Node insertAtFirst(int data, Node n){
    Node n1=new Node(data);
 if(n==null){ n=n1;
    size++;
    return n;

}
n1.next=n;
n=n1;
n.prew=null;
size++;
return n;


 }
 ///////remove first/////////
 public void removeFirst(){
    if(size==1){
        head=null;
    }
    head=head.next;
    head.prew=null;size--;
 }

  ///////remove last/////////
  public void removeLast(){
    if(size==1){
        head=null;
        size--;
        return;
    }
   tail=tail.prew;
   tail.next=null;
   size--;
}
////////// duplicate list
  public Node duplicate(){
    Node dupli=null;
    if(head==null){
        System.out.println("no node for duplicate");
    }
    else{
        Node n=head;
        while(n!=null){
            dupli=insertAtLast(n.data, dupli);
            n=n.next;
        }
        System.out.println();
    }
    return dupli;
  }
/////// reverse duplicate
  public Node reverseduplicate(Node hd){
    Node dupli=null;
    if(hd==null){
        System.out.println("no node for duplicate");
    }
    else{
        Node n=hd;
        while(n!=null){
            dupli=insertAtFirst(n.data, dupli);
            n=n.next;
        }
        System.out.println();
    }
    return dupli;
  }

 //////isEmpty////////
 public boolean isEmpty(){
    return head==null;
 }
public static void main(String[] args) {
    DoublyLinkedListWithTail d=new DoublyLinkedListWithTail();

    d.insertAtEnd(5);
    d.insertAtEnd(3);
    d.insertAtEnd(2);
    d.insertAtEnd(1);
    d.insertAtBeginning(6);
    System.out.println("printed list");
    d.printAll();
    Node k=null;
    k=d.insertAtFirst(7, k);
    System.out.println(k.data);
    d.printAll();
    System.out.println("add a node in list in first");
    d.insertAtBeginning(k);
    d.printAll();
     Node k2=null;
    k2=d.insertAtLast(99, k2);
    System.out.println(k2.data);
    d.printAll();
    System.out.println("add a node in list in last");
    d.insertAtEnd(k2);
    d.printAll();
    d.removeLast();
    System.out.println("remove last");
    d.printAll();
    Node dup=null;
    dup=d.duplicate();
    System.out.println("duplicate list");
    d.printAll(dup);
    Node revers=null;
    revers=d.reverseduplicate(dup);
    System.out.println("reverse ");
    d.printAll(revers);


    


  }




    
 }
