package me.believegod.leecode;

/**
 * @ClassName Demo486
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/1 20:02
 * @Version 1.0
 */
public class Demo486 {

    private int[] arr=null;
    private int[][] cache=null;
    public boolean PredictTheWinner(int[] nums) {
        if(nums.length%2 == 0){
            return true;
        }
        arr=nums;
        initCache(nums.length);
        int gamer1= dfs(0,nums.length-1);
        int total=total();
        return gamer1<<1 >= total? true:false;

    }

    public int dfs(int start,int end){
        if(cache[start][end]>=0){
            return cache[start][end];
        }

        int result=-1;

        if(end<start){
            throw new RuntimeException("下界小于上界");
        }
        else if(start == end){
            result= arr[start];
        }
        else if(start+1 == end){
            result= Math.max(arr[start],arr[end]);
        }

        else{
            result= Math.max(arr[start]+Math.min( dfs(start+2,end),dfs(start+1,end-1) ),
                    arr[end]+Math.min( dfs(start,end-2) , dfs(start+1,end-1) ));
        }
        // 缓存
        cache[start][end]=result;
        return result;
    }

    private void initCache(int length){
        cache =new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                cache[i][j]=-1;
            }
        }

    }

    private int total(){
        int sum=0;
        for(int temp: arr){
            sum+=temp;
        }
        return sum;
    }
}
