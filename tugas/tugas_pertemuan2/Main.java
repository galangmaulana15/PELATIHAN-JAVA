package tugas_pertemuan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[100];
        
        int hitung = 0;
        boolean ulang = true;
        String jawab;

    while (ulang) {
            System.out.println("--- Input Data Mahasiswa Ke-" + (hitung + 1) + " ---");
            
            System.out.print("NIM         : ");
            String nim = input.nextLine(); 
            
            System.out.print("Nama        : ");
            String nama = input.nextLine();
            
            System.out.print("Nilai Tugas : ");
            double tugas = Double.parseDouble(input.nextLine());
            
            System.out.print("Nilai UTS   : ");
            double uts = Double.parseDouble(input.nextLine());
            
            System.out.print("Nilai UAS   : ");
            double uas = Double.parseDouble(input.nextLine());

            daftarMahasiswa[hitung] = new Mahasiswa(nim, nama, tugas, uts, uas);
            hitung++;

            System.out.print("Apakah ingin mengulang (y/t) : ");
            jawab = input.nextLine();
            
            if (jawab.equalsIgnoreCase("t")) {
                ulang = false; 
            }
            System.out.println();
        }

        NilaiService service = new NilaiService();

        System.out.println("===========================================");
        System.out.println("          REKAP DATA MAHASISWA");
        System.out.println("===========================================");

        for (int i = 0; i < hitung; i++) {
            Mahasiswa mhs = daftarMahasiswa[i];

            double nilaiAkhir = service.hitungNilaiAkhir(mhs.getNilaiTugas(), mhs.getNilaiUts(), mhs.getNilaiUas());
            
            char grade = NilaiService.tentukanGrade(nilaiAkhir);
            String status = NilaiService.tentukanStatusKelulusan(nilaiAkhir);

            System.out.println("NIM              : " + mhs.getNim());
            System.out.println("Nama             : " + mhs.getNama());
            System.out.println("Nilai Akhir      : " + nilaiAkhir);
            System.out.println("Grade            : " + grade);
            System.out.print("Keterangan Grade : ");
            NilaiService.tampilkanDeskripsiGrade(grade);
            System.out.println("Status Kelulusan : " + status);
            System.out.println("-------------------------------------------");
        }

        input.close();
    }
}