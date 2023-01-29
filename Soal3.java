/* Deskripsi
 * Nama     : Bob Manuel
 * NIM      : 221524038
 * Kelas    : D4-1B
 * 
 * Soal3    : berhitung
 */ 


 import java.util.Scanner;

 public class Soal3 {
 
     public static void main(String[] args) {
         int angka1, angka2, hasil = 0;
         String operasi;
 
         Scanner keyboard = new Scanner(System.in);
 
         angka1 = keyboard.nextInt();
         operasi = keyboard.next();
         angka2 = keyboard.nextInt();
         keyboard.close();
 
         if (operasi.charAt(0) == '+') {
             hasil = angka1 + angka2;
         } else if (operasi.charAt(0) == '-') {
             hasil = angka1 - angka2;
         } else if (operasi.charAt(0) == '*') {
             hasil = angka1 * angka2;
         } else if (operasi.charAt(0) == '/') {
             hasil = angka1 / angka2;
         } else if (operasi.charAt(0) == '%') {
             hasil = angka1 % angka2;
         }
 
         System.out.print(hasil);
     }
 }
