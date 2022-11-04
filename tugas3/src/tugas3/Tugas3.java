/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

import java.util.Scanner;


public class Tugas3 {

    /**
     * @param args the command line arguments
     */
          public static void main(String[] args) throws Exception {
        programUtama();

    }

    static void programUtama() {

        Scanner inputKeyboard = new Scanner(System.in);
        int input;
        System.out.print("\033[H\033[2J");
        System.out.print("Masukan Bilangan :");
        if (inputKeyboard.hasNextInt()) {
            input = inputKeyboard.nextInt();
            if (input <= 6) {
                System.out.println("\nAngka harus lebih dari 6");
                ulang();
            } else if (input >= 100) {
                System.out.println("\nAngka tidak boleh lebih dari 100");
                ulang();
            } else if (input % 2 == 0) {
                System.out.println("\nAnda menginput bilangan Genap");
                akhirProgram();
            } else {
                System.out.println("\nAnda menginput bilangan Ganjil");
                akhirProgram();
            }
        } else {
            System.out.println("\nAnda Harus menginputkan angka");
        }
    }

    static void ulang() {
        Scanner confirmInput = new Scanner(System.in);
        String confirm;
        System.out.print("\nApakah anda ingin menginput kembali? (y/n) ");
        confirm = confirmInput.nextLine();
        if (confirm.equals("y")) {
            programUtama();
        } else {
            akhirProgram();
        }
    }

    static void akhirProgram() {
        System.out.println("\nProgram Selesai, Terimakasih.");
    }
    
}
