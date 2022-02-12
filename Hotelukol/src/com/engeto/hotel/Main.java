package com.engeto.hotel;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
    Host Adela = new Host("Adéla", "Malíková", LocalDate.of(1993, 3,13));
    Host Jan = new Host("Jan", "Dvořáček", LocalDate.of(1995, 5,5));
        System.out.println(Adela.getDescription());
        System.out.println(Jan.getDescription());

    Pokoj pokoj1 = new Pokoj(1, 1, true, true, 1000);
    Pokoj pokoj2 = new Pokoj(2,1,true,true, 1000);
    Pokoj pokoj3 = new Pokoj(3,3,false,true,2400);
        System.out.println(pokoj1.getDecscription());
        System.out.println(pokoj2.getDecscription());
        System.out.println(pokoj3.getDecscription());


    }
}
