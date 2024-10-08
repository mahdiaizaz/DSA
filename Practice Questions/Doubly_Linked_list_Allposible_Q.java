public class Doubly_Linked_list_Allposible_Q {
   static class Node{
    int data;
    Node next, prew;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prew=null;
    }
   }

 static  Node head;
 static Node tail;
 static int size=0;
 // add in first
   public static void addStart(int data)
   {
    Node newnode= new Node(data);
    size++;
    if(head==null)
    {
        head=tail=newnode;
        return;
    }
    head.prew=newnode;
    newnode.next=head;
    head=newnode;
   }
// add in last
   public static void addnext(int data)
   {
    Node newnode= new Node(data);
    size++;
    if(head==null)
    {
        head=tail=newnode;
        return;
    }
    Node n=head;
    while(n.next!=null)
    {
        n=n.next;
    }
    n.next=newnode;
    newnode.prew=n;
   }

   //add last with tail
   public static void addlastwithtail(int data)
   {
    Node newnode=new Node(data);
    size++;
    if(head==null)
    {
        head=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prew=tail;
    tail=newnode;




   }

   //print
   public static void print()
   {
    Node n=head;
    while (n!=null) {
        System.out.print(" "+n.data+"<-->"+" ");
        n=n.next;
        
    }
    System.out.print("null");
    System.out.println();
   }

   //delete start
   public static void removeStart()
   {
    if(head==null)
    {
        System.out.println("no node to delete");
        return;
    }
    head=head.next;
    head.prew=null;
    size--;

   }

    //delete end
    public static void removeLast()
    {
     if(head==null)
     {
         System.out.println("no node to delete");
         return;
     }
     Node n=head;
     while (n.next.next!=null) {
        
        n=n.next;
        size--;
        
    }
    n.next=null;
    
 
    }

    // delete from end with tail

    public static void removeLastwithtail()
    {
     if(head==null)
     {
         System.out.println("no node to delete");
         return;
     }
    tail.prew=tail;
    tail.next=null;
    size--;
 
    }

       // find element
   public static int findElement(int data)
   {
    int l=0;
    if(head.data==data)
    {
      int k=  head.data;
      System.out.print("element found on index"+l+" ");
      return k;

    }
    Node n=head;

   while(n.data!=data)
   {
    if(n.next==null)
    {
        System.out.println("element not found");
        return -1;

    }

    n=n.next;
    l++;
   }

   int k=n.data;
   System.out.print("element found on index  "+l+" that contains  ");

   return k;
}

// add before index
public static void addBeforeIndex(int data, int index)
{
    Node n=new Node(data);
    if(index==0)
    {
        n.next=head;
        head.prew=n;
        head=n;
        return;
    }
    Node k=head;
    int i=1;
    while(i<index-2)
    {
        i++;
        k=k.next;
    }
    Node nn=k.next;
    n.next=k.next;
    nn.prew=n;
    n.prew=k;
    k.next=n;


}

// add after index
public static void addAfterIndex(int data, int index)
{
    Node n=new Node(data);
    if(index==0)
    {
        Node u=head.next;
        n.prew=head;
        head.next=n;
        u.prew=n;
        n.next=u;

        return;
    }
    Node k=head;
    int i=1;
    while(i<index)
    {
        i++;
        k=k.next;
    }
    Node nn=k.next;
    n.next=k.next;
    nn.prew=n;
    n.prew=k;
    k.next=n;


}

// add at index
public static void addATIndex(int data, int index)
{
    Node n=new Node(data);
    if(index==0)
    {
        n.next=head;
        head.prew=n;
        head=n;
        return;
    }
    Node k=head;
    int i=1;
    while(i<index-1)
    {
        i++;
        k=k.next;
    }
    Node nn=k.next;
    n.next=k.next;
    nn.prew=n;
    n.prew=k;
    k.next=n;


}

public static void removeATIndex( int index)
{
    
    if(index==0)
    {
       head=head.next;
       head.prew=null;
    }
    int k=1;
    Node n=head;
    while(k<index-1)
    {
        k++;
        n=n.next;

    }
    Node p=n;
    n.next=n.next.next;
    n.prew=p;



}


    


   
    
   public static void main(String[] args) {
    addStart(1);
    addStart(2);
    addStart(0);
    addlastwithtail(7);
    print();
    
    addnext(5);
    print();
    addBeforeIndex(22, 3);
    print();
    addAfterIndex(33, 3);
    print();
    removeATIndex(3);
    print();
    // addATIndex(44, 3);
    // print();
    // removeLastwithtail();
    // print();
    
    // removeLast();
    // print();
    // removeStart();
    // print();
    // System.out.println(findElement(5));
    // System.out.println(findElement(33));
   }


}
