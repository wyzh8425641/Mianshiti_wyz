package com.saimaCode;

import java.util.HashMap;
import java.util.Scanner;

public class Eluosifangkuai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<m;i++){
            int c=sc.nextInt();
            if (hm.containsKey(c)){
                int count=hm.get(c)+1;
                hm.put(c,count);
            }
            else
            {
                hm.put(c,1);
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i=1;i<=n;i++){
            if (!hm.containsKey(i))
                min=0;
            else {
                if (min>hm.get(i))
                    min=hm.get(i);
            }

        }
        System.out.println(min);
    }
}
