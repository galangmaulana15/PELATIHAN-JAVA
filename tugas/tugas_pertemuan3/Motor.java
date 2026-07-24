package tugas_pertemuan3;
public class Motor extends Kendaraan {

    public Motor(String kode, String merk, String warna, double harga) {
        super(kode, merk, warna, harga);
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== DATA MOTOR =====");
        super.tampilInfo();
    }
}