
package it.tss.exam4;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Turista {
    private String usr;
    private String psw;
    private String cogn;
    private String nome;
    private Integer anno;
    private Integer tel;

    public Turista(String usr, String psw, String cogn, String nome, Integer anno, Integer tel) {
        this.usr = usr;
        this.psw = psw;
        this.cogn = cogn;
        this.nome = nome;
        this.anno = anno;
        this.tel = tel;
    }
public static String getListaTuristi(ArrayList<Turista> elencoTuristi) {
        String ris = "";
        int i = 0;
        for (Turista t : elencoTuristi) {
            i++;
            ris += i + ") " + t.getUsr() + ") - " + t.getCogn() + " - "
                    + t.getNome()+ " - "
                    +t.getPsw()+ " - "
                    +t.getAnno() + " - "
                    +t.getTel()+ "\n";
        }

        return ris;
    }
    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getCogn() {
        return cogn;
    }

    public void setCogn(String cogn) {
        this.cogn = cogn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }
    
}
