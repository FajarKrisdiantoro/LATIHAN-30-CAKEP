/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* 
Nama : Fajar Krisdiantoro
Nim  : 22205004
Prodi: TI REG MALAM
*/


package projectpbogit30;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ANSI escape sequences untuk warna teks
        String reset = "\u001B[0m";
        String merah = "\u001B[31m";
        String kuning = "\u001B[33m";
        String hijau = "\u001B[32m";
        String ungu = "\u001B[35m";
        String biru = "\u001B[34m";


        // Menampilkan teks berwarna
        System.out.println(merah + "Kamu " + hijau + "Ngerjain Sendiri " + kuning + "Latihan 17 sampe " + biru + "Latihan 30 ini ?" + reset);
        System.out.print(biru + "Jawab" + merah + "(Yoi/Enggak)");
        String Jawaban = input.next();
        
        if (Jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println(merah + "Cakep Bener. " + ungu + "Good Job");
        } else if (Jawaban.equalsIgnoreCase("Enggak")) {
            System.out.println(merah + "Tetep cakep sih\n " + biru + "Sing penting paham konsepnya yee.\n" + "keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid. Silakan masukkan 'Yoi' atau 'Enggak'.");
        }
    }
    
    
}