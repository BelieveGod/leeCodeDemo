package me.believegod.leecode;

/**
 * @ClassName Demo404
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/19 10:08
 * @Version 1.0
 */
public class Demo404 {


    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left!=null){
            return root.left.val+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
        else{
            return sumOfLeftLeaves(root.right);
        }
    }
}







