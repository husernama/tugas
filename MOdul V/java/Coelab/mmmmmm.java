import java.util.ArrayList;
import java.util.Scanner;

public class mmmmmm {
    public static void mmmmmmmmmm(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();
        int index = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + index + ": ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                } else {
                    daftarNama.add(input);
                    index++;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        scanner.close();
    }
}
