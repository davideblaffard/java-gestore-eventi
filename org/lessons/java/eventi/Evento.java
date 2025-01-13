package org.lessons.java.eventi;

import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private final int postiTotali;
    private int postiPrenotati;

    public Evento(String titolo, LocalDate data, int postiTotali) {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("evento is frnut");
        }
        if (postiTotali <= 0) {
            throw new IllegalArgumentException("Non puoi sederti per terra");
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

    public String prenota(){
        if (data.isBefore(LocalDate.now())){
            return "Not possible! Event is frnut";
        }
        if (postiPrenotati>=postiTotali){
            return "Not possible! Stamm chin";
        }
        postiPrenotati ++;
            return "ok, hai prenotato un posto";
    }

    public String disdici(){
        if (data.isBefore(LocalDate.now())){
            return "Not possible! Event is frnut";
        }
        if (postiPrenotati == 0){
            return "Non c'è nessun posto prenotato, impossibile disdire";
        }
        postiPrenotati --;
            return "Ok, hai disdito un posto";
    }
    
}
