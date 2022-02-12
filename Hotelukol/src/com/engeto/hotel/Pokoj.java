package com.engeto.hotel;
public class Pokoj {
    private int cisloPokoje;
    private int pocetLuzek;
    private boolean jeBalkon;
    private boolean vyhledNaMore;
    private int cenaZaNoc;

    public Pokoj(int cisloPokoje, int pocetLuzek, boolean jeBalkon, boolean vyhledNaMore, int cenaVKc) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.jeBalkon = jeBalkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaZaNoc = cenaVKc;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isJeBalkon() {
        return jeBalkon;
    }

    public void setJeBalkon(boolean jeBalkon) {
        this.jeBalkon = jeBalkon;
    }

    public boolean isVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(boolean vyhledNaMore) {
        this.vyhledNaMore = vyhledNaMore;
    }

    public int getCenaZaNoc() {
        return cenaZaNoc;
    }

    public void setCenaZaNoc(int cenaZaNoc) {
        this.cenaZaNoc = cenaZaNoc;
    }
    public String getDecscription () {
        return "Číslo pokoje: "+ cisloPokoje + ", počet lůžek: " + pocetLuzek + ", balkón: "+ jeBalkon + ", výhled na moře: " + vyhledNaMore + ", cena za noc: " +cenaZaNoc + " Kč/noc.";
    }
}
