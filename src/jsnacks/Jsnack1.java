package jsnacks;

//        Il software deve chiedere per 5 volte all’utente di inserire un numero.
//        Il programma stampa la somma di tutti i numeri inseriti.
//        Esegui questo programma in due versioni, con il for e con il while.

import java.util.Scanner;

public class Jsnack1 {
    public static void main(String[] args) {

        int somma=0;

        Scanner primo = new Scanner(System.in);

        for (int i = 0; i<5 ; i++) {
            System.out.println("Inserisci un numero: ");
            int numero = primo.nextInt();
            somma+= numero;
        }
        primo.close();
        System.out.println(somma);
    }
}
