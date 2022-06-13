package jsnacks;

import java.util.Scanner;

public class JSnack5 {

    public static void main(String[] args) {

        Scanner parole = new Scanner(System.in);

        System.out.println("Inserisci due parole della stessa lunghezza:");

        String prima = parole.nextLine();
        String seconda = parole.nextLine();

        parole.close();

        char[] parola1= prima.toCharArray();
        char[] parola2= seconda.toCharArray();

        if (parola1.length== parola2.length) {
            for (int i = 0; i < parola1.length; i++) {
                if (parola1[i]!=parola2[i]) {
                    if (i==0) {
                        System.out.print("Lettera diversa in posizione: " + (i + 1));
                    } else System.out.print(" - "+(i+1));
                }
            }
        } else System.out.println("Le parole non hanno la stessa lunghezza.");
    }
}
