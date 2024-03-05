public class Mobil{
    String merk;
    String model;
    int tahunPembuatan;

    void menyalakanMesin(){

        System.out.println("Mesin mobil menyala");
    }
    String mengemudi(String arah){
        return "Mobl bergerak ke arah" + arah;
    }
    String mengeram(){
        return "Berhenti";
    }
    int topSpeed(int topSpeed){
        return topSpeed;
    }

}