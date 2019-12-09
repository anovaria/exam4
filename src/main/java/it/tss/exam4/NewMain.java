package it.tss.exam4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class NewMain {

    private static ArrayList<Turista> elencoTuristi;
    private static ArrayList<Noleggio> elencoNoleggi;
    private static ArrayList<Mezzo> elencoMezzi;
    private static ArrayList<Moto> elencoMoto;
    private static ArrayList<Bici> elencoBici;
    private static int GG;
    private static Double Ass;

    public static void main(String[] args) {
        GestioneNoleggi();
    }

    public static void GestioneNoleggi() {
        //Carico i dati
        elencoMezzi = new ArrayList<Mezzo>();
        Mezzo mez = new Mezzo("scooter", 10.00, 70.00);
        elencoMezzi.add(mez);
        Mezzo mez1 = new Mezzo("auto", 20.00, 100.00);
        elencoMezzi.add(mez1);
        Mezzo mez2 = new Mezzo("furgone", 40.00, 150.00);
        elencoMezzi.add(mez2);
        
        elencoMoto=new ArrayList<Moto>();
        Moto mot1 = new Moto("Dcati", 10.00, 70.00,2.00);
        elencoMoto.add(mot1);
        Moto mot2 = new Moto("Aprilia", 20.00, 80.00,3.00);
        elencoMoto.add(mot2);
        Moto mot3 = new Moto("BMW", 30.00, 90.00,4.00);
        elencoMoto.add(mot3);
        
        elencoBici=new ArrayList<Bici>();
        Bici Bici1 = new Bici("graziella", 3.00, 10.00);
        elencoBici.add(Bici1);
        Bici Bici2 = new Bici("MTB", 10.00, 25.00);
        elencoBici.add(Bici2);
        Bici Bici3 = new Bici("pedalata-assist", 20.00, 40.00);
        elencoBici.add(Bici3);
        
        elencoTuristi=new ArrayList<Turista>();
        Turista tur =new Turista("alex", "ciao", "novaria", "Alessandro", 1965, 1111111111);
         elencoTuristi.add(tur);
        Turista tur1 =new Turista("rrr", "ggg", "hgffgh", "sghgfsfgh", 1965, 1111111111);
         elencoTuristi.add(tur1);
        Turista tur2 =new Turista("vvv", "vvvvv", "gfds", "gggggggg", 1965, 1111111111);
        elencoTuristi.add(tur2);
        
        //chiedo numero di giorni noleggio
        GG = Integer.parseInt(JOptionPane.showInputDialog("dimmi i giorni"));
        
        //creo i noleggi
        elencoNoleggi=new ArrayList<Noleggio>();
        Noleggio nol= new Noleggio(mez, tur, GG);
        Noleggio nol1= new Noleggio(mez1, tur1, GG);
        Noleggio nol2= new Noleggio(mez2, tur2, GG);
        elencoNoleggi.add(nol);
        elencoNoleggi.add(nol1);
        elencoNoleggi.add(nol2);
        
        //stampo elenco mezzi
        System.out.println(Mezzo.getListaMezzi(elencoMezzi));
        //stampo costo giornaliero mezzi
        System.out.println(Mezzo.costonoleggioGG(GG,elencoMezzi));
        //stampo elenco turisti
        System.out.println(Turista.getListaTuristi(elencoTuristi));
        //stampo elenco noleggi
        System.out.println(Noleggio.reportNoleggioMezzo(elencoNoleggi));
        //stampo costo noleggi mezzi
        System.out.println(Mezzo.costonoleggioGG(GG,elencoMezzi,mez.getModello()));
        System.out.println(Mezzo.costonoleggioGG(GG,elencoMezzi,mez1.getModello()));
        System.out.println(Mezzo.costonoleggioGG(GG,elencoMezzi,mez2.getModello()));
        
        //stampo costo noleggi moto
        System.out.println(Moto.costonoleggioGG(GG,elencoMoto,mot1.getModello(),mot1.getCostoAssGG()));
        System.out.println(Moto.costonoleggioGG(GG,elencoMoto,mot2.getModello(),mot2.getCostoAssGG()));
        System.out.println(Moto.costonoleggioGG(GG,elencoMoto,mot3.getModello(),mot3.getCostoAssGG()));
    }

}
