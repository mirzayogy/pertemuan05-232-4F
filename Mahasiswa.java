public class Mahasiswa{
    String nama;
    String npm;
    double ipk;
    int jumlahSks;

    void tampilkanInfo(){
        System.out.println(nama);
        System.out.println(npm);
        System.out.println(ipk);
        System.out.println(jumlahSks);
    }

    void create(){
        System.out.println("INSERT INTO..");
    }

    void read(){
        System.out.println("SELECT * FROM mahasiswa");
    }
}