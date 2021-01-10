package com.Lab3.Lab3_String;

public class Exercise8{
	
	public String getSort(String[] str){
		if(isEmpty(str)) {
			return null;
		}
		else{
			boolean check=false;
			String str1=str[0];
			for(int i=0;i<str1.length()-1;i++) {
				if(str1.charAt(i)<str1.charAt(i+1)) {
					check= true;
				}
				else {
					check=false;
					break;
				}
			}
			if(check==true ) {
				return "positive string";
			}
			else{
				return "negative string";
			}
		}
	}

	private boolean isEmpty(String[] str) {
		
		return str.length==0;
	}
}




