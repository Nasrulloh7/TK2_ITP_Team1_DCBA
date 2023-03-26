
/**
 * Introduction to Programming
 * @author                        Team1 - DCBA
 *         Aldo Sunan Fudia		-   2602233260
 *         M. Ilmi Nasrulloh		-   2602233235
 *         Muliando Marpaung		-   2602233393
 *         Nurul Amalia			-   2602243993
 *         Saur Parlindungan Situmeang	-   2602239056
 */

import java.util.Scanner;

public class deretBilangan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama, nim, repetisi;
        boolean val_repetisi = false;
        boolean val_stop = false;
        int angka = 0;
        int hasil_genap, hasil_ganjil;
        int bilangan1, bilangan2, hasil_fibonacci,sum_fibonacci;
        
    do{
        // Nomor 1 //
        // Meminta input nama dari user
        do{
          System.out.print("\nMasukkan Nama (1-25 karakter): ");
          nama = input.nextLine();
        }while (nama.length() < 1 || nama.length() > 25);
        // Nomor 1 Selesai //
        
        // Nomor 2 //
        // Meminta input NIM dari user
        do {
            System.out.print("Masukkan NIM anda [harus 10 karakter]: ");
            nim = input.nextLine();
        } while(nim.length() != 10 || !nim.matches("[0-9]+"));
        // Nomor 2 //
        
        // Menampilkan hasil registrasi Nama dan NIM
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        
        System.out.println("Registrasi Sukses..");
        System.out.printf("Selamat datang %s [NIM: %s] \n", nama,nim);
        
        System.out.println("\nMari belajar macam-macam deret bilangan..\n");
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        // Nomor 3 //
        // Meminta input jumlah angka dari user
        do {
            System.out.print("Masukkan Sembarang Angka (5..20) : ");
            angka = input.nextInt();
        } while (angka < 5 || angka > 20);
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println ("Deret Bilangan");
        System.out.println ("##############\n");
        // Nomor 3 selesai //
        

        // Nomor 4 //
        // Menampilkan deret bilangan genap
        System.out.println (angka + " Bilangan Genap : ");
        hasil_genap = 0;
        for (int a=2; a<=angka*2; a++){
            if (a%2==0) {
                System.out.print(a+" ");
                hasil_genap += a;
            } 
        }
        System.out.printf("\nHasil Pemjumlahan : %s \n", hasil_genap);
 
        // Menampilkan deret bilangan ganjil
        System.out.println ("\n" + angka + " Bilangan Ganjil : ");
        hasil_ganjil = 0;
        for (int a=1; a<=angka*2; a++){
            if (a%2!=0) {
                System.out.print(a+" ");
                hasil_ganjil += a;
            } 
        }
        System.out.printf("\nHasil Pemjumlahan : %s \n", hasil_ganjil);
 
        // Menampilkan deret bilangan fibonacci
        System.out.println ("\n" + angka + " Bilangan Fibonacci : ");
        bilangan1 = 1;
        bilangan2 = 1;
        sum_fibonacci = 0;
        for (int a=0; a<angka; a++){
            hasil_fibonacci = bilangan1;
            System.out.print(hasil_fibonacci + " ");
            sum_fibonacci += hasil_fibonacci;
            bilangan1 = bilangan2;
            bilangan2 = hasil_fibonacci + bilangan1;             
        }
        System.out.printf("\nHasil Pemjumlahan : %s \n", sum_fibonacci );         
        // Nomor 4 Selesai //


        // Nomor 5 //
        // Memberi pilihan kepada user untuk mengulang program atau tidak
        do {
        System.out.print("\nAnda ingin mengulang [y/t]: ");
        repetisi = input.next();
            if("t".equals(repetisi) || "T".equals(repetisi)
                || "y".equals(repetisi) || "Y".equals(repetisi))
                    {
                         if("t".equals(repetisi) || "T".equals(repetisi))
                                {
                                val_stop=true;
                                }
                                val_repetisi=true;
                                }
                        else
                                {
                                System.out.println("\nKarakter Nama Tidak Sesuai Ketentuan"); 
                                }
            }while(!val_repetisi);
            System.out.println("\n");
        }while(!val_stop);
        // Nomor 5 Selesai //
        
    }
    
}
