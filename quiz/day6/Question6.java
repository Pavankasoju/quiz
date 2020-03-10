package com.capgemini.quiz.day6;

class G {
    int width;
    int length;
    int area;
    public G(int width, int length) {
        this.width = width;
        this.length = length;
    }

}    
public class Question6 {
    public static void main(String args[])
    {
        G obj = new G(5 , 6);
        System.out.println(obj.length + " " + obj.width);        
    } 
}
