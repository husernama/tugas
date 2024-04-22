//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kendaraan;

public abstract class Kendaraan {
    String name;
    String model;
    String warna;
    int tahun;

    public Kendaraan() {
    }

    public abstract void Start();

    public abstract void Stop();

    public abstract void Brake();

    public void getInfo() {
        System.out.println("Kendaraan: " + this.name);
        System.out.println("Model : " + this.model);
        System.out.println("Warna : " + this.warna);
        System.out.println("Tahun : " + this.tahun);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
