
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
        String nama, nim;

        
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
        
        // Nomor 2 //
        
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        
        System.out.println("Registrasi Sukses..");
        System.out.printf("Selamat datang %s [NIM: ] \n", nama);
        
        System.out.println("\nMari belajar macam-macam deret bilangan..\n");
    }
    
}
