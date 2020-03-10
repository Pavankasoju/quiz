package com.capgemini.quiz.day6;

final class A  {
    private  double re,  im;
    public A(double re, double im) {
        this.re = re;
        this.im = im;
    }
    A(Question2 c)
    {
      System.out.println("Copy constructor called");
      re = c.re;
      im = c.im;
    }            
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }            
}
public class Question2 {
    public static void main(String[] args) {
        A c1 = new A(10, 15);
        A c2 = new A(c1);    
        A c3 = c1;  
        System.out.println(c2);
    }
}
