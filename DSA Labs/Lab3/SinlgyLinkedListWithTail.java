class SinlgyLinkedListWithTail{
    public static   Node head,tail;
    static int size=0;
// node class
      static class  Node{
           int data;
           Node next;
           //////////
           Node head;
           Node(int data){
               this.data=data;
               this.next=null;
           }
        }
      
         
// is empty
         public static boolean isEmpty(){
           return head==null;
         }
//remove first
        public static int removefirst(){
           int k=head.data;
           head=head.next;
           size--;
           return k;
        }
//remove last
         public static void removeLast(){
           if(isEmpty()){
            System.out.println("no node to remove");
           }
           else{
            Node n=head;
            while(n.next.next!=null)
            {
                n=n.next;

            }
            n.next=tail;
            tail.next=null;
           }
size--;   
}
// addlast   
public  void addlast(int data){
           Node n=new Node(data);
           size++;
           if(isEmpty()){
               head=tail=n;
               return;
           }
           tail.next=n;
           tail=n;
           size++;
         }
// add first
           public  static void  addfirst(int data){
               Node newn=new Node(data);
               size++;
               if(head==null){
                   head=tail=newn;
                   return;
               }
               newn.next=head;
               head=newn;
            }
            public static  Node  addfirst(int data, Node head){
               Node newn=new Node(data);
               // s++;
               if(head==null){
                   head=newn;
                   return head;
               }
               newn.next=head;
               head=newn;
               return head;
            }
// add at middle
           public  static void addatmiddle(int data,int index){
               Node newn=new Node(data);
               if(size==0){
                head=tail=newn;
                size++;
            }

            else  if(size==1){
             newn.next=head;
             head=newn;size++;
            }
             else{
                Node n=head;
           
                for(int i=1;i<index-1;i++){
                    n=n.next;
                }
                newn.next=n.next;
                n.next=newn;
                size++;
            }
        }
// delete at middle
           
           public  static void deletemiddle(int index){
            if(size==0){
                System.out.println("no node to return");
                return;
              }
               Node n=head;
           for(int i=1;i<index-1;i++){
                   n=n.next;
                }
               n.next=n.next.next;
               size--;
            }
   
//find data on index
           public static int find(int data){
               if(head.data==data){
                   return head.data;
               }
               Node temp=head;
               while(temp!=null){
                   if(temp.data==data)return temp.data;
                   temp=temp.next;
                }
                return -1;
           }
// print linked list
           public static void printlist(Node h){
               Node n=h;
               while(n!=null){
                   System.out.print(n.data+" ");
                   n=n.next;
               }
               System.out.println();
           }
// remove dublicatte
           public static void removeDublicate(){
               if(head==null){
                   System.out.println(" null list");
                   return;
               }
               Node cr=head;
               while(cr!=null){
                   Node n=cr;
                   while(n.next!=null){
                       if(n.next.data==cr.data){
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
// reverse the duplicate list           
    public static Node reverse(){
        if(head==null){
               return null;
            }
            Node head2=null;
            Node temp=head;
               while(temp!=null){
                   head2=addfirst(temp.data, head2);
                   temp=temp.next;
                }
               return head2;
            }
// reverse the originol  linked list
static void reverseLIST(){
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
   public static int  nthnode(int node){
       if(head==null){
           System.out.println("no node is here");
           return -1;
       }
       Node n=head;
       int k=0;
       while(k<size-node){
           n=n.next;
           k++;
       }
       return n.data;
    }
    public static void main(String[] args) {
           
           SinlgyLinkedListWithTail ll=new SinlgyLinkedListWithTail();
          
           ll.addlast(3);
           ll.addlast(1);
           ll.addlast(5);
           ll.addlast(8);
           addfirst(10);
           addfirst(33);
           printlist(head);
           System.out.println("print list");
           addatmiddle(5, 3);
           System.out.println("4 added at index three 3 ");
           printlist(head);
           deletemiddle(5);
           System.out.println("5 index is deleted ");
           printlist(head);
           System.out.println("revers linked list");
           reverseLIST();
           printlist(head);
           System.out.println("duplicate is removed");
           removeDublicate();
           printlist(head);
           head=reverse();
           printlist(head);
 
   
   
   
   
       
   
   
          
           
   
   
       }
   }