import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val =val;
    }
}
public class PostOrderTraversal {
    static List<Integer>result = new ArrayList<>();
    public static void PostOrder(TreeNode root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        result.add(root.val);

    }
public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    PostOrder(root);
    System.out.println(result);
}
    
}
