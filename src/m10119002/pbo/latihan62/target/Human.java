/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan62.target;

import m10119002.pbo.latihan62.target.reference.LivingThing;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Class : Class untuk Human
 * other class
 * 
 */
public class Human extends LivingThing {
    private String nama;
    
    public String getNama() {return this.nama;}
    public void setNama(String nama) {this.nama = nama;}
    
    @Override
    public void walk(String nama)
    {super.walk(nama);}
}
