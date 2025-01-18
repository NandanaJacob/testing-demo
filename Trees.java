public class Trees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root = insertion(30, root);
        root = insertion(70, root);
        display(root);
        System.out.println();
        root = delete(root, 70);
        display(root);
        if(search(root, 30)!=null){
            System.out.println("present frm main");
        }else{
            System.out.println("absent frm main");
        }
    } 
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode insertion(int data, TreeNode root){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }
        if(data < root.data){
            root.left = insertion(data, root.left);
        }else if(data > root.data){
            root.right = insertion(data, root.right);
        }
        return root;
    } 
    public static void display(TreeNode root){
        if(root != null){
            display(root.left);
            System.out.print(root.data + "\t");
            display(root.right);
        }
    }
    public static TreeNode delete(TreeNode root, int data){
        //find the node
        if(data < root.data){
            root.left = delete(root.left, data);
        }else if(data > root.data){
            root.right = delete(root.right, data);
        }
        else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            root.data = min_value(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    public static int min_value(TreeNode root){
        int tempMinValue = root.data;
        while(root.left != null){
            tempMinValue = root.left.data;
            root = root.left;
        }
        return tempMinValue;
    }
    public static TreeNode search(TreeNode root, int value){
        if(root.data > value){
            root.left = search(root.left, value);
        }else if(root.data < value){
            root.right = search(root.right, value);
        }else{
            if(root.data != value){
                System.out.println("not there");
                // return root;
            }
            else{
                System.out.println("present!");
                // return root;
            }
        }
        return root;
    }
}


