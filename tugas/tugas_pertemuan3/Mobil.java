package tugas_pertemuan3;
public class Mobil extends Kendaraan {

    public Mobil(String kode, String merk, String warna, double harga) {
        super(kode, merk, warna, harga);
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== DATA MOBIL =====");
        super.tampilInfo();
    }
}