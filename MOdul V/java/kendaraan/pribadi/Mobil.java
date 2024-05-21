//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    public Mobil() {
    }

    public void Start() {
        System.out.println("Mobil " + this.getName() + " dinyalakan");
    }

    public void Stop() {
        System.out.println("Mobil " + this.getName() + " dimatikan");
    }

    public void Brake() {
        System.out.println("Mobil berhenti");
    }
}
