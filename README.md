# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `pemasaran`, `pemasaranDetail`, dan `pemasaranBeraksi` adalah contoh dari class.

```bash
public class pemasaran {
    ...
}

public class pemasaaranDetail extends Mahasiswa {
    ...
}

public class pemasaranBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new pemasaranDetail(merek, tipe);` adalah contoh pembuatan object.

```bash
pmsrn[i] = new pemasaranDetail(merek, tipe);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merek` dan `tipe` adalah contoh atribut.

```bash
String merek;
String tipe;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `pemasaran` dan `pemasaranDetail`.

```bash
public pemasaran(String merek, String tipe) {
    this.merek = merek;
    this.tipe = tipe;
}

public pemasaranDetail(String merek, String tipe) {
    super(merek, tipe);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setMerek(String merek) {
    this.merek = merek;
}

public void setTipe(String tipe) {
    this.tipe = tipe;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerek`, `getTipe`, `getTahunDibuat`, `getHakmilik`, `getWarna`, dan `getNoseri` adalah contoh method accessor.

```bash
public String getMerek() {
    return Merek;
}

public String getTipe() {
    return Tipe;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `Merek` dan `Tipe` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merek;
private String tipe;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `pemasaranDetail` mewarisi `pemasaran` dengan sintaks `extends`.

```bash
public class pemasaranDetail extends pemasaran {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `pemasaran` merupakan overloading method `displayInfo` dan `displayInfo` di `pemasaranDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nTahun Dibuat: " + tahun dibuat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getHakmilik` dan seleksi `switch` dalam method `getWarna`.

```bash
public String getHakmilik() {
    if(getTipe().substring(2, 4).equals("10")){
        return "Pribadi";
    } else {
        return "Pribadi";
    }

    //return getTipe().substring(2, 4).equals("10") ? "Pribadi" : "Pribadi";
}

public String getWarna() {
    switch(getNpm().substring(4, 6)) {
        case "01":
            return "merah";
        case "02":
            return "biru";
        default:
            return "warna lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < pemasaran.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Merek Kendaraan ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData pemasaran:");
System.out.println(pemasaran.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `pemasaranDetail[] mahasiswas = new pemasaranDetail[2];` adalah contoh penggunaan array.

```bash
pemasaranDetail[] pemasaran = new pemasaranDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
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
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Teddy Kiswanto
NPM: 2110010150
