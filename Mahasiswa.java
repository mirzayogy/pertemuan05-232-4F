public class Mahasiswa{
    String nama;
    String npm;
    double ipk;
    int jumlahSks;


    //Constructor
    Mahasiswa(){

    }

    Mahasiswa(String nama, String npm, double ipk, int jumlahSks){
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
        this.jumlahSks = jumlahSks;
    }

    void tampilkanInfo(){
        System.out.println(nama);
        System.out.println(npm);
        System.out.println(ipk);
        System.out.println(jumlahSks);
    }

    void create(){
        System.out.println("INSERT INTO mahasiswa VALUES (" +
            "'" + this.nama +"',"+
            "'" + this.npm +"',"+
            this.ipk +","+
            this.jumlahSks +")");
    }

    void read(){
        System.out.println("SELECT * FROM mahasiswa");
    }

    void deleteAll(){
        System.out.println("DELET FROM mahasiswa");
    }

    void delete(String npm){
        System.out.println("DELETE FROM mahasiswa WHERE npm = " + npm);
    }

    void search(String keyword){
        System.out.println("SELECT * FROM mahasiswa WHERE nama like %" + keyword +"%");
    }
}