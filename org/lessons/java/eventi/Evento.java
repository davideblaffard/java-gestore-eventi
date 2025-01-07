package org.lessons.java.eventi;

import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private final int postiTotali;
    private int postiPrenotati;

    public Evento(String titolo, LocalDate data, int postiTotali) {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data dell'evento non può essere nel passato.");
        }
        if (postiTotali <= 0) {
            throw new IllegalArgumentException("Il numero di posti totali deve essere positivo.");
        }

        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        if(data.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("evento is frnut");
        }
        this.data = data;
    }

    public int getPostiTotali(){
        return postiTotali;
    }

    public int getPostiPrenotati(){
        return postiPrenotati;
    }

}
