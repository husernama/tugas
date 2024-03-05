import java.util.Scanner;

public class Main {

    private static final String USERNAME_ADMIN = "admin";
    private static final String PASSWORD_ADMIN = "password";
    private static final String NIM_MAHASISWA = "202310370311316";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Selamat datang di program login!");
        System.out.println("Pilih jenis login: ");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.println("3. Keluar");

        int pilihan = scanner.nextInt();


        if (pilihan == 1) {
            System.out.println("Masukkan username: ");
            String username = scanner.next();
            System.out.println("Masukkan password: ");
            String password = scanner.next();

            if (username.equals(USERNAME_ADMIN) && password.equals(PASSWORD_ADMIN)) {
                System.out.println("Login sebagai Admin berhasil!");



            } else {
                System.out.println("Username atau password salah!");
            }
        }


        else if (pilihan == 2) {
            System.out.println("Masukkan NIM: ");
            String nim = scanner.next();

            if (nim.equals(NIM_MAHASISWA)) {
                System.out.println("Login sebagai Mahasiswa berhasil!");
            } else {
                System.out.println("NIM salah!");
            }
        }


        else {
            System.out.println("Pilihan tidak valid!");
        }
    }


}