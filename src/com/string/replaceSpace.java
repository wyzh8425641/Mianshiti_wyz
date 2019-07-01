package com.string;

public class replaceSpace {
    public static String replaceSpace(StringBuffer str){
        StringBuffer s=new StringBuffer();
        int n=str.length(),i=0;
        while (i<n){
            if(str.charAt(i)==' '){
                s.append("%20");
            }
            else {
                s.append(str.charAt(i));
            }
            i++;
        }
        return s.toString();
    }
}
