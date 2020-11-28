/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan62;

import m10119002.pbo.latihan62.target.Human;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi Living Thing
 * main class
 * 
 */
public class Program {
    public static void main(String[] args) {
        Human ningen = new Human();
        ningen.setNama("Firman Sahita");
        
        ningen.walk(ningen.getNama());
        ningen.breath(ningen.getNama());
        ningen.eat(ningen.getNama());
    }
}
