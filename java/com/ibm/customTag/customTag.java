package com.ibm.customTag;

public class customTag {

	public static String getCharacter(int count){
		return String.valueOf((char)(64+count));
	}
	
	public static void main(String[] args) {
		System.out.println(getCharacter(1));
		System.out.println(getCharacter(2));
		System.out.println(getCharacter(3));
		System.out.println(getCharacter(4));
	}
	
	
}
