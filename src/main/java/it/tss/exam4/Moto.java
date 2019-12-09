package it.tss.exam4;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package it.tss.exam4;

/**
 *
 * @author alex
 */
public class Moto extends Mezzo {

    private double costoAssGG;

    public Moto(String modello, Double prezzoH, Double prezzoD,double costoAssGG) {
        super(modello, prezzoH, prezzoD);
        this.costoAssGG = costoAssGG;
    }
   public static String costonoleggioGG(int numGG, ArrayList<Moto> elencoMoto, String modello, Double assGG) {
        String ris = "";
        int i = 0;
        for (Moto m : elencoMoto) {
            i++;
            if (m.modello.equals(modello)) {
                ris += "Costo per: " + modello + " - " + m.getPrezzoD() * numGG + "\n";
            }

        }
        return ris;
    }
    public double getCostoAssGG() {
        return costoAssGG;
    }

    public void setCostoAssGG(double costoAssGG) {
        this.costoAssGG = costoAssGG;
    }

}
