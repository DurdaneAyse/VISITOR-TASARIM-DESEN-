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
public class GoldKullanici implements IMesajIslem{

    @Override
    public void kisibul(String kisi) {
        System.out.println("Gold kullanıcı için "+kisi + " adlı kişi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Gold kullanıcı için "+" mesaj alınıyor...");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Gold kullanıcı için "+msg + " mesajı göderiliyor.");
    }
    public void accept(IVisitor v){
   v.visit(this);
}
}
