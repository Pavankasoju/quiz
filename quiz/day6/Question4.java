package com.capgemini.quiz.day6;

class Z {
    int width;
    int height;
    int length;
    int volume;
    public Z() {
        width = 5;
        height = 5;
        length = 6;
    }
    void volume() {
         volume = width*height*length;
    } 
}    
public class Question4 {
    public static void main(String args[])
    {
        Z obj = new Z();
        obj.volume();
        System.out.println(obj.volume);
    }
}
