package com.saimaCode;

import java.util.Scanner;

public class zhengchao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int r = -1;
        int l = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                r = i;
                break;
            }
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'L') {
                l = i;
                break;
            }
        }

        if (r == -1||l == -1) {
            System.out.println(chars.length);
        }else if (r>l) {
            System.out.println(chars.length);
        }else {
            System.out.println(chars.length - (l - r));
        }
    }
}
