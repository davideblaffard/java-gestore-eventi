package org.lessons.java.eventi;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Prova {
    public static void prova(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evento evento = null;

        while (true) {
            System.out.println("\n*** Gestione Eventi ***");
            System.out.println("1. Crea un evento");
            System.out.println("2. Prenota un posto");
            System.out.println("3. Disdici un posto");
            System.out.println("4. Mostra dettagli dell'evento");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {
                case 1: 
                    try {
                        System.out.print("Inserisci il titolo: ");
                        String titolo = scanner.nextLine();

                        System.out.print("Inserisci la data (yyyy-MM-dd): ");
                        LocalDate data = LocalDate.parse(scanner.nextLine());

                        System.out.print("Inserisci il numero totale di posti: ");
                        int postiTotali = Integer.parseInt(scanner.nextLine());

                        evento = new Evento(titolo, data, postiTotali);
                        System.out.println("Evento creato con successo!");

                        System.out.print("Questo evento è un concerto? (S/N): ");
                        String isConcerto = scanner.nextLine().toUpperCase();

                        if ("S".equals(isConcerto)) {
                            System.out.print("Inserisci l'ora del concerto (HH:mm): ");
                            LocalTime ora = LocalTime.parse(scanner.nextLine());

                            System.out.print("Inserisci il prezzo del biglietto: ");
                            double prezzo = Double.parseDouble(scanner.nextLine());

                            evento = new Concerto(titolo, data, postiTotali, ora, prezzo);
                            System.out.println("Concerto creato con successo!");
                        }
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;
            
                    case 2: 
                    if (evento != null) {
                        try {
                            evento.prenota();
                            System.out.println("Prenotazione effettuata con successo!");
                        } catch (Exception e) {
                            System.out.println("Errore: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Nessun evento o concerto creato.");
                    }
                    break;
                }    
            }
        }