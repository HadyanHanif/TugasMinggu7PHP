// Tugas Pemrograman Berorientasi Obyek Inharitances
// Nama   = Ananda Hadyan Hanif 
// NIM    = A11.2021.13486
// Kelas  = A11.4412
// -------------------------------------------------

package Latihan2;
import java.util.Scanner;

// Superclass
class Karyawan
{
    String namakaryawan;
    int tunjangananak = 2500000;
    int jumlahharimasuk;
    int totalupah;
    int totalgaji;

    public void Input_Nama()
    {
        Scanner nama = new Scanner (System.in);

        // Input Nama
        System.out.print("Masukan Nama Karyawan = ");
        namakaryawan = nama.nextLine();   

        // Output Nama
        System.out.println("Nama Karyawan = " + namakaryawan);     
    }
}

public class InharitanceLatih2 
{
    public static void main(String[] args)
    {
            int pilihan;
            int lanjut;
            KaryawanTetap T = new KaryawanTetap();
            KarywanKontrak K = new KarywanKontrak();

            do{

            Scanner main = new Scanner (System.in);

            System.out.println("---- Sistem Penggajian Karyawan ----");
            System.out.println("====================================");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.println("==================================== \n");
            System.out.print("Masukan Golongan Anda = ");
            pilihan = main.nextInt();

            if(pilihan == 1)
            {

                T.Karyawan_Tetap();
            }

            else if(pilihan == 2)
            {
                K.Karyawan_Kontrak();
            }

            else
            {
                System.out.println("Data Golongan Tidak Tersedia");
            }

            System.out.println("1. Lanjut");
            System.out.println("2. Tidak Lanjut");
            System.out.print("Apakah Anda Ingin Mengulang Program = ");
            lanjut = main.nextInt();
            System.out.println("");  

            }while(lanjut==1);
            System.out.println("Terima Kasih");
    }
}
