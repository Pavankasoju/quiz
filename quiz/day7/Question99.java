package com.capgemini.quiz.day7;

public class Question99{

public static double mystery(int[] arr)
{
   double output = 0;
   for (int i = 0; i < arr.length; i++)
   {
      output = output + arr[i];
   }
   return output / arr.length;
}
}
