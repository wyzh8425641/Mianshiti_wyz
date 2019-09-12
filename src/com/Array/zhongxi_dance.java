package com.Array;

import java.util.*;

public class zhongxi_dance {
    public static void main(String[] args) {
        int a=11;
        int b=10;
        int[] aa={1,1,2,3,4,5,5,7,6,9,10};
        int[] bb={11,12,12,4,5,6,7,18,19,20};
        int count=perfectDancers(a,b,aa,bb);
        System.out.println(count);
    }
    public static int perfectDancers(int countMorning,int countEvening,int[] morningList,int[] eveninList){
        Arrays.sort(morningList);
        Arrays.sort(eveninList);
        int i=0;
        int j=0;
        int count=0;
        while (i<countMorning&&j<countEvening){
            if (morningList[i]==morningList[j]){
                int temp=morningList[i];
                i++;
                j++;
                while (morningList[i]==temp){
                    i++;
                }while (eveninList[i]==temp){
                    j++;
                }
            }
            else if (morningList[i]<eveninList[j]){
                count++;
                i++;
            }
            else {
                count++;
                j++;
            }
        }
        return count;
    }
}
