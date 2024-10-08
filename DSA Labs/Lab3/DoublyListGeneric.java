

class DoublyListGeneric<T> {
    public    Node head,tail;
     int size;
     // node class
       class  Node{
        T data;
           Node next;
           //////////
           Node prew;
           Node(T data){
               this.data=data;
               this.next=null;
           }
           
       }
// is empty
         public  boolean isEmpty(){
           return head==null;
         }
//remove first
   
         public  T removefirst(){
            T k=head.data;
           head=head.next;
           head.prew=null;
           size--;
            return k;
        }
//remove last
         public  void removeLast(){
           if(isEmpty()){
            System.out.println("no node to remove");
           }
           else{
           tail=tail.prew;
           tail.next=null;
        }
    }
//add last
    public  void addlast( T data){
           Node n=new Node(data);
           if(isEmpty()){
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
           public   void  addfirst( T data){
               Node newn=new Node(data);
               if(head==null){
                   head=tail=newn;
                   size++;
                   return;
               }
               newn.next=head;
               head=newn;
               size++;
            }
   
           public   Node  addfirst( T data, Node head){
               Node newn=new Node(data);
               // s++;
               if(head==null){
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
           public   void addatmiddle(T data,int index){
               Node newn=new Node(data);
               if(index==1){
                head=tail=newn;
                size++;
            }
            else{
                Node n=head;
           
                for(int i=1;i<index-1;i++){
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
           
           public   void deletemiddle(int index){
               
              if(head==null){
                System.out.println("no node to return");
                return;
              }
               Node n=head;
               for(int i=1;i<index-1;i++){
                   n=n.next;
                }
               n.next=n.next.next;
               n.next.next.prew=n; 
               size--;
            }
// print linked list
           public  void printlist(){
               Node n=head;
               while(n!=null){
                   System.out.print(n.data+" ");
                   n=n.next;
               }
               System.out.println();
           }
// remove dublicatte
           public void removeDublicate(){
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
                       }
                       else{
                           n=n.next;
                       }
                    }
                   cr=cr.next;
                }
           }
public static void main(String[] args) {
           
        DoublyListGeneric<Integer> ll=new DoublyListGeneric<>();

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
          SinlgyListGeneric<String> l=new SinlgyListGeneric<>();

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