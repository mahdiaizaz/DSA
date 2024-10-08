class LinkedList{
 public static   Node head;
 static int size;

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
        
    }
   
      
      Node temp=null;
// is empty
      public static boolean isEmpty()
      {
        return head==null;
      }
      //remove first

      public static int removefirst()
      {
        int k=head.data;
        head=head.next;
        size--;
        return k;

      }
      //remove last
      public static int removeLast()
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

      public static void addBack(int data)
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


      
      // add last
      public  void addlast(int data)
        {
            Node newn=new Node(data);
            size++;
            if(head==null)
            {
                head=newn;
                temp=newn;
                return;
            }
            temp.next=newn;
            temp=newn;
            

           

        }
// add first
        public  static void  addfirst(int data)
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

        public static  Node  addfirst(int data, Node head)
        {
            Node newn=new Node(data);
            // s++;
            if(head==null)
            {
                head=newn;
                return head;
            }

            newn.next=head;
            head=newn;
            return head;




        }

// add at middle
        public  static void addatmiddle(int data,int index)
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
// delete at middle
        
        public  static void deletemiddle(int index)
        {
            
           
            Node n=head;
        
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
              

            }
            n.next=n.next.next;
            size--;



        }

        //find data on index
        public static int find(int data)
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
//github .com/Marina -Gul
    // print linked list
        public static void printlist(Node h)
        {
            Node n=h;
            while(n!=null)
            {
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println();
        }
// remove dublicatte
        public static void removeDublicate()
        {
            if(head==null)
            {
                System.out.println(" null list");
                return;
            }
            Node cr=head;
            while(cr!=null)
            {
                Node n=cr;
                while(n.next!=null)
                {
                    if(n.next.data==cr.data)
                    {
                        n.next=n.next.next;
                        size--;
                    }
                    else{
                        n=n.next;
                    }

                }
                cr=cr.next;

               
                
            }
        }

      
        public static Node reverse()
        {
            
            if(head==null)
            {
            return null;
            }
            Node head2=null;

            Node temp=head;
            while(temp!=null)
            {
                head2=addfirst(temp.data, head2);
                temp=temp.next;

            }
            return head2;

        }

        //revearse
        // reverse a linked list


 static void reverseLIST()
 {
     Node cr=head, pr=null, nt;

    while(cr!=null)
  {  nt=cr.next;
    cr.next=pr;
    pr=cr;
    cr=nt;
}
    head=pr;


 }


// nth node
public static int  nthnode(int node)
{
    if(head==null)
    {
        System.out.println("no node is here");
        return -1;
    }
    Node n=head;
    int k=0;
    while(k<size-node)
    {
        n=n.next;
        k++;
    }
    return n.data;
    
}


    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();
       
        ll.addlast(3);
        ll.addlast(1);
        ll.addlast(5);
        ll.addlast(8);
        addfirst(10);
        addfirst(33);
      printlist(head);
      addatmiddle(4, 3);
      printlist(head);
      deletemiddle(5);
      printlist(head);
      System.out.println(find(33));
      printlist(head);
      addBack(33);
      printlist(head);
      System.out.println("revrerse linked list");
      reverseLIST();
     printlist(head);
      System.out.println("duplicate is removed");
      removeDublicate();
     printlist(head);
     System.out.println("this is nth node from last");
System.out.println(nthnode(3));   
// Node n=null;
head=reverse();
printlist(head);






    


       
        


    }
}