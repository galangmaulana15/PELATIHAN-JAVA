package tugas_pertemuan3;

import java.util.ArrayList;
import java.util.HashMap;

public class KendaraanService {

    ArrayList<Kendaraan> daftar = new ArrayList<>();

    HashMap<String,String> kategori = new HashMap<>();

    public KendaraanService() {

        kategori.put("M","Mobil");
        kategori.put("R","Motor");

    }

    public void tambah(Kendaraan k){

        daftar.add(k);

    }

    public ArrayList<Kendaraan> getDaftar(){

        return daftar;

    }

    public void hapus(int index){

        daftar.remove(index);

    }

}