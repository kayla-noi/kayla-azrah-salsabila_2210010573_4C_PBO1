package uas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // IO sederhana
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline

        // Array
        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];
        Dosen[] dosenArray = new Dosen[jumlahDosen];

        // Perulangan dan Error Handling untuk input mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            try {
               
 System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan umur mahasiswa " + (i + 1) + ": ");
                int umur = scanner.nextInt();
                scanner.nextLine();  // Konsumsi newline
                System.out.print("Masukkan NPM mahasiswa " + (i + 1) + ": ");
                String npm = scanner.nextLine();
                // Membuat objek Mahasiswa
                mahasiswaArray[i] = new Mahasiswa(nama, umur, npm);
            } catch (Exception e) {
                System.out.println("Input tidak valid, silakan coba lagi.");
                i--;  // Mengulangi iterasi jika input tidak valid
                scanner.nextLine();  // Konsumsi input yang tidak valid
            }
        }

        // Perulangan dan Error Handling untuk input dosen
        for (int i = 0; i < jumlahDosen; i++) {
            try {
                System.out.print("Masukkan nama dosen " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan umur dosen " + (i + 1) + ": ");
                int umur = scanner.nextInt();
                scanner.nextLine();  // Konsumsi newline
                System.out.print("Masukkan NIDN dosen " + (i + 1) + ": ");
                String nidn = scanner.nextLine();

                // Membuat objek Dosen
                dosenArray[i] = new Dosen(nama, umur, nidn);
            } catch (Exception e) {
                System.out.println("Input tidak valid, silakan coba lagi.");
                i--;  // Mengulangi iterasi jika input tidak valid
                scanner.nextLine();  // Konsumsi input yang tidak valid
            }
        }

        // Menampilkan data mahasiswa
        System.out.println("\nDetail Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            mahasiswa.tampilkan();
            System.out.println();
        }

        // Menampilkan data dosen1
        System.out.println("\nDetail Dosen:");
        for (Dosen dosen : dosenArray) {
            dosen.tampilkan();
            System.out.println();
        }

        scanner.close();
    }
}
