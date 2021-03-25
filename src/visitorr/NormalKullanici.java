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
public class NormalKullanici implements IMesajIslem {

    @Override
    public void kisibul(String kisi) {
        System.out.println("Normal kullanıcı için "+kisi + " adlı kişi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Normal kullanıcı için "+" mesaj alınıyor...");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Normal kullanıcı için "+msg + " mesajı göderiliyor.");
    }
public void accept(IVisitor v){
   v.visit(this);
}
}
