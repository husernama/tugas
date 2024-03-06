public class Main {
    public static void main(String[] args) {
        // Create Mahasiswa objects
        Mahasiswa mhs1 = new Mahasiswa("John Doe", "12345678", "Universitas XYZ");
        Mahasiswa mhs2 = new Mahasiswa("Jane Doe", "87654321", "Universitas XYZ");


        Mahasiswa.tampilUniversitas();

        // Print Mahasiswa data
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("NIM: " + mhs1.getNim());
        System.out.println("Universitas: " + mhs1.getUniversitas());

        System.out.println("\nNama: " + mhs2.getNama());
        System.out.println("NIM: " + mhs2.getNim());
        System.out.println("Universitas: " + mhs2.getUniversitas());
    }



}
