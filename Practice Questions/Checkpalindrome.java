public class Checkpalindrome {
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
       public static void addBack(int data)
       {
         Node n=new Node(data);
         size++;
         if(head==null)
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

       public static void printlist()
       {
        if(head==null)
        {
            System.out.println("nod data to print");
            return;
        }
           Node n=head;
           while(n!=null)
           {
               System.out.print(n.data+" ");
               n=n.next;
           }
           System.out.println();
       }

       public static Node findmid(Node head)
       {
        Node s=head,f=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;

       }


       public static boolean checpalindrome()
       {
        Node left=head, right, mid=findmid(head);


        Node cr=mid, pr=null, next;
        while(cr!=null)
        {
            next=cr.next;
            cr.next=pr;
            pr=cr;
            cr=next;

        }

        right=pr;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;

            }
            left=left.next;
            right=right.next;
        }
        return true;
       }
    
       public static void main(String[] args) {
        Checkpalindrome p=new Checkpalindrome();
        addBack(3);
        addBack(1);

        addfirst(4);
        addfirst(3);
        addfirst(1);
        printlist();
        System.out.println(checpalindrome());
       }
}
