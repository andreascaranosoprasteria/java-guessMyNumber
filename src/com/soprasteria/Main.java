package com.soprasteria;
import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 * Esercizio: indovina il numero Nome repo: java-guessMyNumber Scrivere un
	 * programma che genera un numero casuale (senza visualizzarlo) e chiede
	 * all'utente di indovinarlo. Dopo ogni tentativo dell'utente il programma deve
	 * indicare se il numero generato è maggiore o minore di quello inserito
	 * dall'utente. Il programma termina quando l'utente indovina, nel qual caso
	 * mostra anche il numero di tentativi effettuati
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random r = new Random();
		int cont = 0;
		int number = r.nextInt(11); // Generazione numero casuale
		System.out.println("DEBUG: generato " + number);
		int user;

		do {
			System.out.println("Risposta utente:");
			user = sc.nextInt();
			cont++;
			if (user > number)
				System.out.println("Il numero da te inserito è > di quello generato.");
			else
				System.out.println("Il numero da te inserito è < di quello generato.");
		} while (user != number);
		System.out.println("Risposta esatta, tentativi effettuati: " + cont);

	}

}
