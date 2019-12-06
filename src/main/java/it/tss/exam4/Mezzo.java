
package it.tss.exam4;

import java.util.ArrayList;

/**
 *
 * @author tss
 */

public class Mezzo {
    private String modello;
    private Double prezzoH;
    private Double prezzoD;
    
    public Mezzo(String modello, Double prezzoH, Double prezzoD) {
        this.setModello(modello);
        this.setPrezzoH(prezzoH);
        this.setPrezzoD(prezzoD);
        
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
