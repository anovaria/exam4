package it.tss.exam4;

import java.util.ArrayList;

public class Mezzo {

    public String modello;
    private Double prezzoH;
    private Double prezzoD;

    public Mezzo(String modello, Double prezzoH, Double prezzoD) {
        this.setModello(modello);
        this.setPrezzoH(prezzoH);
        this.setPrezzoD(prezzoD);

    }

    public static String getListaMezzi(ArrayList<Mezzo> elencoMezzi) {
        String ris = "";
        int i = 0;
        for (Mezzo m : elencoMezzi) {
            i++;
            ris += i + ") " + m.getModello() + ") - " + m.getPrezzoD() + " - "
                    + m.getPrezzoH() + "\n";
        }
        return ris;
    }

    public static String costonoleggioGG(int numGG, ArrayList<Mezzo> elencoMezzi) {
        String ris = "";
        int i = 0;
        for (Mezzo m : elencoMezzi) {
            i++;
            ris += i + ")costo per: " + m.getModello() + " - " + m.getPrezzoD() * numGG + "\n";
        }
        return ris;
    }

    public static String costonoleggioGG(int numGG, ArrayList<Mezzo> elencoMezzi, String modello) {
        String ris = "";
        int i = 0;
        for (Mezzo m : elencoMezzi) {
            i++;
            if (m.modello.equals(modello)) {
                ris += "Costo per: " + modello + " - " + m.getPrezzoD() * numGG + "\n";
            }

        }
        return ris;
    }

 
    
    public String getModello() {
        return modello;
    }

    private void setModello(String modello) {
        this.modello = modello;
    }

    public Double getPrezzoH() {
        return prezzoH;
    }

    private void setPrezzoH(Double prezzoH) {
        this.prezzoH = prezzoH;
    }

    public Double getPrezzoD() {
        return prezzoD;
    }

    private void setPrezzoD(Double prezzoD) {
        this.prezzoD = prezzoD;
    }
}
