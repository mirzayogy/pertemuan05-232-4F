package model;

public class Handphone {
    private String merk;
    private double harga;
    private int stok;
    
    public void info(){
        System.out.println(this.merk);
        System.out.println(this.harga);
        System.out.println(this.stok);
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getMerk(){
        return this.merk;
    }

    public double getHarga() {
        return this.harga;
    }

    public int getStok() {
        return this.stok;
    }
}
