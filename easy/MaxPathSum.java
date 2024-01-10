package easy;

//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
public class MaxPathSum {
    public static void main(String[]args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        System.out.println(maxPathSum(node));
    }
    public static int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPath(root,max);
        return max[0];
    }
    public static int maxPath(TreeNode root,int[] max) {
        if(root==null){
            return 0;
        }
        int left = Math.max(0,maxPath(root.left,max));
        int right = Math.max(0,maxPath(root.right,max));
        max[0] = Math.max(max[0],left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
