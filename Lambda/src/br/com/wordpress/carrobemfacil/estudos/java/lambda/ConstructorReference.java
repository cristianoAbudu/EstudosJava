package br.com.wordpress.carrobemfacil.estudos.java.lambda;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class ConstructorReference {
	public static void main(String[] args) throws Exception{
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    
	    String[] dateArray = {"01/02/2003", "03/04/2004", "05/06/2007"};
	    
	    Stream<Date> dateStream = Arrays.asList(dateArray).stream().map(t -> {
			try {
				return formatter.parse(t);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		});
	    
	    dateStream.forEach(System.out::println);
	}
	
}
