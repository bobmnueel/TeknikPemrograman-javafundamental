/* Deskripsi
 * Nama     : Bob Manuel
 * NIM      : 221524038
 * Kelas    : D4-1B
 * 
 * Soal5    : BukaTutupJalan
 */ 

import java.util.Scanner;
import java.math.BigInteger;

public class Soal6{
    public static void main(String[] args) {
        BigInteger input1;
        BigInteger input2;

        Scanner keyboard = new Scanner(System.in);
        input1 = keyboard.nextBigInteger();
        input2 = keyboard.nextBigInteger();
        keyboard.close();

        System.out.println(input1.add(input2));
        System.out.println(input1.multiply(input2));
    }
}