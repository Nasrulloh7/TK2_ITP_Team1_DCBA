
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
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String nama, nim, repetisi;
        int angka = 0;
        int hasil_genap = 0;
        int hasil_ganjil = 0;
        int bilangan1, bilangan2, hasil_fibonacci;        
        
        // Nomor 1 //
        // Meminta input nama dari user
        do{
          System.out.print("Masukkan Nama (1-25 karakter): ");
          nama = input.nextLine();
            // menampilkan pesan error jika Nama kurang dari 1 atau lebih dari 25 karakter
            if (nama.length() < 1 || nama.length() > 25){
                System.out.println("Nama harus memiliki panjang 1-25 karakter. Silakan coba lagi: ");
            }
        }while (nama.length() < 1 || nama.length() > 25);
        // Nomor 1 Selesai //
        
        
        // Nomor 2, Mulai di sini! //
        do {
            System.out.print("Masukkan NIM anda [harus 10 karakter]: ");
            nim = scanner.next();
        } while(nim.length() != 10 || !nim.matches("[0-9]+"));

        
        // Nomor 2 //
        
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        
        System.out.println("Registrasi Sukses..");
        System.out.printf("Selamat datang %s [NIM: %s ] \n", nama,nim);
        
        System.out.println("\nMari belajar macam-macam deret bilangan..\n");
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        // Nomor 3 //
        do {
            System.out.print("Masukkan Sembarang Angka (5..20) :");
            angka = scanner.nextInt();
        } while (angka < 5 || angka > 20);
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println ("Deret Bilangan");
        System.out.println ("##############\n");

        // Nomor 3 selesai //
        

         // Nomor 4 //
 
         System.out.println (angka + " Bilangan Genap : ");
         for (int a=2; a<=angka*2; a++){
             if (a%2==0) {
                 System.out.print(a+" ");
                 hasil_genap = hasil_genap + a;
             } 
         }
         System.out.print("\nHasil ialah :  " + hasil_genap);
 
 
         System.out.println ("\n" + angka + " Bilangan Ganjil : ");
         for (int a=1; a<=angka*2; a++){
             if (a%2!=0) {
                 System.out.print(a+" ");
                 hasil_ganjil = hasil_ganjil + a;
             } 
         }
         System.out.print("\nHasil ialah :  " + hasil_ganjil);
 
         System.out.println ("\n" + angka + " Bilangan Fibonacci : ");
         bilangan1 = 1;
         bilangan2 = 1;
         hasil_fibonacci = 0;
         for (int a=1; a<=angka; a++){
             System.out.print(bilangan1+", ");
             hasil_fibonacci = bilangan1 + bilangan2;
             bilangan2 = bilangan1;
             bilangan1 = hasil_fibonacci;
         }
         
         // Nomor 4 Selesai //


        //====Nomor 5 Mulai dari sini//
        do {
        System.out.print("Anda ingin mengulang [y/t]: ");
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
                    }
        while(!val_repetisi);
            System.out.println("\n\n\n\n");
                    }
        while(!val_stop);
    //====Nomor 5 Selesai//

        
    }
    
}
