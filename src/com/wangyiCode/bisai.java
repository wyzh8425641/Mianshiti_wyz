package com.wangyiCode;

import java.util.*;

public class bisai{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] w=new int[N];
        for(int i=0;i<N;i++)
        {
            w[i]=sc.nextInt();
        }
        Arrays.sort(w);
        int count=0;
        for(int i=0;i<N;i++)
        {
            for(int j=N-1;j>i;j--)
            {
                if(w[i]>=w[j]*0.9){
                    count=count+(j-i);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}