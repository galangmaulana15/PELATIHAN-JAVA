package tugas_pertemuan2;

public class Mahasiswa {
   
    private String nim;
    private String nama;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Mahasiswa(String nim, String nama, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public double getNilaiTugas() {
        return this.nilaiTugas;
    }

    public double getNilaiUts() {
        return this.nilaiUts;
    }

    public double getNilaiUas() {
        return this.nilaiUas;
    }
}