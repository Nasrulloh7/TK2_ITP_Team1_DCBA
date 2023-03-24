
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
