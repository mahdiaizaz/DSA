

class DoublyListGeneric<I, S,C> {
    public    Node head,tail;
     int size;
   
       // node class
       class  Node{
        I data;
        S data2;
        C data3;

           Node next;
           //////////
           Node prew;
           Node(I data, S data2, C data3)
           {
               this.data=data;
               this.data2=data2;
               this.data3=data3;
               this.next=null;
           }
           
       }
      
         
   // is empty
         public  boolean isEmpty()
         {
           return head==null;
         }
         //remove first
   
         public  Node removefirst()
         {
            Node k = new Node(head.data, head.data2, head.data3);

           head=head.next;
           head.prew=null;
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
           tail=tail.prew;
           tail.next=null;
   
   
         }
        }
   
         public  void addlast(I i, S s,C c)
         {
           Node n=new Node(i,s,c);
           if(isEmpty())
           {
               head=tail=n;
               size++;
               
               return;
           }
   
           n.prew=tail;
           tail.next=n;
           tail=n;
           size++;
         }
   
   
         
         
   // add first
           public   void  addfirst(I i, S s,C c  )
           {
               Node newn=new Node(i,s,c);
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
   
           public   Node  addfirst( I i, S s,C c, Node head)
           {
               Node newn=new Node(i,s,c);
               // s++;
               if(head==null)
               {
                   head =tail=newn;
                   size++;
                   return head;
               }
   
               newn.next=head;
               head=newn;
               size++;
               return head;
   
   
   
   
           }
   
   // add at middle
           public   void addatmiddle(I i, S s,C c,int index)
           {
               Node newn=new Node(i,s,c);
               if(index==1)
               {
                head=tail=newn;
                size++;
            }

           
             else
             {
                Node n=head;
           
                for(int i1=1;i1<index-1;i1++)
                {
                    n=n.next;
                  
    
                }
                n.next.prew=newn;
                newn.prew=n;
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
               n.next.next.prew=n;

               size--;
               
   
   
   
           }
   
          
           
   
       // print linked list
           public  void printlist()
           {

            System.out.println("Roll No   Name \t\t Section");
               Node n=head;
               while(n!=null)
               {
                   System.out.println(n.data+" \t "+n.data2 +"  \t "+ n.data3);
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
   
        
   
   
   


   
   
       public static void main(String[] args) {
           
        DoublyListGeneric<Integer, String, Character> ll=new DoublyListGeneric<>();

          ll.addfirst(5,"Aizaz ", 'A');
          ll.addfirst(4, "Salman", 'B');
          ll.addfirst(3,"Sain  ", 'C');
          ll.printlist();
          ll.addlast(6,"Nikhal", 'A');
          ll.addlast(7,"Murad", 'B');
          ll.printlist();
          System.out.println("add middle");
          ll.addatmiddle(5, "MIDDLE", 'B', 2);
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


        //   SinlgyListGeneric<String> l=new SinlgyListGeneric<>();

        //   l.addfirst("Salman");
        //   l.addfirst("Aizaz");
        //   l.addfirst("Anwar");
        //   l.printlist();
        //   l.addlast("Bashir");
        //   l.addlast("Qumar");
        //   l.printlist();
        //   System.out.println("add middle");
        //   l.addatmiddle("Rehan", 2);
        //   l.printlist();
        //   System.out.println("remove first");
        //   l.removefirst();
        //   l.printlist();
        //   System.out.println("remove last");
        //   l.removeLast();
        //   l.printlist();
   
   
   
   
   
       
   
   
          
           
   
   
       }
    }