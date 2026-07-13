import java.util.ArrayList;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) throws IOException {
//     System.out.println("Helloo, World!");
//     System.out.print("hello universe");

//     int age = 25;
//     System.out.printf("I am %d years old", age);

//     char golonganDarah = 'A';
//     int umur = 20;
//     double tinggi = 1.74;
//     boolean menikah = true;
//     String nama = "Galang";

//     // membuat ArrayList
//     ArrayList<String> listName = new ArrayList<>();

//     // menambahkan nilai ke elemen ArrayList
//     listName.add("Dilan");
//     listName.add("Milea");

//     // mengambil nilai ArrayList
//     System.out.println(listName.get(0));
//     System.out.println(listName.get(1));


//     public class Main {
//     public static void main(String[] args) throws IOException {
//       BufferedReader input =
//       new BufferedReader(new InputStreamReader(System.in));
//       String nama;
      
      
//     }
//   }


// }


public class Main {
  public static void main(String[] args) {

    // CARA MENJALANKAN PROGRAM DI JAVA
  //  javac Main.java adalah perintah untuk mengkompilasi program java
  //  java Main adalah perintah  untuk menjalankan program java yang sudah di kompilasi

    // Memakai printl untuk membuat teks lalu membuat baris baru
    System.out.println("Hello,World!");
    System.out.println("Galang");
    
    // Memakai print untuk membuat teks tanpa membuat baris baru
    System.out.print("Pelatihan pertama,"); System.out.print("Di Java!"); System.out.print("\nMantap!");
    System.out.println("");

    //  Memakai printf untuk membuat teks dengan format tertentu contohnya ("%d" untuk integer, "%s" untuk string, "%f" untuk float, dll)
    int umur = 20;
    System.out.printf("Umur Galang Adalah %d Tahun", umur);
    double tinggi = 1.74;
    System.out.printf("\nTinggi Galang Adalah %.2f Meter", tinggi);
    boolean menikah = true;
    System.out.printf("\nApakah Galang Sudah Menikah? %b", menikah);
    String nama = "Galang";
    System.out.printf("\nNama aku Adalah %s ", nama);
    System.out.println("");

    // Memakai print untuk membuat teks tanpa membuat baris baru
    System.out.print("Pelatihan pertama,"); System.out.print("Di Java!");

    BelajarArrayList.main(args);
  }

}

  class BelajarArrayList {
    public static void main(String[] args) {
      // Membuat ArrayList
      ArrayList<String> listName = new ArrayList<>();
      listName.add("Galang");
      listName.add("Dilan");
      listName.add("Milea");

      // Mengambil nilai ArrayList
      System.out.println(listName.get(0));
      System.out.println(listName.get(1));
      System.out.println(listName.get(2));

      // Menampilkan jumlah elemen ArrayList
      System.out.println("Jumlah Elemen ArrayList: " + listName.size());
    }
  }
