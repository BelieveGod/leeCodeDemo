package me.believegod.newcode;

import java.util.Scanner;

/**
 * @ClassName HJ2
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/16 9:38
 * @Version 1.0
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        char c= sc.nextLine().toLowerCase().charAt(0);

        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c ){
                count++;
            }
        }

        System.out.println(count);
    }
}
