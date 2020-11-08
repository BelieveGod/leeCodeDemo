package me.believegod.newcode;

import java.util.Scanner;

/**
 * @ClassName HJ6
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/16 11:52
 * @Version 1.0
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long number = sc.nextLong();

        for(int i=2;i<=number;i++){
            while(number % i == 0){
                System.out.print(i+" ");
                number/=i;
            }
        }
    }
}
