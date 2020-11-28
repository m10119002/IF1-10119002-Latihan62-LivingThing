/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan62.target.reference;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Class : Class untuk Bangun Ruang
 * other abstract class
 * 
 */
public abstract class LivingThing {
    public void walk(String nama)
    {System.out.println(nama.concat(" sedang berjalan"));}
    public void breath(String nama)
    {System.out.println(nama.concat(" Bernafas"));}
    public void eat(String nama)
    {System.out.println(nama.concat(" Makan"));}
}
