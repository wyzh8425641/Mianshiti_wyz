package com.saimaCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class paixu {
    static int count=0;
    public static void main(String[] args) {

        List<Integer> s=new ArrayList<Integer>();
        List<Integer> rs=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            s.add(i);
        int[] A=new int[n-1];
        for (int i=0;i<n-1;i++){
            A[i]=sc.nextInt();
        }
        pl(s,rs,A);
        System.out.println(count%Integer.MAX_VALUE);
    }
    public static void pl(List<Integer> s,List<Integer> rs,int[] A){
        if(s.size()==1)
        {
            rs.add(s.get(0));
            if (flags(rs,A)){
                count++;
            }
            rs.remove(rs.size()-1);
        }else{

            for(int i=0;i<s.size();i++){

                rs.add(s.get(i));
                List<Integer> tmp=new ArrayList<Integer>();
                for(Integer a:s)
                    tmp.add(a);
                tmp.remove(i);
                pl(tmp,rs,A);
                rs.remove(rs.size()-1);

            }
        }
    }
    public static boolean flags(List<Integer> re,int[] A){
        boolean flag=true;
        for (int i=0;i<A.length;i++){
            if (A[i]==1){
                if (re.get(i)<=re.get(i+1)){
                    flag=false;
                }
            }
            else {
                if (re.get(i)>=re.get(i+1)){
                    flag=false;
                }
            }
        }
        return flag;
    }
}
