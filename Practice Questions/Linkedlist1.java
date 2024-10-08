public class Linkedlist1 implements List1 {

       Node head;
     int size;
   
       // node class
      static class  Node{
           int data;
           Node next;
           //////////
           Node head;
           Node(int data)
           {
               this.data=data;
               this.next=null;
           }

           Node(Node f)
           {
            this.next=f;
           }
           
       }

       public Linkedlist1(){
        head = new Node(null); 
        size = 0;
       }
      //size
      public int size(){
        return size;
    }
    // is empty
    public  boolean isEmpty()
    {
      return head==null;
    }
    // addlast
    public  void addlast(int data)
    {
      Node n=new Node(data);
      size++;
      if(isEmpty())
      {
          head=n;
          
          return;
      }

    

      else {
          Node temp=head;
          while(temp.next!=null)
          {
              temp=temp.next;
          }

          temp.next=n;
      }
    }

    //find element
    public  int find(int data)
    {
        if(head.data==data)
        {
            return head.data;
        }
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)return temp.data;
            temp=temp.next;

        }

        return -1;
    }

    public  int removefirst()
    {
      int k=head.data;
      head=head.next;
      size--;
      return k;

    }
    //remove last
    public  int removeLast()
    {
      Node n=head;
      while(n.next.next!=null)
      {
          n=n.next;
      }
      int k=n.next.data;
      size--;
      n.next=null;
      return k;


    }

 

    // add first
    public   void  addfirst(int data)
    {
        Node newn=new Node(data);
        size++;
        if(head==null)
        {
            head=newn;
            return;
        }

        newn.next=head;
        head=newn;




    }
       
    // print linked list
    public  void printlist()
    {
        Node n=head;
        if(head==null)
        {
            return;
        }
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }



    // add at middle
    public   void addatmiddle(int data,int index)
    {
        Node newn=new Node(data);
        size++;
       
        Node n=head;
    
        for(int i=0;i<index-1;i++)
        {
            n=n.next;
          

        }
        newn.next=n.next;
        n.next=newn;




    }

  public  Linkedlist1 duplicate(){
        Linkedlist1 duplicate=new Linkedlist1();
        Node temp=head;
        while(temp!=null){
          duplicate.addlast(temp.data);
          temp=temp.next;
        }
        return duplicate;
          }


    public Linkedlist1 duplicateReversed()
    {
        Linkedlist1 k=new Linkedlist1();
        Node l=head;
        while(l!=null)
        {
            k.addfirst(l.data);
            l=l.next;
        }
        return k;
    }
    // public void nthnode();
    public static void main(String[] args) {
        Linkedlist1 lst=new Linkedlist1();
     
        lst.addlast(2);
        lst.addlast(1);
        lst.addlast(7);
        lst.addlast(5);
        lst.printlist();
        Linkedlist1 lst2=lst.duplicate();
        lst2.printlist();
        Linkedlist1 l=lst.duplicateReversed();
        l.printlist();
    }
}
