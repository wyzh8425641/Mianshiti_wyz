package com.hashmap;


import java.util.*;
import java.util.Map.Entry;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        Set str=new HashSet();
        String s1="hhh";
        String s2="888";
        String s3="hhh";
        str.add(s1);
        str.add(s2);
        str.add(s3);
        System.out.println(str);
        s3="ls";
        str.add(s3);
        System.out.println(str);

        hashMap.put("cn", "中国");
        hashMap.put("jp", "日本");
        hashMap.put("fr", "法国");
        hashMap.put("cn","zhongguo");

        System.out.println("cn:"+hashMap.get("cn"));

        System.out.println(hashMap);//cn=中国，日本，法国
        System.out.println("****");//****
        System.out.println("cn:" + hashMap.get("cn"));//cn:中国
        System.out.println(hashMap.containsKey("cn"));//true

        System.out.println(hashMap.keySet());//key值集合
        System.out.println(hashMap.isEmpty());//false

        hashMap.remove("cn");
        System.out.println(hashMap);//jp=日本，法国
        //采用keyset、Iterator遍历HashMap
        Iterator it = hashMap.keySet().iterator();
        while(it.hasNext()) {
            String key = (String)it.next();
            System.out.println("key1:" + key);
            System.out.println("value1:" + hashMap.get(key));
        }

        //遍历entryset、HashMap的另一个方法，更加高效
        Set<Entry<String, String>> sets = hashMap.entrySet();
        for(Entry<String, String> entry : sets) {
            System.out.print(entry.getKey() + ", ");
            System.out.println(entry.getValue());
        }
        //采用keyset进行hashmap遍历
        Iterator its=hashMap.entrySet().iterator();
        while (its.hasNext()){
            Map.Entry entry=(Map.Entry) its.next();
            Object key=entry.getKey();
            Object val=entry.getValue();
            System.out.println("key2"+key);
            System.out.println("value2"+val);
        }
    }
}
