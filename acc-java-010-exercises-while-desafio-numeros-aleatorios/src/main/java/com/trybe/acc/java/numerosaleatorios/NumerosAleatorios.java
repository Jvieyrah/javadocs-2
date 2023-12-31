package com.trybe.acc.java.numerosaleatorios;

import java.util.Random;

public class NumerosAleatorios {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    // Seu código vai aqui
	  int Numero = 0;
	  boolean stop = false;
	  
	  while (!stop) {
		  Numero = numeroAleatorio();
		  imprime(Numero);
		  if (Numero == 4) {
			  stop = true;
		  }		  
	  }
	  
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(int numero) {
    System.out.println(numero);
  }

  // Chame a função escrevendo `numeroAleatorio()`.
  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
}
