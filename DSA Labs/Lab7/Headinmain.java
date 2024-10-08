public class Headinmain {
 static class  Node {
    int data;Node next;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
  }
  public static Node adfirst(int data, Node head)
  {
    Node n=new Node(data);
    if(head==null)
    {
        head=n;
        return n;
    }
    n.next=head;
    head=n;
    return head;
  }

  public static Node adlast(int data , Node head)
  {
    Node n=new Node(data);
    if(head==null)
    {
        head=n;
        return n;
    }

    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=n;
    return head;
  }


  public static void print(Node head)
  {
    if(head==null)
    {
        return;
    }
    Node t=head;
    while(t!=null)
    {
        System.out.print( t.data+" ");
        t=t.next;
    }
    System.out.println();
  }


  public static void printreverse(Node head)
  {
    if(head==null)
    {
        return;
    }
    Node t=head;
    printreverse(t.next);
    System.out.print(t.data+" ");

  }
  public static void main(String[] args) {
    Node head=null;
    head=adfirst(4, head);
    head=adfirst(3, head);
    head=adlast(6, head);

    print(head);
    printreverse(head);
  }

    
}
