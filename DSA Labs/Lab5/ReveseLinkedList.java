public class ReveseLinkedList {
// node class
    public class  Node  {
        int data; Node next;
         Node(int data){
            this.data =data;
            this.next=null;
         }
        }
        int size=0;
         Node head, tail;
//add first
          public void addfirst(int data){
             Node n=new Node(data);
            if( head==null){
                head=tail=n;
                return;
            }
            n.next=head;
            head=n;
        }
//add last
          public void addlast(int data){
             Node n=new Node(data);
            if( head==null){
                head=tail =n;
            }
            tail.next=n;
            tail=n;
          }
//reverse data
          public  void reversedata(){
            ReveseLinkedList s=new ReveseLinkedList();
            Node k=head;
            while(k!=null){
                s.addfirst(k.data);
                k=k.next;
            }
            s.print();
          }




        //   public void reverselinkedlist()
        //   {
        //     Node head2=null;
        //     Node tail2=null;
        //     Node tem=head;
        //     while(tem!=null)
        //     {
        //         Node k=new Node(tem.data);
        //         if(head2==null)
        //         {
        //             head2=tail2=k;
        //         }
        //         tail2.next=k;
        //         tail2=k;
        //         tem=tem.next;

        //     }

        //     if(head2==null)
        //     {
        //         return;
        //     }
        //     Node pr=null;
           
        //     Node cr=head2;
        //     Node nextt;
        //     while(cr!=null)
        //     {
        //         nextt=cr.next;
        //         cr.next=pr;
        //         pr=cr;
        //         cr=nextt;
        //     }
            
        //     while(pr!=null)
        //     {
        //         System.out.print(pr.data+" ");
        //         pr=pr.next;
        //     }
        //     System.out.println();

        //   }
    
//print        
    public void print(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        ReveseLinkedList list=new ReveseLinkedList();
        list.addfirst(3);
        list.addfirst(2);
        list.addlast(4);
        list.addlast(5);
        list.print();
      //  list.reverselinkedlist();
//        list.print();
        list.reversedata();
        list.print();
    }
    
}
