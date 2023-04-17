package Latihan2;
import java.util.Scanner;

// SubClass
class KaryawanTetap extends Karyawan
{
    int gajipokok = 5000000;

    public void Karyawan_Tetap()
    {
        Input_Nama();
        Scanner nama = new Scanner (System.in);
        Scanner karyawan1 = new Scanner (System.in);

        totalgaji = gajipokok + tunjangananak;
        System.out.println("Total Gaji Yang Diterima Sebesar = " + totalgaji); 
    }
}