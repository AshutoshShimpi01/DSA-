public class code {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;
    public static Node buildTree(int[] arr) {

        idx++;
        if(arr[idx] == -1) {
            return null;
        }

        Node root = new Node(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);

        return root;

    }

    public static void preOrder(Node root) {

        if(root == null) {
            return;
        }


        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void inOrder(Node root) {

        if(root == null) {
            return;
        }



        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }


    public static void postOrder(Node root) {

        if(root == null) {
            return;
        }


        postOrder(root.left);
        postOrder(root.right);
        
        System.out.print(root.data);
    }


    public static void main(String[] args) throws Exception {

        int[] arr = {1,2,3,-1,4,-1,-1,-1,5,6,-1,-1,7,8,-1,-1,-1};

        Node root = buildTree(arr);

        System.out.println(root.data);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
  }
}

// 1
// 12345678
// 34216587
// 43268751
