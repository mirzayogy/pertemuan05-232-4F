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

        Mahasiswa yogy = new Mahasiswa("Yogy","002",3.79,144);
        yogy.tampilkanInfo();
        yogy.create();

        PersegiPanjang p = new PersegiPanjang();
        p.panjang = 73;
        p.lebar = 28;

        p.menampilkanLuas();
        System.out.println(p.menghitungLuas(93, 37));

    }
}

//Class
//Atribut
//Method
//Object
//Parameter
//Constructor

//1. Definisi
//2. Menulis dalam Java
//3. Mengenali dalam source code