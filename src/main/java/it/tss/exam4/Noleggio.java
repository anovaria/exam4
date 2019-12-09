
package it.tss.exam4;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Noleggio {
    
    private Mezzo mezzo;
    private Turista turista;
    private int numGG;

    public Noleggio(Mezzo mezzo, Turista turista, int numGG) {
        this.mezzo = mezzo;
        this.turista = turista;
        this.numGG = numGG;
    }
    
    public static String reportNoleggioMezzo(ArrayList<Noleggio> elencoNoleggi) {
        String ris = "";
        int i = 0;
        Double prezzo;
        for (Noleggio n : elencoNoleggi) {
            i++;
            prezzo= n.mezzo.getPrezzoD();         
            ris += i + ") " + n.mezzo.getModello() + ") - " + n.turista.getNome() + " - Costo: "
                    + (int)Math.round(prezzo)* n.numGG + "€\n";
        }

        return ris;
    }
    
}
