package org.lessons.java.eventi;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire il titolo dell'evento: ");
        String titolo = scanner.nextLine();

        System.out.println("Inserire la data dell'evento(formato yyyy-mm-dd): ");
        String dataInput = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataInput);

        System.out.println("Inserire il numero totale di posti: ");
        int postiTotali = scanner.nextInt();

        Evento evento = new Evento(titolo, data, postiTotali);
        System.out.println("Hai creato l'evento: " + evento);



        scanner.close();
    }
}
