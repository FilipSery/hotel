package com.engeto.hotel;
import java.util.ArrayList;
import java.time.LocalDate;

public class booking {
        ArrayList<Host> hoste = new ArrayList<>();
        private Pokoj cisloPokoje;
        private LocalDate datumPrijezdu;
        private LocalDate datumeOdjezdu;
        private TypeOfStay typPrijezdu;

        public booking(ArrayList<Host> hoste, Pokoj cisloPokoje, LocalDate datumPrijezdu, LocalDate datumeOdjezdu, TypeOfStay typPrijezdu) {
            this.hoste = hoste;
            this.cisloPokoje = cisloPokoje;
            this.datumPrijezdu = datumPrijezdu;
            this.datumeOdjezdu = datumeOdjezdu;
            this.typPrijezdu = typPrijezdu;

    }
}
