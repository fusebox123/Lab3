/**
 * Create a method that accepts a number and modifies it such that the each of the digit
 *  in the newly formed number is equal to the difference between two consecutive digits 
 *  in the original number. The digit in the units place can be left as it is.
 *  @author Joel
 */
package com.Lab3.Lab3_String;

public class Exercise4 {
	public static void main(String[] args) {
		
		int num=89;
		String str = Integer.toString(num);
		System.out.println(modifyNumber(str));
	}
	public static int modifyNumber(String str) {
		
		int diff=0;
		for(int i=0;i<str.length()-1;i++)
		{
		  char c =str.charAt(i);
		  int num1=Character.getNumericValue(c);
		  char ch=str.charAt(i+1);
		  int num2=Character.getNumericValue(ch);
		  diff=Math.abs(num1-num2);
		}
		return diff; 
		
	}
}


