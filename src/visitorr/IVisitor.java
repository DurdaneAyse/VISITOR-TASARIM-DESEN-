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
public interface IVisitor {
 void visit(NormalKullanici normal_k);  
 void visit(PremiumKullanici prem_k);
 void visit(GoldKullanici gold_k);   
 
}
