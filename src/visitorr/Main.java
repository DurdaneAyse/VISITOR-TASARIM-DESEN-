/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorr;

/**
 *
 * @author AYŞE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVisitor v = new HikayeGoster();
        IMesajIslem k = new NormalKullanici();

        k.accept(v);

        v = new MesajKaydetme();
        k.accept(v);

        k = new PremiumKullanici();
        k.accept(v);
        v = new HikayeGoster();
        k.accept(v);

    }

}
