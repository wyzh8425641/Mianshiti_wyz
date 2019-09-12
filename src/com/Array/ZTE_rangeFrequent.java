package com.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZTE_rangeFrequent {
    public static void main(String[] args) {
        int size=9;
        String[] s={"ac","the","we","ac","now","we","stand","alone","stand"};
        int pair=3;
        List<List<Integer>> rangeLR=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(6);
        rangeLR.add(list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(3);
        List<Integer> list3=new ArrayList<>();
        list3.add(7);
        list3.add(9);
        rangeLR.add(list2);
        rangeLR.add(list3);
        List<String> lists=new ArrayList<>();
        lists=rangeFrequent(size,s,pair,rangeLR);
        System.out.println(lists.toString());
    }
    public static List<String> rangeFrequent(int size,String[] stringList,int pair,List<List<Integer>> rangeLR){
        List<String> list=new ArrayList<>();
        for (int i=0;i<pair;i++){
            List<Integer> listtemp=rangeLR.get(i);
            Map<String,Integer> hm=new HashMap<>();
            int L=listtemp.get(0);
            int R=listtemp.get(1);
            int count=0;
            String s=stringList[L-1];
            for (int j=L-1;j<R;j++){
                String stemp=stringList[j];
                if (hm.containsKey(stemp)){
                    int value=hm.get(stemp)+1;
                    hm.put(stemp,value);
                    if (value>count){
                        s=stemp;
                        count=value;
                    }
                }
                else {
                    hm.put(stemp,1);
                }
            }
            list.add(s);
        }
        return list;
    }
}
