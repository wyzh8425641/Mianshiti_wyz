package com.wangyiCode;

public class zuixiaosubstr {
    public static void main(String[] args) {
        String s="ababab";
        System.out.println(zuixiaosubstr(s));
    }
    public static int zuixiaosubstr(String s){
        for (int i=1;i<s.length();i++){
            if (s.length()%i==0){
                int j=i;
                boolean flag=true;
                while (j<s.length()){
                    String a=s.substring(j-i,j);
                    String b=s.substring(j,j+i);
                    if (a.equals(b)){
                        j+=i;
                    }
                    else {
                        flag = false;
                        break;
                    }

                }
                if (flag==true)
                    return i;
            }
        }
        return 0;
    }
}
