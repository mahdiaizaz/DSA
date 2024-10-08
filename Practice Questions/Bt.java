import java.util.LinkedList;
import java.util.Queue;

class Bt{
static class Node {
    int data;
    Node left, right;

    Node (int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}


static class Binarytree{
   static int ind=-1;
    public static Node bldtre(int nodes[])
    {
        ind++;
        if(nodes[ind]==-1)
        {
            return null;
        }
        Node n=new Node(nodes[ind]);
        n.left=bldtre(nodes);
        n.right=bldtre(nodes);
        return n;
    }

    public static void preorder(Node root)
    {
        if(root== null)
        {
            return ;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root)
    {
        if(root== null)
        {
            return ;
        }
        
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);

    }

    public static void postorder(Node root)
    {
        if(root== null)
        {
            return ;
        }
        
        postorder (root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");


    }


    public static void levelOrder(Node root)
{
    System.out.println();
    if(root==null)
    {
        return;
    }
    Queue<Node> q=new LinkedList<>();

    q.add(root);
    q.add(null);
    while(!q.isEmpty())
    {
        Node cr=q.remove();
        if(cr==null)
        {
            System.out.println();
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }

        else{
            System.out.print(cr.data+" ");
            if(cr.left!=null)
            {
                q.add(cr.left);
            }
            if(cr.right!=null)
            {
                q.add(cr.right);
            }


        }
    }
}



    
}

public static void main(String[] args) {
    Binarytree b=new Binarytree();
    int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
   Node k= b.bldtre(node);
//    System.out.println(k.data);
b.preorder(k);
System.out.println();
b.inorder(k);
System.out.println();
b.postorder(k);
b.levelOrder(k);



}
}