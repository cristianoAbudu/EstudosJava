package br.com.wordpress.carrobemfacil.estudos.java.lambda;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class ReferenceCopy {
	public static void main(String[] args) throws Exception{
		String buda = "bumbum";
		printMessage(buda);
		buda = "babababa";
	}
	public static void printMessage(String message) {
		ActionListener listener = event -> {
			System.out.println(message);
		};
		
		new javax.swing.Timer(1000, listener).start();
	}
}
