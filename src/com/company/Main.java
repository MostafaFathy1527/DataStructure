package com.company;

public class Main {

    public static void main(String[] args)   {
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode forth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);
        TreeNode th6=new TreeNode(6);
        TreeNode th7=new TreeNode(7);
        first.lift=second;
        first.right=third;
        second.lift=forth;
        second.right=fifth;
        third.lift=th6;
        third.right=th7;
        Tree tree = new Tree();
        tree.preOrder(first);

    }



}


