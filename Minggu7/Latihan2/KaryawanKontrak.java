package Latihan2;
import java.util.Scanner;

class KarywanKontrak extends Karyawan
{
    int upahharian = 150000;

    public void Karyawan_Kontrak()
    {
        Input_Nama();
        Scanner nama = new Scanner (System.in);
        Scanner Karyawan2 = new Scanner (System.in);

        System.out.print("Masukan Jumlah Hari Masuk = ");       
        jumlahharimasuk = Karyawan2.nextInt();

        totalupah = upahharian * jumlahharimasuk + tunjangananak;
        System.out.println("Total Upah Yang Diterima Sebesar = " + totalupah); 
    }

}
