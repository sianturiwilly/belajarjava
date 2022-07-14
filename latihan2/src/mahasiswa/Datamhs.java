package mahasiswa;

// Import library Scannner ke program
import java.util.Scanner;

public class Datamhs {
    public static void main(String[] args){
        
        // Deklarasi Variabel
        String nama, jurusan;
        int umur;
        Double ipk;

        // Membuat Scanner baru
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("::..Pendaftaran Mahasiswa Kampus Gunadarma..");
        System.out.print("Nama Mahasiswa :");

        // Menggunakan scanner dan menyimpan apa yang diketik ke dalam variabel.
        // Jika string gunakannextLine, jika integer nextInt, jika Double nextDouble.

        nama = input.nextLine();

        // Tampilkan output lagi.
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();

        System.out.print("Umur : ");
        umur = input.nextInt();

        System.out.print("IPK : ");
        ipk = input.nextDouble();

        // Tampilkan apa yang disimpan dalam variabel.
        System.out.println("----------------------------------");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Umur : " + umur);
        System.out.println("IPK : " + ipk);
    }

}