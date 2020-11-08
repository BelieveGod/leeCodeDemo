package me.believegod.newcode;

import java.util.Scanner;

/**
 * @ClassName HJ1
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/16 9:26
 * @Version 1.0
 */
public class HJ1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            System.out.println(arr[arr.length-1].length());
//        }
    }
}
