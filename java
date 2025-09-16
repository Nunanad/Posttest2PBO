//CODE MODEL

public class Karyawan {
        private int id;
    private String nama;
    private String jabatan;
    private double gaji;
   
    public Karyawan(int id, String nama, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
       
    }

    // Getter dan Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }

    public double getGaji() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Jabatan: " + jabatan + ", Gaji: " + gaji;
    }
}

//CODE SERVICE

import Model.Karyawan;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author asus
 */
public class LayananKaryawan {
    private List<Karyawan> daftarKaryawan = new ArrayList<>();

    // CREATE
    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    // READ
    public List<Karyawan> getSemuaKaryawan() {
        return daftarKaryawan;
    }

    // UPDATE
    public boolean updateKaryawan(int id, String nama, String jabatan, double gaji) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getId() == id) {
                k.setNama(nama);
                k.setJabatan(jabatan);
                k.setGaji(gaji);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean hapusKaryawan(int id) {
        return daftarKaryawan.removeIf(k -> k.getId() == id);
    }

    // SEARCH
    public Karyawan cariKaryawanById(int id) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getId() == id) {
                return k;
            }
        }
        return null;
    }
    
    public Karyawan cariKaryawanByNama(String nama) {
    for (Karyawan k : daftarKaryawan) {
        if (k.getNama().equalsIgnoreCase(nama)) {
            return k;
        }
    }
    return null;
}
}

// CODE MAIN

import Model.Karyawan;
import Service.LayananKaryawan;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LayananKaryawan layanan = new LayananKaryawan();

        while (true) {
            System.out.println("\n=== Sistem Manajemen Data Karyawan ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Semua Karyawan");
            System.out.println("3. Update Karyawan");
            System.out.println("4. Hapus Karyawan");
            System.out.println("5. Cari Karyawan (by ID)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jabatan: ");
                    String jabatan = scanner.nextLine();
                    System.out.print("Gaji: ");
                    double gaji = scanner.nextDouble();
                    layanan.tambahKaryawan(new Karyawan(id, nama, jabatan, gaji));
                    System.out.println("Karyawan berhasil ditambahkan!");
                    break;
                case 2:
                    for (Karyawan k : layanan.getSemuaKaryawan()) {
                        System.out.println(k);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID yang mau diupdate: ");
                    int updId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama baru: ");
                    String updNama = scanner.nextLine();
                    System.out.print("Jabatan baru: ");
                    String updJabatan = scanner.nextLine();
                    System.out.print("Gaji baru: ");
                    double updGaji = scanner.nextDouble();
                    if (layanan.updateKaryawan(updId, updNama, updJabatan, updGaji)) {
                        System.out.println("Data berhasil diupdate!");
                    } else {
                        System.out.println("Karyawan tidak ditemukan!");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan ID yang mau dihapus: ");
                    int delId = scanner.nextInt();
                    if (layanan.hapusKaryawan(delId)) {
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Karyawan tidak ditemukan!");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan ID karyawan: ");
                    int searchId = scanner.nextInt();
                    Karyawan ditemukan = layanan.cariKaryawanById(searchId);
                    if (ditemukan != null) {
                        System.out.println(ditemukan);
                    } else {
                        System.out.println("Karyawan tidak ditemukan!");
                    }
                    break;
                case 0:
                    System.out.println("Keluar program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
    LayananKaryawan layanan = new LayananKaryawan();

   
}


