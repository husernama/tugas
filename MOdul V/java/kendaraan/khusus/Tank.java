//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble {
    public Tank() {
    }

    public void Start() {
        System.out.println("Menyalakan " + this.getName() + " tank");
    }

    public void Stop() {
        System.out.println("Mematikan tank " + this.getName());
    }

    public void Brake() {
        System.out.println("Tank berhenti");
    }

    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }

    @Override
    public void shoot(String target) {

    }
}
