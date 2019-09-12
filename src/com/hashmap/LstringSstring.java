package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LstringSstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] sa=s.split(" ");
        if (sa[0].length()>sa[1].length()){
            System.out.println(false);
            return;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i < sa[1].length(); i++) {
            char c=sa[1].charAt(i);
            if (hm.containsKey(c)){
                int temp=hm.get(c)+1;
                hm.put(c,temp);
            }
            else {
                hm.put(c,1);
            }
        }
        for (int i=0;i<sa[0].length();i++){
            char c=sa[0].charAt(i);
            if (hm.containsKey(c)&&hm.get(c)>0){
                int temp=hm.get(c)-1;
                hm.put(c,temp);
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
