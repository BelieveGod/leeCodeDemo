package me.believegod.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Demo78
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/20 16:41
 * @Version 1.0
 */
public class Demo78 {
    private List<Integer> t=new LinkedList<>();
    private List<List<Integer>> ans=new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return ans;
    }

    private void dfs(int cur,int[] nums){
        if(cur == nums.length){
            ans.add(new ArrayList<Integer>(t));
            return ;
        }


        dfs(cur+1,nums);
        t.add(nums[cur]);
        dfs(cur+1,nums);
        t.remove(t.size()-1);
    }

}
