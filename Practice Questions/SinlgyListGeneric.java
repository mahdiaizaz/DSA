


class SinlgyListGeneric {
    public    Node head,tail;
     int size;
   
       // node class
       class  Node{
        Object data;
           Node next;
           //////////
           Node head;
           Node(Object data)
           {
               this.data=data;
               this.next=null;
           }
           
       }
      
         
   // is empty
         public  boolean isEmpty()
         {
           return head==null;
         }
         //remove first
   
         public  Object removefirst()
         {
            Object k=head.data;
           head=head.next;
           size--;
           
           return k;
   
         }
         //remove last
         public  void removeLast()
         {
           if(isEmpty())
           {
            System.out.println("no node to remove");
           }
           else{
            Node n=head;
            while(n.next.next!=null)
            {
                n=n.next;

            }
            tail=n;
            tail.next=null;
           }
   
   size--;
         }
   
         public  void addlast( Object data)
         {
           Node n=new Node(data);
           if(isEmpty())
           {
               head=tail=n;size++;
               
               return;
           }
   
           tail.next=n;
           tail=n;
           size++;
         }
   
   
         
         
   // add first
           public   void  addfirst(  Object data)
           {
               Node newn=new Node(data);
               if(head==null)
               {
                   head=tail=newn;
                   size++;
                   return;
               }
   
               newn.next=head;
               head=newn;
               size++;
   
           }
   
           public   Node  addfirst( Object data, Node head)
           {
               Node newn=new Node(data);
               // s++;
               if(head==null)
               {
                   head=newn;
                   size++;
                   return head;
               }
   
               newn.next=head;
               head=newn;
               size++;
               return head;
   
   
   
   
           }
   
   // add at middle
           public   void addatmiddle(Object data,int index)
           {
               Node newn=new Node(data);
               if(index==1)
               {
                head=tail=newn;
                size++;
            }

           
             else
             {
                Node n=head;
           
                for(int i=1;i<index-1;i++)
                {
                    n=n.next;
                  
    
                }
                newn.next=n.next;
                n.next=newn;
                size++;
                

             }


              
            
   
   
   
   
           }
   // delete at middle
           
           public   void deletemiddle(int index)
           {
               
              if(head==null)
              {
                System.out.println("no node to return");
                return;
              }
               Node n=head;
           
               for(int i=1;i<index-1;i++)
               {
                   n=n.next;
                 
   
               }
               n.next=n.next.next;
               size--;
               
   
   
   
           }
   
          
           
   
       // print linked list
           public  void printlist()
           {
               Node n=head;
               while(n!=null)
               {
                   System.out.print(n.data+" ");
                   n=n.next;
               }
               System.out.println();
           }
   // remove dublicatte
           public void removeDublicate()
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
                       }
                       else{
                           n=n.next;
                       }
   
                   }
                   cr=cr.next;
   
                  
                   
               }
           }
   
        
   
            void reverseLIST()
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
   


   
   
       public static void main(String[] args) {
           
        SinlgyListGeneric ll=new SinlgyListGeneric();

          ll.addfirst(5);
          ll.addfirst(4);
          ll.addfirst(3);
          ll.printlist();
          ll.addlast(6);
          ll.addlast(7);
          ll.printlist();
          System.out.println("add middle");
          ll.addatmiddle(5, 2);
          ll.printlist();
          System.out.println("remove first");
          ll.removefirst();
          ll.printlist();
          System.out.println("remove last");
          ll.removeLast();
          ll.printlist();
          System.out.println("remove duplicate");
          ll.removeDublicate();
          ll.printlist();
          System.out.println("reverse the list");
          ll.reverseLIST();
          ll.printlist();
          SinlgyListGeneric l=new SinlgyListGeneric();

          l.addfirst("Salman");
          l.addfirst("Aizaz");
          l.addfirst("Anwar");
          l.printlist();
          l.addlast("Bashir");
          l.addlast("Qumar");
          l.printlist();
          System.out.println("add middle");
          l.addatmiddle("Rehan", 2);
          l.printlist();
          System.out.println("remove first");
          l.removefirst();
          l.printlist();
          System.out.println("remove last");
          l.removeLast();
          l.printlist();

          



   
   
   
   
   
       
   
   
          
           
   
   
       }
    }