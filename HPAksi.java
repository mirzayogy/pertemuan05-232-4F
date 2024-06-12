import model.Handphone;

public class HPAksi {
    public static void main(String[] args) {
        Handphone h = new Handphone();
        h.setMerk("Salak");
        h.setHarga(2000);
        h.setStok(3);

        System.out.println(h.getMerk());

    }
}
