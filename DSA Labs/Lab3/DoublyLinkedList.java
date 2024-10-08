 public class DoublyLinkedList {
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
     int size=0;

    // insert at begining
    public void insertAtBeginning(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
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
        head=node;
        size++;
        return;
    }
    node.next=head;
    head.prew=node;
    head=node;
    size++;
}
 // insert at end
 public void insertAtEnd(int data){
    Node n=new Node(data);
    if(head==null){
        head=n;
        size++;

        return;
    }
    Node k=head;
    while(k.next!=null){
        k=k.next;
    }
    k.next=n;
    size++;
}
// Add node in end of linkedlist, node as parameter 
  ////////////////
    /////////////////////////////////////////
  public void insertAtEnd(Node node){
    if(head==null){
        head=node;
        size++;

        return;
    }
    Node k=head;
    while(k.next!=null){
        k=k.next;
    }
    k.next=node;
    size++;
}
// print data of list head is passed by main method
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
 ///// print
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
 ////////insert after data/////////
 public void insertafterdata(int index, int data,Node hd){
    Node n=new Node(data);
    if(hd==null){
        System.out.println("cannot insert after");
        return;
    }
    if(index==1){
        hd.next=n;
        n.next=hd.next;
        n.next.prew=n;
        n.prew=head;
        return;
    }
    Node temp=hd;
    int k=1;
    while(k<index){
        k++;
        temp=temp.next;
    }
    n.next=temp.next;
    temp.next=n;
    n.next.prew=n;
    n.prew=temp;
}
 ////////insert after data/////////
  public void insertbeforedata(int index, int data,Node hd){
     Node n=new Node(data);
     if(hd==null){
         System.out.println("cannot insert after");
         return;
     }
     if(index==1){
         hd.next=n;
         n.next=hd.next;
         n.next.prew=n;
         n.prew=head;
         return;
        }
     Node temp=hd;
     int k=1;
     while(k<index-2){
         k++;
         temp=temp.next;
     }
     n.next=temp.next;
     temp.next=n;
     n.next.prew=n;
     n.prew=temp;
 
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
    Node n=head;
    while(n.next.next!=null){
        n=n.next;
    }
    n.next=null;

  }



 //reverse duplicate
 public Node reverseList( Node head1){
    Node head3=null;
    Node temp=head1;
    while(temp!=null){
        head3=insertAtFirst(temp.data, head3);
        temp=temp.next;
    }
    return head3;
}

 //duplicate method
 public Node duplicateList( ){
    Node headd= null;
    Node t=head;
    while(t!=null){
        headd =insertAtLast(t.data,headd);
        t=t.next;
    }
    return headd;
}
//merge method in quiz
 public Node merge(Node head1,Node head2){
    Node temp=null;
    Node h1=head1, h2=head2;
    while(h1!=null && h2!=null){
        if(h1.data<=h2.data){
            temp=insertAtLast(h1.data, temp);
            h1=h1.next;
        }
        else{
            temp=insertAtLast(h2.data, temp);
            h2=h2.next;
        }
    }

    while(h1!=null){
        temp=insertAtLast(h1.data, temp);
        h1=h1.next;
    }
    while(h2!=null){
        temp=insertAtLast(h2.data, temp);
        h2=h2.next;
    }
    return temp;
 }
 //////isEmpty////////
 public boolean isEmpty(){
    return head==null;
 }
public static void main(String[] args) {
    DoublyLinkedList d=new DoublyLinkedList();
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
    System.out.println("add a node in list in ;ast");
    d.insertAtEnd(k2);
    d.printAll();
    d.removeLast();
    System.out.println("remove last");
    d.printAll();
    System.out.println("insert after");
    d.insertafterdata(3, 99, head);
    d.printAll();
    System.out.println("insert before");
    d.insertbeforedata(3, 98, head);
    d.printAll();
    // Node n=null;
    System.out.println("deplicate");
     Node n=d.duplicateList();
    d.printAll(n);
    System.out.println("reverse ofduplicate");
    n = d.reverseList(n);
    d.printAll(n);
    System.out.println("merge ");
    head=d.merge(n, n);
    d.printAll(head);
}
}
