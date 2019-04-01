package com.test.Junitexample;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int squareroot(int[] js) {
		
	double squareroot = js[0];
	int squareroot1=0;
	   for (int i =0;i<js.length;i++)
	   {
		    squareroot1 = (int) Math.sqrt(squareroot);
	   }
	   return squareroot1;
	}
}
