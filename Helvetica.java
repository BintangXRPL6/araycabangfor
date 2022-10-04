/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helvetica;

import java.util.Scanner;

public class Helvetica {

//    static int total = 0;
    public static void main(String[] args) {
        boolean ulang01 = true;
        boolean ulang02 = true;
        int total = 0;
        int operator, percabangan, harga;
        String pilihan, pesan;
        String[] makanan = {"1. Ayam goyeng", "2. Bebek goyeng", "3. Pecel lele", "4. Babi guling"};
        Scanner input = new Scanner(System.in);

        while (ulang01) {
            for (String i : makanan) {
                System.out.println(i);
            }
            operator = input.nextInt();

            if (operator == 1) {
                System.out.println(makanan[0]);
                System.out.println("Harga : Rp.15,000");
                System.out.println("Beli? ya/tidak");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("ya")) {
                    total += 15000;
                    System.out.println("Terima kasih");
                }else if (pilihan.equalsIgnoreCase("tidak")){
                    System.out.println("Kembali");
                    main(null);
                }
            }else if (operator == 2) {
                System.out.println(makanan[1]);
                System.out.println("Harga : Rp.18,000");
                System.out.print("Beli? ya/tidak");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("ya")) {
                    total += 18000;
                    System.out.println("Terima kasih");
                }else if (pilihan.equalsIgnoreCase("tidak")){
                    System.out.println("Kembali");
                    main(null);
                }
            }else if (operator == 3) {
                System.out.println(makanan[2]);
                System.out.println("Harga : Rp.13,000");
                System.out.print("Beli? ya/tidak");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("ya")) {
                    total += 13000;
                    System.out.println("Terima kasih");
                }else if (pilihan.equalsIgnoreCase("tidak")){
                    System.out.println("Kembali");
                    main(null);
                }
            }else if (operator == 4) {
                System.out.println(makanan[3]);
                System.out.println("Harga : Rp.150,000");
                System.out.print("Beli? ya/tidak");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("ya")) {
                    total += 150000;
                    System.out.println("Terima kasih");
                }else if (pilihan.equalsIgnoreCase("tidak")){
                    System.out.println("Kembali");
                    main(null);
                }
            }
            
            
            System.out.println("Ingin memesan lagi?");
            System.out.println("(ya/tidak)");
            pesan = input.next();

            switch (pesan) {
                case "ya":
                    System.out.println("Ok!");
                    break;
                case "tidak":
                    System.out.println("Terima kasih telah memesan");
                    ulang01 = false;
                    System.out.println("Total pesanan = " + total);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }//Ulang
    }//Main
}//Class
