package me.believegod.leecode;

import java.util.List;

/**
 * @ClassName Demo51
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/3 8:44
 * @Version 1.0
 */
public class Demo51 {

    public static void main(String[] args) {
        Demo51 demo51=new Demo51();
        List<List<String>> list = demo51.solveNQueens(8);

        int count=0;
        for(List<String> l1 : list){
            System.out.println("解法"+ (++count));
            for(String s:l1){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] map =new int[n][n];
        return null;

    }

    public boolean place(int row,final int n){
        if(row == n){
            return false;
        }

        for(int j=0;j<n;j++){
            if( check(row,j,n) ){
                place(row+1,n);

            }
        }
        return false;
    }

    public boolean check(int row,int col,final int n){
        // 检查列

        // 检查左上 -  右下


        // 检查左下 - 右上


        return false;
    }


}
