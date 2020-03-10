package com.capgemini.quiz.day6;

class S {
    Integer x;
    Integer y;
    boolean isequal() {
        return(x == y);  
    } 
}    
public class Question5 {
    public static void main(String args[])
    {
        S obj = new S();
        obj.x = 5;
        obj.y = 5;
        System.out.println(obj.isequal());        } 
}
