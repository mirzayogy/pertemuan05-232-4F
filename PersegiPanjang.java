public class PersegiPanjang {
    double panjang;
    double lebar;

    PersegiPanjang(){

    }

    //code convention
    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void menampilkanLuas(){
        System.out.println(this.panjang * this.lebar);
    }

    void menampilkanKeliling(){
        System.out.println(2*this.panjang + 2*this.lebar);
    }

    double menghitungLuas(double p, double l){
        return p*l;
    }
}
