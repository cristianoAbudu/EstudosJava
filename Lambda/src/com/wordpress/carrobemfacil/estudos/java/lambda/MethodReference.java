package com.wordpress.carrobemfacil.estudos.java.lambda;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class MethodReference {
	public static void main(String[] args) throws Exception{
	   String [] words = {"John", "Mary", "Jesus"};
		Arrays.sort(
		    words, 
		    String::compareToIgnoreCase
		);
		for(String word : words){
	        System.out.println(word);
		} 
	}
	
}
