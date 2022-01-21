package com.company;

public
class Tree {
    TreeNode root;
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        else{
            System.out.println (root.data +" ");
            preOrder(root.lift);
            preOrder(root.right);
        }
    }
}
