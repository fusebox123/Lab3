/**
 *  Create a class containing a method to create the mirror image of a String. 
 * 	The method should return the two Strings separated with a pipe(|) symbol .
 * 
 * @author Joel
 *
 */

package com.Lab3.Lab3_String;


public class Exercise2 {
	
	public static void main(String[] args) {
		

		String str="HELLO";
		getResult(str);
	}
	
	public static void getResult(String str) {
		
		StringBuffer s = new StringBuffer(str);
		s.append('|');
		StringBuffer st = new StringBuffer(str);
		st.reverse();
		s.append(st);
		String result = s.toString();
		System.out.println(result);
	}

}
