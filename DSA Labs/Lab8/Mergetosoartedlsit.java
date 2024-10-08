public class Mergetosoartedlsit {
    
static class Node {
    int data;
     Node next;
     Node (int data){
        this.data=data;
        this.next=null;
     }


}


public static Node addfirst(Node n, int data){
    Node ne=new Node(data);
    if(n==null){
        n=ne;
        return ne;
    }
    ne.next=n;
    n=ne;
    return n;

}


public static Node addlast(Node n, int data){
    Node ne=new Node(data);
    if(n==null){
        n=ne;
        return ne;
    }
   Node k=n;
   while(k.next!=null){
    k=k.next;
   }
   k.next=ne;
   k=ne;
   return n;

}

public static void print(Node n){
    if(n==null)return;
    Node k=n;
    while(k!=null){
        System.out.print(k.data+" ");
        k=k.next;
    }
}


public static void printR(Node n){
    if(n==null)return;
  
    System.out.print(n.data+" ");
    printR(n.next);
}
public static Node merge(Node head1, Node head2)
{
    Node temp1=head1;
    Node temp2=head2;
    Node head3=null;
    while(temp1!=null && temp2!=null)
    {
        if(temp1.data<temp2.data)
        {
          head3=  addlast(head3, temp1.data);
            temp1=temp1.next;

        }
        else{
          head3=  addlast(head3, temp2.data);
            temp2=temp2.next;
        }
    }

    while(temp1!=null){
       head3= addlast(head3, temp1.data);
        temp1=temp1.next;
    }
    while(temp2!=null){
       head3= addlast(head3, temp2.data);
        temp2=temp2.next;
    }
    return head3;
}

public static void main(String[] args) {
  Node  head1=null;
  head1=addlast(head1, 1);
  head1=addlast(head1, 3);
  head1=addlast(head1, 5);
print(head1);
System.out.println();
  Node head2=null;
  head2=addlast(head2, 2);
  head2=addlast(head2, 4);
  head2=addlast(head2, 6);
  print(head2);
  System.out.println();
  
 Node head3= merge(head1, head2);
 print(head3);

  



    
}
    
}
