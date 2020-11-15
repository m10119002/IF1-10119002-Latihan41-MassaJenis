/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan41;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek kubus
 * 
 * 
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi() {return this.sisi;}
    public void setSisi(int sisi) {this.sisi = sisi;}
    public int getMassa() {return this.massa;}
    public void setMassa(int massa) {this.massa = massa;}
    public int hitungVolume(int parSisi) {return parSisi*parSisi*parSisi;}
    public int hitungMassaJenis(int parMassa, int volume) {return parMassa/volume;}
}
