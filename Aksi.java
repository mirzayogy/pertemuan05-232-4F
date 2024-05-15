public class Aksi {
    public static void main(String[] args) {

        //Class object = new Constructor
        Mahasiswa mirza = new Mahasiswa();
        mirza.npm = "001";
        mirza.nama = "Mirza";
        mirza.ipk = 3.89;
        mirza.jumlahSks = 144;
        mirza.tampilkanInfo();
        mirza.create();

        Mahasiswa yogy = new Mahasiswa();
        yogy.tampilkanInfo();
        yogy.create();
    }
}
