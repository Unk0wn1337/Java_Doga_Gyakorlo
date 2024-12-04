package hu.szamalk;

import hu.szamalk.model.Feladat;

public class Main {
    public static void main(String[] args) {

        Feladat f = new Feladat();
        f.bekeres();
        f.kiirLista();
        f.kiirTomb();
        f.amitTartalmaz();
        f.sorbaRendez();
        f.elofordulasSzamolas();
    }
}