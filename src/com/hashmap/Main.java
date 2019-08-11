package com.hashmap;
//判断同学中有多少个人是自己的老乡
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            int M = sc.nextInt();
            Map<Integer, Integer> mapRelation = new HashMap<>();//确认认识
            Map<Integer, Integer> mapUnRelation = new HashMap<>();//可能认识
            mapRelation.put(1, 1);
            for(int i = 0; i < M; i++){
                int one = sc.nextInt();
                int two = sc.nextInt();
                int three = sc.nextInt();
                //当有关系时
                if(three == 1){
                    if(mapRelation.containsKey(one) && !mapRelation.containsKey(two)){
                        mapRelation.put(two,two);
                        if(mapUnRelation.containsKey(two)){
                            int tmp = mapUnRelation.remove(two);
                            mapUnRelation.remove(tmp);
                            mapRelation.put(tmp, tmp);
                        }
                    }else if(mapRelation.containsKey(two) && !mapRelation.containsKey(one))  {
                        mapRelation.put(one,one);
                        if(mapUnRelation.containsKey(one)){
                            int tmp = mapUnRelation.remove(one);
                            mapUnRelation.remove(tmp);
                            mapRelation.put(tmp, tmp);
                        }
                    }else if(!mapRelation.containsKey(one) && !mapRelation.containsKey(two)) {
                        if(!mapUnRelation.containsKey(one)) mapUnRelation.put(one, two);
                        if(!mapUnRelation.containsKey(two)) mapUnRelation.put(two, one);
                    }
                }

            }

            System.out.println(mapRelation.size() - 1);
        }
    }
}
