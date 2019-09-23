package com.wordpress.carrobemfacil.estudos.java.lambda;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class LambdaCompleta {
	public static void main(String[] args) throws Exception{
	    String [] words = {"John", "Mary", "Jesus"};
		Arrays.sort(
		    words, 
		    (primeiro, segundo) -> {
		        System.out.println(primeiro + " " + segundo);
		        return primeiro.length() - segundo.length() ;
		    }   
		);
		for(String word : words){
	        System.out.println(word);
		}
	}
}
