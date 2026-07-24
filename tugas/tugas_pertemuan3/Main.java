package tugas_pertemuan3;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static KendaraanService service = new KendaraanService();

    public static void main(String[] args) {

        int pilih;

        do {

            System.out.println("\n=== SISTEM MANAJEMEN DATA KENDARAAN ===");

            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Cari Data");
            System.out.println("6. Statistik");
            System.out.println("0. Keluar");

            System.out.print("Pilih : ");
            pilih=input.nextInt();

            switch(pilih){

                case 1:
                    tambah();
                    break;

                case 2:
                    tampil();
                    break;

                case 3:
                    ubah();
                    break;

                case 4:
                    hapus();
                    break;

                case 5:
                    cari();
                    break;

                case 6:
                    statistik();
                    break;

            }

        }while(pilih!=0);

    }

    static void tambah(){

        input.nextLine();

        System.out.print("Jenis(Mobil/Motor): ");
        String jenis=input.nextLine();

        System.out.print("Kode : ");
        String kode=input.nextLine();

        System.out.print("Merk : ");
        String merk=input.nextLine();

        System.out.print("Warna : ");
        String warna=input.nextLine();

        System.out.print("Harga : ");
        double harga=input.nextDouble();

        if(jenis.equalsIgnoreCase("Mobil")){

            service.tambah(new Mobil(kode,merk,warna,harga));

        }else{

            service.tambah(new Motor(kode,merk,warna,harga));

        }

    }

    static void tampil(){

        if(service.getDaftar().isEmpty()){

            System.out.println("Data kosong");

            return;

        }

        int no=1;

        for(Kendaraan k:service.getDaftar()){

            System.out.println("\nData ke-"+no++);

            k.tampilInfo();

        }

    }

    static void ubah(){

        tampil();

        System.out.print("Nomor data : ");

        int index=input.nextInt()-1;

        input.nextLine();

        Kendaraan k=service.getDaftar().get(index);

        System.out.print("Merk Baru : ");

        k.setMerk(input.nextLine());

        System.out.print("Warna Baru : ");

        k.setWarna(input.nextLine());

        System.out.print("Harga Baru : ");

        k.setHarga(input.nextDouble());

    }

    static void hapus(){

        tampil();

        System.out.print("Nomor Data : ");

        int index=input.nextInt()-1;

        service.hapus(index);

    }

    static void cari(){

        input.nextLine();

        System.out.print("Masukkan kode/merk : ");

        String key=input.nextLine();

        for(Kendaraan k:service.getDaftar()){

            if(k.getKodeKendaraan().equalsIgnoreCase(key)
            ||k.getMerk().equalsIgnoreCase(key)){

                k.tampilInfo();

            }

        }

    }

    static void statistik(){

        int mobil=0;

        int motor=0;

        double total=0;

        for(Kendaraan k:service.getDaftar()){

            if(k instanceof Mobil){

                mobil++;

            }else{

                motor++;

            }

            total+=k.getHarga();

        }

        System.out.println("Jumlah Mobil : "+mobil);

        System.out.println("Jumlah Motor : "+motor);

        System.out.println("Total Harga : "+total);

        if(service.getDaftar().size()>0){

            System.out.println("Rata-rata : "+(total/service.getDaftar().size()));

        }

    }

}