public class Simplerecursion{
//print 1 to N in accending order using recursion
    public static void accendingOrder(int n){
        if(n<=0){
            System.out.println();
            return;
        }
       else{ 
        accendingOrder(n-1);
        System.out.print(n+" ");
    }
}
//print 1 to N in  decending order using recursion

    public  static void decendingOrder(int n){
        if(n<=0){
            System.out.println();
            return;
        }
        
        else{  
        System.out.print(n+" ");
        decendingOrder(n-1);
    }
}
//print character array in accending order using recursion
public static void accendingOrderch(char arr[], int lenght){
        if(lenght<0){
            System.out.println();
            return;
        }
       else{ 
        accendingOrderch(arr, lenght-1);
        System.out.print(arr[lenght]+" ");
    }
}
//print character array in decending order using recursion
public  static void decendingOrderch(char arr[], int lenght){
        if(lenght<0){
            System.out.println();
            return;
        }
        else{  
        System.out.print(arr[lenght]+" ");
        decendingOrderch(arr, lenght-1);
    }
}
// factorial using iteration
    public static int fectoriali(int n){
        int feb=1;
        for(int i=1;i<=n;i++){
            feb*=i;
        }
        System.out.println("using iteration");
        return feb;
    }
// factorial using recursion
    public static int fectorialiR(int n){
        if(n==1)
        return 1;
        else{
            return n*fectorialiR(n-1);
        }
    }
// febonacci recrursinve
    public static int  febonacirecrsive(int i){
        if(i==0 || i==1){
           return i;
        }
        else{          
        return febonacirecrsive(i - 1) + febonacirecrsive(i - 2);
        }
    }

//fabonacci iteration
    public static void febonaci(int n){
        if(n<0){
            return;
        }
        if(n==0 || n==1){
            System.out.println("1");
            return;
        }
        int one=0, second=1;
        int next=0;
        System.out.print(one+" "+second+" ");
        for(int i=1;i<=n;i++){
             next= one+second;
             System.out.print(next+" ");
             one=second;
             second=next;
            
        }
      
    }
    

// search using iteration
    public static int search(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
            {return 1;}
        }
        return -1;
    }

// search using recursion
public static int searchrecursion(int arr[],int l, int k){
        if(arr[l]==k){
            return 1;
        }
        if(l>0 ){
            return -1;
        }
        else{
            return searchrecursion(arr,l+1,  k);

        }

    }

static class Node {
    int data;
     Node next;
     Node (int data){
        this.data=data;
        this.next=null;
     }


}


public static Node addfirst(Node n, int data){
    Node ne=new Node(data);
    if(n==null){
        n=ne;
        return ne;
    }
    ne.next=n;
    n=ne;
    return n;

}


public static Node addlast(Node n, int data){
    Node ne=new Node(data);
    if(n==null){
        n=ne;
        return ne;
    }
   Node k=n;
   while(k.next!=null){
    k=k.next;
   }
   k.next=ne;
   k=ne;
   return n;

}

public static void print(Node n){
    if(n==null)return;
    Node k=n;
    while(k!=null){
        System.out.print(k.data+" ");
        k=k.next;
    }
}


public static void printR(Node n){
    if(n==null)return;
  
    System.out.print(n.data+" ");
    printR(n.next);
}





   
    
 public static void main(String[] args) {
    // int arr[]= {1,2,3,4,5};
    // accendingOrder(5);
    // System.out.println();
    // decendingOrder(5);
    // char c[]={'A', 'B', 'B', 'A', 'S'};
    // System.out.println();
    // accendingOrderch(c, c.length-1);
    // System.out.println();
    // decendingOrderch(c, c.length-1);
    
    long starttime = System.nanoTime();
    System.out.println(fectoriali(4));
    long endTime = System.nanoTime();
    long finaltime = (endTime - starttime);
    double FinalTimeInsec = (endTime - starttime)/100000000.0;
    System.out.println("Time : "+FinalTimeInsec+" seconds");

    long sffr=System.nanoTime();
    System.out.println(fectorialiR(5));
    long effr=System.nanoTime();
    long finalfacrecr=effr-sffr;
    double timeinsecondfactorailrec=finalfacrecr/1000000000.0;
    System.out.println("finale time in seconds: "+timeinsecondfactorailrec);
//     long st=System.nanoTime();
//       for (int i = 0; i <=8; i++) {
//         System.out.print(febonacirecrsive(i)+" ");
//     }
//     System.out.println();
//     long end=System.nanoTime();
// long finl=end-st;
// double finalinseconds=finl/1000000000.0;
// System.out.println("time of febonacci recursive in seconds: "+finalinseconds);




  
// System.out.println(search(arr, 4));
// System.out.println(searchrecursion(arr, 0, 8));
// Node head=null;
// head= addfirst(head, 4);
// head= addfirst(head, 3);
// head= addfirst(head, 2);
// head= addlast(head, 5);
// print(head);
// System.out.println();
// printR(head);
// System.out.println();
// febonaci(10);


    
 }
}