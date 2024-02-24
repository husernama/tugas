import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputDataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelamin = scanner.nextLine();
        String kelamin = "";
        if (jenisKelamin.equalsIgnoreCase("P")) {
            kelamin = "Perempuan";
        } else if (jenisKelamin.equalsIgnoreCase("L")) {
            kelamin = "Laki-laki";
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            return;
        }

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString, formatter);

        LocalDate tanggalSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggalSekarang);
        int umurTahun = periode.getYears();
        int umurBulan = periode.getMonths() % 12;

        System.out.printf("\nData diri anda:\nNama : %s\nJenis Kelamin : %s\nUmur Anda %d tahun %d bulan\n", nama, kelamin, umurTahun, umurBulan);
    }
}