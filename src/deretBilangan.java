
/**
 * Introduction to Programming
 * @author                        Team1 - DCBA
 *         Aldo Sunan Fudia		        -   2602233260
 *         M. Ilmi Nasrulloh		    -   2602233235
 *         Muliando Marpaung		    -   2602233393
 *         Nurul Amalia			        -   2602243993
 *         Saur Parlindungan Situmeang	-   2602239056
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deretBilangan {

    public static void main(String[] args) {
        String name, nim, repetisi;
        boolean nama = false;
        boolean namatds = false;
        boolean val_bilangan = false;
        boolean val_repetisi = false;
        boolean val_stop = false;
        int nimlength = 10;
        int minLengthNama = 1, maxLengthNama = 25;
        int jml_angka = 0;

        int no_genap = 0, no_ganjil = 0, b_genap = 0, jml_b_genap = 0, b_ganjil = 0,
                jml_b_ganjil = 0;
        List deretFibo = new ArrayList();
        int n1 = 0, n2 = 1, n3, i, count = 10;
        deretFibo.add(n1);
        deretFibo.add(n2);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\t Selamat Datang di Prgram DERET BILANGAN)");
            do {
                System.out.print("Masukan Nama Anda [1-25 Karakter]: ");
                name = input.nextLine();
                if (name.length() <= maxLengthNama && name.length()
                        >= minLengthNama) {
                    namatds = true;
                } else {
                    System.out.println("Karakter Nama Tidak Sesuai Ketentuan");
                }
            } while (!namatds);
            do {
                System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
                nim = input.nextLine();
                if (nim.length() == nimlength) {
                    nama = true;
                } else {
                    System.out.print("\n" + "Karakter NIM Tidak Sesuai Ketentuan" + "\n");
                }
            } while (!nama);
            System.out.println("\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "\n"
            );
            System.out.println("Registrasi Sukses.." + "\n");
            System.out.println(" Selamat datang " + name + " [ NIM : " + nim + "]..^^ " + "\n");
            System.out.println(" Mari belajar macam-macam deret bilangan..");
            System.out.println("\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "\n");
            System.out.println("Deret Bilangan\n"
                    + "###################### \n");
            System.out.println("\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "\n"
            );
            do {
                System.out.print("Masukkan Sembarang Angka [5..20] : ");
                jml_angka = input.nextInt();
                if (jml_angka >= 5 && jml_angka <= 20) {
                    val_bilangan = true;
                } else {
                    System.out.println("Angka Tidak Sesuai Ketentuan");
                }
            } while (!val_bilangan);
            System.out.println("\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "\n"
            );
//Perhitungan Bilangan Genap
            System.out.println("\n" + jml_angka + " Bilangan Genap: ");
            while (no_genap < jml_angka) {
                b_genap++;
                if (b_genap % 2 == 0 && no_genap <= jml_angka) {
                    System.out.print(b_genap + " ");

                    no_genap++;
                    jml_b_genap += b_genap;
                }
            }
            System.out.println("\n" + "Hasil Penjumlahan = " + jml_b_genap + "\n");
//INPUT Perhitungan Bilangan Ganjil
            System.out.print(jml_angka + " Bilangan Ganjil: " + "\n ");
            while (no_ganjil < jml_angka) {
                b_ganjil++;
                if (b_ganjil % 2 != 0 && no_ganjil <= jml_angka) {
                    System.out.print(b_ganjil + " ");
                    no_ganjil++;
                    jml_b_ganjil += b_ganjil;
                }
            }
            System.out.println("\n" + "Hasil Penjumlahan = " + jml_b_ganjil
                    + "\n");
            System.out.println(jml_angka + " Bilangan Fibonacci: " + "\n ");
//FIBONACCI
            int jumlahFibo = 1;
            for (i = 1; i < jml_angka; ++i) {
                n3 = n1 + n2;
                jumlahFibo += n3;
                deretFibo.add(n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.println(deretFibo);
            System.out.println("\n" + "Hasil Penjumlahan = " + jumlahFibo + "\n");
            do {
                System.out.print("Anda ingin mengulang [y/t]: ");
                repetisi = input.next();
                if ("t".equals(repetisi) || "T".equals(repetisi)
                        || "y".equals(repetisi) || "Y".equals(repetisi)) {
                    if ("t".equals(repetisi) || "T".equals(repetisi)) {
                        val_stop = true;
                    }
                    val_repetisi = true;
                } else {
                    System.out.println("\nKarakter Nama Tidak Sesuai Ketentuan");
                }
            } while (!val_repetisi);
            System.out.println("\n\n\n\n");
        } while (!val_stop);
    }
}

