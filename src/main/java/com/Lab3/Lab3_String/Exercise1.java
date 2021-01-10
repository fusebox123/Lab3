/**
 * String exercise 1 
 * Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers. 
 * @author Joel
 * 
 */
package com.Lab3.Lab3_String;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		
	  int number;
      int sum=0;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter integers(with space):");
      String str=sc.nextLine();
      
      StringTokenizer s=new StringTokenizer(str, " ");
      while(s.hasMoreTokens()) {
    	  
    	  String temp=s.nextToken();
    	  number=Integer.parseInt(temp);
          sum=sum+number;
      }
      System.out.println("Sum is:"+sum);
      sc.close();
	}

}