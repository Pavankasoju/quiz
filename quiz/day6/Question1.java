package com.capgemini.quiz.day6;

public class Question1 {
	  int m_x, m_y;
	   
	  public Question1(int x, int y) { m_x = x; m_y = y; }
	  public Question1() { this(10, 10); }
	  public int getX() { return m_x; }
	  public int getY() { return m_y; }
	   
	  public static void main(String args[]) {
	    Question1 p = new Question1();
	    System.out.println(p.getX());
	  }
	} 