/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan41;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program massa jenis kubus
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    private static Scanner scanner = new Scanner(System.in);
    private static String input = new String();
    private static boolean status;
    private static Kubus kubus = new Kubus();
    
    private static boolean cekParsing(String test) {
        try {
            Integer.parseInt(test);
            return true;
        } catch (NumberFormatException ex) {
            System.err.println("Pastikan tidak mengandung huruf atau simbol!");
            return false;
        } catch (Exception ex) {
            System.err.println("System error");
            return false;
        }
    }
    
    public static boolean masukkanSisi() {
        System.out.print("Sisi : ");
        input = scanner.nextLine();
        return cekParsing(input);
    }
    
    public static boolean masukkanMassa() {
        System.out.print("Massa : ");
        input = scanner.nextLine();
        return cekParsing(input);
    }
    
    public static void masukkanMassaJenis() {
        status = false;
        System.out.println("======Massa Jenis Kubus======");
        while(!status) status = masukkanSisi();
        kubus.setSisi(Integer.parseInt(input));
        status = false;
        while(!status) status = masukkanMassa();
        kubus.setMassa(Integer.parseInt(input));
        status = false;
    }
    
    public static void tampilHasilHitung() {
        System.out.println("======Hasil Perhitungan======");
        int volume = kubus.hitungVolume(kubus.getSisi());
        System.out.println("Volume : ".
                concat(Integer.toString(volume)));
        int massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
        System.out.println("Massa Jenis : ".
                concat(Integer.toString(massaJenis)));
    }
    
    public static void main(String[] args) {
        masukkanMassaJenis(); System.out.println("");
        tampilHasilHitung();
    }
}
