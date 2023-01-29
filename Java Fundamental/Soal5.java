/* Deskripsi
 * Nama     : Bob Manuel
 * NIM      : 221524038
 * Kelas    : D4-1B
 * 
 * Soal5    : BukaTutupJalan
 */ 

 import java.util.Scanner;

 public class Soal5 {
     public static void main(String[] args) {
         String[] input = new String[4];
         String gabungan;
         Long angka;
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < 4; i++) {
             input[i] = sc.next();
         }
         sc.close();
         gabungan = input[0] + input[1] + input[2] + input[3];
         angka = Long.parseLong(gabungan);
         if ((angka - 999999) % 5 == 1) {
             System.out.println("Berhenti");
         } else {
             System.out.println("Jalan");
         }
     }
 }
