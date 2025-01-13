package org.lessons.java.eventi;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Inserire il titolo dell'evento: ");
        String titolo = scanner.nextLine();

        System.out.println("Inserire la data dell'evento(formato yyyy-mm-dd): ");
        String dataInput = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataInput);

        System.out.println("Inserire il numero totale di posti: ");
        int postiTotali = scanner.nextInt();

        Evento evento = new Evento(titolo, data, postiTotali);
        System.out.println("Hai creato l'evento: " + evento);

        boolean avanti = true;
            while(avanti) {
                System.out.println("\n ***** MENU *****");
                System.out.println("1. Prenota un posto");
                System.out.println("2. Disdici prenotazione");
                System.out.println("3. Mostra info evento");
                System.out.println("4. ESCI");

                System.out.println("\n Scegli un opzione: ");
                int scelta = scanner.nextInt();

                switch (scelta) {
                    case 1:
                        System.out.println(evento.prenota());
                        break;
                    case 2:
                        System.out.println(evento.disdici());
                        break;

                    case 3: 
                        System.out.println("EVENTO: " + evento);
                        System.out.println("I posti totali per questo evento sono: " + evento.getPostiTotali());
                        System.out.println("I posti già prenotati per questo evento sono: " + evento.getPostiPrenotati());
                        int postiRimanenti = evento.getPostiTotali() - evento.getPostiPrenotati();
                        System.out.println("Per questo evento sono ancora disponibili " + postiRimanenti + " posti!");
                        break;
                    
                    case 4:
                        System.out.println("Arrivederci!");
                        avanti = false;
                        break;

                    default:
                        System.out.println("Scelta non valida. Inserisci un numero compreso tra 1 e 4");
                        break;
                }
            }
        } catch (Exception exception) {
            System.out.println("Errore: " + exception.getMessage());
        } finally {
            scanner.close();
        }

    }
}
