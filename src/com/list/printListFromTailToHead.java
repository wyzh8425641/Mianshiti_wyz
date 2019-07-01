package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class printListFromTailToHead {

         public class ListNode {
             int val;
             ListNode next = null;
                  ListNode(int val) {
                      this.val = val;
                  }
         }
         public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
             ArrayList<Integer> list=new ArrayList<>();
             ArrayList<Integer> list1=new ArrayList<>();
             while (listNode!=null){
                 list.add(listNode.val);
             }
             for (int i=list.size()-1;i>=0;i--){
                 list1.add(list.get(i));
             }
             return list;
         }
}
