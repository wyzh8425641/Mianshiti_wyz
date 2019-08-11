package com.linklist;
//将两个链表按照从小到大的顺序重新排序
import java.util.Scanner;

public class RemoveNthFromEnd {

      public static void main(String [] args){
          Scanner in=new Scanner(System.in);
          int []a=new int[]{1,2,3,4,5};
          int n=2;
          Node head = new Node(0);
          Node node1=new Node(1);
          Node node2=new Node(2);
          Node node3=new Node(3);
          Node node4=new Node(4);
          Node node5=new Node(5);
          node1.next=node3;
          node3.next=node5;
          node2.next=node4;
          Node node=mergeTwoList(node1,node2);
          while (node!=null){
              System.out.print(node.data+" ");
              node=node.next;
          }
      }
    public static Node mergeTwoList(Node head1, Node head2) {
        //递归结束条件        
        if (head1 == null && head2 == null) {
            return null;
            }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        //合并后的链表
        Node head = null;
        if (head1.data > head2.data) {
            //把head较小的结点给头结点
            head = head2;
            //继续递归head2
             head.next = mergeTwoList(head1, head2.next);
            } else {
            head = head1;
            head.next = mergeTwoList(head1.next, head2);
        }
        return head;
      }

}
