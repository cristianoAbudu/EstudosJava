package br.com.wordpress.carrobemfacil.estudos.java.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Ordenacao {
	public static void main(String[] args) throws Exception{
		
		class Carro {
			String marca ;
			String modelo;
			public Carro(String marca, String modelo) {
				super();
				this.marca = marca;
				this.modelo = modelo;
			}
			public String getMarca() {
				return marca;
			}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			public String getModelo() {
				return modelo;
			}
			public void setModelo(String modelo) {
				this.modelo = modelo;
			}
		}
		
		Carro[] carroArray = {
			new Carro("VW", "Fox"),
			new Carro("Chery", "Tiggo"),
			new Carro("VW", "Brasilia"),
		};
		
		Arrays.sort(carroArray, Comparator.comparing(Carro::getMarca).thenComparing(Carro::getModelo));
		
		Arrays.asList(carroArray).stream().forEach(carro -> System.out.println(carro.getMarca() + " " + carro.getModelo()));
	}
}
