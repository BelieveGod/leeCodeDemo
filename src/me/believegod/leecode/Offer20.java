package me.believegod.leecode;

/**
 * @ClassName Offer20
 * @Description TODO
 * @Author believeGod
 * @Date 2020/9/2 9:03
 * @Version 1.0
 */
public class Offer20 {

    public boolean isNumber(String s) {
        return initState(0,s.trim());
    }

    private boolean initState(int index,final String s){
        if(index >= s.length()){
            return false;
        }
        char current=(char)s.charAt(index);
        if(current == '+' || current == '-'){
            return state1(index+1,s);
        }
        else if(current == '.'){
            return state8(index+1,s);
        }
        else if( isNum(current) ){
            return state2(index+1,s);
        }
        else{
            return false;
        }
    }

    private boolean state1(int index,final String s){
        if(index >= s.length()){
            return false;
        }
        char current=(char)s.charAt(index);
        if( isNum(current) ){
            return state2(index+1,s);
        }
        else if(current == '.'){
            return state8(index+1,s);
        }
        return false;
    }

    private boolean state2(int index,final String s){
        if(index >= s.length()){
            return true;
        }
        char current=(char)s.charAt(index);
        while(isNum(current)){
            index++;
            if(index >= s.length()){
                return true;
            }
            current=(char)s.charAt(index);
        }
        if(current == '.'){
            return state3(index+1,s);
        }
        else if( Character.toUpperCase(current) == 'E'){
            return state4(index+1,s);
        }
        return false;
    }

    private boolean state3(int index,final String s){
        if(index >= s.length()){
            return true;
        }
        char current=(char)s.charAt(index);
        if(isNum(current)){
            return state5(index+1,s);
        }
        else if(Character.toUpperCase(current) == 'E'){
            return state4(index+1,s);
        }
        return false;
    }

    private boolean state4(int index,final String s){
        if(index >= s.length()){
            return false;
        }
        char current=(char)s.charAt(index);
        if(current == '+' || current == '-'){
            return state6(index+1,s);
        }
        else if(isNum(current)){
            return state7(index+1,s);
        }
        return false;
    }


    private boolean state5(int index,final String s){
        if(index >= s.length()){
            return true;
        }
        char current=(char)s.charAt(index);
        while(isNum(current)){
            index++;
            if(index >= s.length()){
                return true;
            }
            current=(char)s.charAt(index);
        }
        if(Character.toUpperCase(current) == 'E'){
            return state4(index+1,s);
        }
        return false;
    }

    private boolean state6(int index,final String s){
        if(index >= s.length()){
            return false;
        }
        char current=(char)s.charAt(index);
        if(isNum(current)){
            return state7(index+1,s);
        }
        return false;
    }

    private boolean state7(int index,final String s){
        if(index >= s.length()){
            return true;
        }
        char current=(char)s.charAt(index);
        while(isNum(current)){
            index++;
            if(index >= s.length()){
                return true;
            }
            current=(char)s.charAt(index);
        }
        return false;
    }

    private boolean state8(int index,final String s){
        if(index >= s.length()){
            return false;
        }
        char current=(char)s.charAt(index);
        if(isNum(current)){
            return state5(index+1,s);
        }
        return false;
    }

    private boolean isNum(char c){
        if('0' <= c &&'9' >= c){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="46.e3";
        Offer20 offer20=new Offer20();
        System.out.println("offer20.isNumber(s) = " + offer20.isNumber(s));
    }
}
