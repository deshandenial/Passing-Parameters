package com.passing_param;

public class PassingParameter2 
{
	static String s1 = "denial";
	static String s2 = "deshan";
	
public static void main(String[] args) 
{
	
	System.out.println("Before swipping the text S1 :" +s1 + " S2 :" +s2);
	
	swiptext(s1,s2);
}

public static void swiptext(String name1, String name2)
{
	String name3 = name1;
		   name1 = name2;
		   name2 = name3;
		   
		   System.out.println("After swipping text S1 :" +name1 +  " S2 : "+name2);
}
}
