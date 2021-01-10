package com.Lab3.Lab3_String;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Exercise8Test{
	  private Exercise8 positiveString;

	  @Before
	  public void setup(){
		  positiveString =new Exercise8();
	  }
	      @Test
	  public void test_getString_Is_GivenEmpty_ShouldReturn_Empty_String(){
	      String str[]= {};
	      String result= positiveString.getSort(str);
	  	  assertEquals(null,result);

	  }
	      @Test
	  public void test_getString_Is_GivenPositiveString_ShouldCheck_Positive_String(){
	      String str[]= {"abc"};
	      String result= positiveString.getSort(str);
	      assertEquals("positive string",result);

	  }
	      @Test
	  public void test_getString_Is_GivenNegativeString_ShouldCheck_Negative_String(){
	      String str[]= {"acdec"};
	      String result= positiveString.getSort(str);
	      assertEquals("negative string",result);

	  }

	     
}
