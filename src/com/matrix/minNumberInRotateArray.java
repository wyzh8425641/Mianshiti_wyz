package com.matrix;

public class minNumberInRotateArray {
    public static void main(String[] args) {
        int[] array={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
    public static int minNumberInRotateArray(int[] array){
        if (array==null||array.length==0){
            return 0;
        }
        int low=0;
        int high=array.length-1;
        int mid=low;
        while (array[low]>=array[high]){
            if (array[low]==array[high]){
                for (int i=low;i<array.length;i++){
                    if (array[i]!=array[low]){
                        low=i-1;
                        break;
                    }
                }
                for (int j=high;j>0;j--){
                    if (array[j]!=array[high]){
                        high=j+1;
                        break;
                    }
                }
            }
            if ((high-low)==1){
                mid=high;
                break;
            }
            mid=(low+high)/2;
            if (array[mid]>=array[low]){
                low=mid;
            }
            else if (array[mid]<=array[high]){
                high=mid;
            }
        }
        return array[mid];
    }
}
