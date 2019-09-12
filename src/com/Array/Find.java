package com.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int first=0,end=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='['){
                first=i;
            }
            if (s.charAt(i)==']'){
                end=i;
            }
        }
        if ((end-first)==1){
            System.out.println(-1);
        }
        else {
            String[] a=s.substring(first+1,end).split(",");
            int[] array=new int[a.length];
            for (int i=0;i<array.length;i++){
                array[i]=Integer.parseInt(a[i]);
            }
            int n;
            if (end+2<s.length()){
                n=Integer.parseInt(s.substring(end+2,s.length()));
                int flag=-1;
                int[] aaa=new int[array.length];
                for (int i=0;i<array.length;i++){
                    aaa[i]=array[i];
                }
                Arrays.sort(array);
                int low=0;
                int high=array.length-1;
                while (low<=high){
                    int mid=(low+high)/2;
                    int temp=array[mid];
                    if (temp<n){
                        low=mid+1;
                    }
                    else if (temp>n)
                        high=mid-1;
                    else {
                        flag=array[mid];
                        break;
                    }

                }
                int flag1=-1;
                for (int i=0;i<aaa.length;i++){
                    if (flag==aaa[i]){
                        flag1=i;
                        break;
                    }
                }
                System.out.println(flag1);
            }else {
                System.out.println(-1);
            }

        }

    }
}
