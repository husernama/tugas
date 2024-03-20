public class BangunRuang {
    private String name;

    public BangunRuang(String name) {
        this.name = name;
    }

    public BangunRuang() {

    }

    public void inputNilai() {
        System.out.println("Input nilai");
    }

    public double luasPermukaan() {
        System.out.println("Menghitung luas permukaan bangun " + name);
        return 0;
    }

    public double volume() {
        System.out.println("Menghitung volume bangun " + name);
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}