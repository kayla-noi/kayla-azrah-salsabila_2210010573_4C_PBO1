# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Orang`, `Dosen`, `Mahasiswa`, dan `Main` adalah contoh dari class.

```bash
public class Orang {
    ...
}

public class Dosen extends Orang {
    ...
}

public class Mahasiswa extends Orang {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];
        Dosen[] dosenArray = new Dosen[jumlahDosen];` adalah contoh pembuatan object.

```bash
Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];
        Dosen[] dosenArray = new Dosen[jumlahDosen];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `umur` adalah contoh atribut.

```bash
String nama;
String umur;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
  public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
public Dosen(String nama, int umur, String nidn) {
        super(nama, umur);  // Memanggil constructor dari superclass
        this.nidn = nidn;
    }
public Mahasiswa(String nama, int umur, String npm) {
        super(nama, umur);  // Memanggil constructor dari superclass
        this.npm = npm;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setUmur` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setUmur(int umur) {
        this.umur = umur;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, dan `getUmur` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

public int getUmur() {
        return umur;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `umur` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int umur;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Mahasiswa` mewarisi `Orang` dengan sintaks `extends`.

```bash
public class Mahasiswa extends Orang {
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahMahasiswa; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan jumlah mahasiswa: ");
int jumlahMahasiswa = scanner.nextInt();
scanner.nextLine();  

System.out.print("Masukkan jumlah dosen: ");
int jumlahDosen = scanner.nextInt();
scanner.nextLine();  
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];
        Dosen[] dosenArray = new Dosen[jumlahDosen];` adalah contoh penggunaan array.

```bash
Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];
Dosen[] dosenArray = new Dosen[jumlahDosen];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {         
System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
String nama = scanner.nextLine();
System.out.print("Masukkan umur mahasiswa " + (i + 1) + ": ");
int umur = scanner.nextInt();
scanner.nextLine();  // Konsumsi newline
System.out.print("Masukkan NPM mahasiswa " + (i + 1) + ": ");
String npm = scanner.nextLine();
mahasiswaArray[i] = new Mahasiswa(nama, umur, npm);
} catch (Exception e) {
System.out.println("Input tidak valid, silakan coba lagi.");
i--;  // Mengulangi iterasi jika input tidak valid
scanner.nextLine();  // Konsumsi input yang tidak valid
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **85** |

## Pembuat

Nama: Kayla azrah salsabila
NPM: 2210010573
