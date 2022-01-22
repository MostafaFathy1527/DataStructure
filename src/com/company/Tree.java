package com.company;



public
class Tree {
    TreeNode root;
    int result=0;
    public TreeNode insert(TreeNode root, int data){
        if(root==null){
            root=new TreeNode(data);
            return root;
        }
        if(data<root.data){
           root.lift= insert(root.lift,data);
        }
        else {
            root.right= insert(root.right,data);
        }
        return root;

    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        else{
            System.out.print (root.data +" ");
            preOrder(root.lift);
            preOrder(root.right);
        }
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        else{
            inOrder(root.lift);
            System.out.print (root.data +" ");
            inOrder(root.right);

        }
    }
    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        else{
            postOrder(root.lift);
            postOrder(root.right);
            System.out.print (root.data +" ");

        }
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        return  Math.max (getHeight (root.lift ),getHeight (root.right ) )+1;

    }
    public void printAtLevel(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print (root.data+" " );
            return;
        }
        printAtLevel ( root.lift,level-1 );
        printAtLevel ( root.right,level-1 );
    }
    public void level0rder(TreeNode root){
        if(root==null){
            return;
        }
        int height=getHeight(root);
        for(int i=0;i<=height;i++){
            printAtLevel(root,i+1);
            System.out.println ( );
        }
    }
    public int findMax(TreeNode root){
        if(root==null){
            return -999999999;
        }
        else {
             int liftMax=findMax ( root.lift );
            int righttMax=findMax ( root.right );
            return Math.max(root.data,Math.max(liftMax,righttMax));
        }
    }
    public int findMin(TreeNode root) {
        if ( root == null ) {
            return 999999999;
        }
        else {
                int liftMin=findMin ( root.lift );
                int righttMin=findMin ( root.right );
                return Math.min(root.data,Math.min(liftMin,righttMin));
            }
    }
    public int sum(TreeNode root){
        if ( root==null ){
            return 0;
        }
        else {
            result = root.data + ( sum ( root.lift ) + sum ( root.right ) );
        }
        return result;
    }
}
