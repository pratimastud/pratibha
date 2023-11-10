package com;

import org.testng.annotations.Test;

public class Calculator {
	@Test
	public void sum()
	{
		int a=5;
		int b=6;
		int sum=a+b;
		System.out.println("Addition of two number is:"+sum);
	}
	@Test(priority=2)
	public void sub()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("Subtraction of two number is:"+sub);
	}

}




