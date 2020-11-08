package me.believegod.leecode;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Demo257
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/4 9:31
 * @Version 1.0
 */
public class Demo257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList();
        List<Integer> lt= new LinkedList();

        visit(root,list,lt);
        return list;


    }


    public  void  visit(TreeNode node,List<String> list, List<Integer> lt){
        if( node ==null){
            return;
        }

//            sb.append(node.val);
//            sb.append("->");
        lt.add(node.val);
        if( node.left != null ||  node.right !=null){
            if(node.left != null){
                visit(node.left,list,lt);
            }

            if(node.right !=null){
                visit(node.right,list,lt);
            }
        }
        else{
            ArrayList<Integer> result=new ArrayList<>(lt.size());
            result.addAll(lt);
            String s = transformToStringList(result);
            list.add(s);

        }

        lt.remove(lt.size()-1);


    }


    private String transformToStringList(List<Integer> result){
        StringBuilder sb= new StringBuilder();
        for(Integer val :result){
            sb.append(val);
            sb.append("->");
        }
        int length=sb.length();
        if(length>2) {
            sb.delete(length - 2, length);
        }
        return sb.toString();
    }


}

class TreeNode {
     int val;
     TreeNode left;TreeNode right;
     TreeNode(int x) { val = x; }
  }