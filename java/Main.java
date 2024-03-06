import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim;
                    do {
                        nim = scanner.next();
                        if (nim.length() != 15) {
                            System.out.print("Nim Harus 15 Digit!!! Masukkan NIM mahasiswa: ");
                        }
                    } while (nim.length() != 15);
                    System.out.print("Masukkan jurusan mahasiswa: ");
                    scanner.nextLine();
                    String jurusan = scanner.nextLine();
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                    mahasiswaList.add(mahasiswa);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Data Mahasiswa:");
                    Mahasiswa.tampilUniversitas();
                    System.out.println("No.\tNama\t\tNIM\tJurusan");
                    System.out.println("----------------------------------------------------");
                    for (int i = 0; i < mahasiswaList.size(); i++) {
                        System.out.printf("%d\t%s\t%s\t%s\n", i + 1,
                                mahasiswaList.get(i).getNama(), mahasiswaList.get(i).getNim(), mahasiswaList.get(i).getJurusan());
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3)
                     }
}
