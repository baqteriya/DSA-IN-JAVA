import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class PreOrderTraversal {
    static List<Integer>result = new ArrayList<>();
    public static void PreOrder(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        PreOrder(root);
        System.out.println(result);
    }
    
}
