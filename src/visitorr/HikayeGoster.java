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
public class HikayeGoster implements IVisitor {

    @Override
    public void visit(NormalKullanici normal_k) {
  System.out.println("Normal kullanıcı için hikaye gösteriliyor..");

    }

    @Override
    public void visit(PremiumKullanici prem_k) {
   System.out.println("Premium kullanıcı için hikaye gösteriliyor..");

    }

    @Override
    public void visit(GoldKullanici gold_k) {
System.out.println("Gold kullanıcı için hikaye gösteriliyor..");
    }
    
}
