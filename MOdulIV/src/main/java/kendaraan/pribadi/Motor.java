//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    public Motor() {
    }

    @Override
    public void Start() {
        System.out.println("Motor " + this.getName() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
