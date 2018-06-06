package com.kodilla;

import java.lang.*;


class EuclideanAlgorithm
{
	public void algorithm(int a, int b)
	{
		int numberA = a;
		int numberB = b;
		int modulo = 0;
		
		while(numberA % numberB != 0)
		{
			modulo = numberA % numberB;
			numberA = numberB;
			numberB = modulo;
		}
		
		System.out.println("The greatest common divisor of: " + a + " and " + b + " is: " + numberB + "!!!");
	}
}


class Application
{
	public static void main(String[] args)
	{
		EuclideanAlgorithm objEuclideanAlgorithm = new EuclideanAlgorithm();
		
		objEuclideanAlgorithm.algorithm(1524123196, 7624);
	}
}