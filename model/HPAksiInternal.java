package model;

public class HPAksiInternal {
    public static void main(String[] args) {
        Handphone h = new Handphone();
        h.setMerk("Banana");
        h.setHarga(1000);
        h.setStok(1);

        System.out.println(h.getMerk());
    }
}
