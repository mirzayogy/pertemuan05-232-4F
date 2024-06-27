package model;

public class Smartphone extends Handphone {
    String sistemOperasi;

    //overriding
    public void info() {
        System.out.println(this.getMerk());
        System.out.println(this.getHarga());
        System.out.println(this.getStok());
        System.out.println(this.sistemOperasi);
    }

    public void connectInternet(){

    }

    public void videoCall(){
        
    }
}
