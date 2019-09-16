package com.passing_param;

public class PassingParamters 
{
	
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ;
		System.out.println("Before swipping : a = "+a + " b = " + b );
		swapFunction(a,b);
	}

	public static void swapFunction(int n1, int n2) 
	{
		int n3 = n1;
			n1 = n2;
			n2 = n3;

			System.out.println("After swipping, a = " + n1 + " b = " + n2);
	}

}
