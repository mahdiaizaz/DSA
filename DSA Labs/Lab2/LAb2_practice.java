class LAb2_practice{

static    class Node {
        int data;
        Node next;
        Node (int data){
           
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    static int size=0;
// add in the last
    public static void addback(int data){
        Node node=new Node(data);
        size++;
        if(head==null){
            head=tail=node;
            return;
        }
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;
    }
    // add in the front
    public static void addinfront(int data){
        Node node =new Node(data);
        size++;
        if(head== null){
            head=tail=node;
            return;
        }
        node.next=head;
        head=node;
     }
//add last
    public static void addlast(int data){
        Node node =new Node(data);
        size++;
        if(head==null){
            head=tail=null;
            return;
        }
        tail.next=node;
        tail=node;
    }

//add first
      public static void addfirst(int data){
          Node node =new Node(data);
          size++;
          if(head==null){
              head=tail=null;
              return;
          }
          node.next=head;
          head=node;
        }

// print 
      public static void print(){
        Node n=head;
        while(n!=null){
                System.out.print(n.data+"-->");
                n=n.next;
            }
            System.out.print("null");
            System.out.println();
      }
// add in middle
      public static void addinMiddle(int data, int index){
        Node node =new Node(data);
        if(size==0){
            head=node;
            return;
        }
        else if(index>size){
            System.out.println("invalid index");
        }
        Node n=head;
        int k=0;
        while(k<index-1){
            k++;
            n=n.next;
        }
        node.next=n.next;
        n.next=node;

      }

// is empty
      public static boolean isEmpty(){
        return head==null;
      }

//remove front
      public static void removefromFront(){
        head=head.next;
        size--;
    }
//remove from end
      public static void removefromLast(){
        Node n=head;
        while(n.next.next!=null)
        {
            n=n.next;
            size--;
        }
        n.next=null;
    }

//remove at index
      public static void removeAtIndex(int index){
        if(index==1){
            removefromFront();
            size--;
            return;
        }
        Node n=head;
        for(int i=1;i<index-1;i++){
            n=n.next;
        }
        n.next=n.next.next;
        size--;
    }
// lenght
    public static int lenght(){
        return size;
    }
// find element function
    public static int findElement(int data){
        int index=0;
        if(head.data==data){
            return index;
        }
        Node n=head;
        while(n.data!=data){
            n=n.next;
            index++;
        }
         return index;

    }
public static void main(String[] args) {
    addinfront(3);
    addback(4);
    addfirst(5);
    addlast(2);
    print();
    addinMiddle(11, 1);
    print();
    removeAtIndex(2);
    print();
    System.out.println(lenght());
    System.out.println(findElement(3));
    // removefromFront();
    // print();
    // removefromLast();
    // print();

    
}
}