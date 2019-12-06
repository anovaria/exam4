
package it.tss.exam4;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class NewMain {
    private ArrayList<Turista> elencoTuristi;
    private ArrayList<Noleggio> elencoNoleggi;
    public static ArrayList<Mezzo> elencoMezzi;
    Turista turista;
    Noleggio noleggio;

public static void main(String[] args) {
        GestioneNoleggi();
    }
    public static void GestioneNoleggi() {
        elencoMezzi = new ArrayList<Mezzo>();
        Mezzo mez = new Mezzo("scooter",10.00,70.00);
        elencoMezzi.add(mez);
        Mezzo mez1 = new Mezzo("auto",20.00,100.00);
        elencoMezzi.add(mez1);
        Mezzo mez2 = new Mezzo("furgone",40.00,150.00);
        elencoMezzi.add(mez2);

       System.out.println(getListaMezzi());
            }
    public static String getListaMezzi() {
        String ris = "";
            int i=0;
        for (Mezzo m : elencoMezzi) {
            i++;
            ris += i+ ") " +m.getModello() + ") - " + m.getPrezzoD() + " - "
                    + m.getPrezzoH() + "\n";
        }

        return ris;
    }
}
