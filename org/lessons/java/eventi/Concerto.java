package org.lessons.java.eventi;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento {
    private LocalTime ora;
    private double prezzo;

    public Concerto( String titolo, LocalDate data, int postiTotali, LocalTime ora, double prezzo){
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    public LocalTime getOra(){
        return ora;
    }

    public void setOra(LocalTime ora){
        this.ora = ora;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    //date formatter getter method
    public String getDateTimeString(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        return getData().format(dateFormatter) + " " + getOra().format(timeFormatter);
    }

    //price formatter getter method
    public String getFormattedPrice(){
        return String.format(Locale.ITALY, "%.2f€", prezzo);
    }

    @Override
    public String toString(){
        return getDateTimeString() + " " + getTitolo() + " " + getFormattedPrice();
    }
}
