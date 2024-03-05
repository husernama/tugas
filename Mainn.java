public class Motor {
    public static String modelMotor;
}

public class Mainn {
    public static void main(String[]args){
        Mobil mobilPertama = new Mobil();

        mobilPertama.merk ="BMW";
        System.out.println(mobilPertama.merk);

        mobilPertama.menyalakanMesin();
        String pesan = mobilPertama.mengemudi("Barat");
        System.out.println(pesan);
        System.out.println(mobilPertama.mengemudi("Timur");

        Motor.modelMotor();
        Mobil.model = "SUV";
        Motor.topSpeed = 100;
    }
}
