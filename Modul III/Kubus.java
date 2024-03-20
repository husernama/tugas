import java.util.Scanner;

import static java.lang.System.out;

public class Kubus extends BangunRuang implements input {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    Kubus(String name) {
        super(name);
    }


    @Override
    public void inputNilai(){
        super.luasPermukaan();
        System.out.println("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        out.println("Hasil luas permukaan: " + hasil);
        return hasil;
    }

    @Override
    public double volume(){
        double hasil = Math.pow(sisi, 3);
        super.volume();
        out.println("Hasil volume: " + hasil);
        return hasil;
    }
}