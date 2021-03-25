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
public interface IMesajIslem {
    void kisibul(String kisi);
    void mesajAl();
    void mesajGonder(String msg);
    void accept(IVisitor visitor);
}
