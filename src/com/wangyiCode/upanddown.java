package com.wangyiCode;

import java.util.Scanner;

public class upanddown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int min=0,max=n-1,sum=0;
        for (int i=0;i<n;i++){
            if (arr[i]>=arr[i+1]){
                min=i;
                break;
            }
        }
        int maxnum=Integer.MIN_VALUE;
        for (int i = min+1; i <n ; i++) {
            if (arr[i]>maxnum){
                maxnum=arr[i];
                max=i;
            }
        }
        while ((max-min)>1){
            sum+=(arr[min]+1-arr[min+1]);
            arr[min+1]=arr[min]+1;

            sum+=(arr[max]+1-arr[max-1]);
            arr[max-1]=arr[max]+1;

            min++;
            max--;
//            if (arr[min]==arr[max]&&(max-min)==3){
//                sum+=(arr[min]+1-arr[min+1]);
//                break;
//            }
            if ((max-min)==2){
                int temp=Math.max(arr[max],arr[min]);
                sum+=(temp-arr[max-1]);
                break;
            }
            if (arr[max]==arr[min]&&(max-min)==1){
                sum+=1;
                break;
            }

        }
        System.out.println(sum);
    }
}
