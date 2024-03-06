public class Mahasiswa {
    private String nama;
    private String nim;
    private String universitas;


    public Mahasiswa(String nama, String nim, String universitas) {
        this.nama = nama;
        this.nim = nim;
        this.universitas = universitas;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }


    public static void tampilUniversitas() {
        System.out.println("Universitas: Universitas XYZ");
    }

}
