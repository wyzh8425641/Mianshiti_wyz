package com.SortAlgorithm;

import java.util.Scanner;

//重新构建二叉树
public class reConstructBinaryTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        int[] pre=new int[str1.length];
        int[] in=new int[str2.length];
        for (int i=0;i<str1.length;i++){
            pre[i]=Integer.parseInt(str1[i]);
            in[i]=Integer.parseInt(str2[i]);
        }
        TreeNode root=reConstructBinaryTree(pre,in);
        System.out.println(root);
    }
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
      }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=new TreeNode(pre[0]);//前序的第一个数定为根
        int len=pre.length;
        //当只有一个数的时候
        if(len==1){
            root.left=null;
            root.right=null;
            return root;
        }
        //找到中序中的根位置
        int rootval=root.val;
        int i;
        for(i=0;i<len;i++){
            if(rootval==in[i])
                break;
        }
        //创建左子树
        if(i>0){
            int[] pr=new int[i];
            int[] ino=new int[i];
            for(int j=0;j<i;j++){
                pr[j]=pre[j+1];
            }
            for(int j=0;j<i;j++){
                ino[j]=in[j];
            }
            root.left=reConstructBinaryTree(pr,ino);
        }else{
            root.left=null;
        }
        //创建右子树
        if(len-i-1>0){
            int[] pr=new int[len-i-1];
            int[] ino=new int[len-i-1];
            for(int j=i+1;j<len;j++){
                ino[j-i-1]=in[j];
                pr[j-i-1]=pre[j];
            }
            root.right=reConstructBinaryTree(pr,ino);
        }else{
            root.right=null;
        }
        return root;
    }
}
