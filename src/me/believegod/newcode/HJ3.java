package me.believegod.newcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName HJ3
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/16 11:06
 * @Version 1.0
 */
public class HJ3 {

    private final static int MAX=1000;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] studentNos=new int[MAX];
        Arrays.fill(studentNos,0);
        while(sc.hasNextLine()){
            int n = Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                int number = Integer.parseInt(sc.nextLine());
                if(studentNos[number] == 0){
                    studentNos[number]=1;
                }
            }
        }

       for(int i=0;i<MAX;i++){
           if(studentNos[i]==1){
               System.out.println(i);
           }
       }

    }
}
